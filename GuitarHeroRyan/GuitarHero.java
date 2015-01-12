import java.util.Scanner;

public class GuitarHero
{
	public static void main(String[] args)
	{
		GameCharacter player1 = new GameCharacterSlash();
        GameCharacter player2 = new GameCharacterHendrix();
        
        System.out.println("PLAYER 1");
        chooseGuitar(player1);
        
        System.out.println("PLAYER 2");
        chooseGuitar(player2);
        
        player1.playGuitar();
        player2.playGuitar();
        player1.playSolo();
        player2.playSolo();

        System.out.println("\nENCORE!!!");
        System.out.println("PLAYER 1 - Please choose a guitar for the ENCORE");
        chooseGuitar(player1);
        
        System.out.println("PLAYER 2 - Please choose a guitar for the ENCORE");
        chooseGuitar(player2);
        
        player1.setSmashesTheGuitar();
        player2.setJumpsOffTheStage();
        
        player1.playGuitar();
        player2.playGuitar();
        player1.playSolo();
        player2.playSolo();        
	}

	public static void chooseGuitar(GameCharacter character)
	{
		int option;
		Scanner kb = new Scanner(System.in);
		
		while(true)
		{
			try {
				System.out.println("Please choose a guitar!");
				System.out.printf("\n\t1. Gibson SG Fender\n\t2. Telecaster\n\t3. Gibson Flying V\n");
				
				option = kb.nextInt();
				
				if(option > 3 || option < 1)
					throw new IllegalArgumentException() ;
				
				switch(option)
				{
					case 1:
						character.setGibsonSG();
						return;
					case 2:
						character.setFenderTelecaster();
						return;
					case 3:
						character.setGibsonFlyingV();
						return;
				}
			}
			catch(Exception e) {
				System.out.println("You did not enter a value between 1-3\n");
				kb.nextLine();
			}
		}
	}
}