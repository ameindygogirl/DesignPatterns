public class GuitarHero
{
	public static void main(String[] args)
	{
		GameCharacter player1;
		GameCharacter player2;
		
		player1 = new GameCharacterSlash();
		System.out.print("Player 1 is ");
		player1.printName();
		System.out.println();
		
		player2 = new GameCharacterHendrix();
		System.out.print("Player 2 is ");
		player2.printName();
		System.out.println();
		
		player1.printName();
		System.out.print(": ");
		player1.playGuitar();
		
		player2.printName();
		System.out.print(": ");
		player2.playGuitar();
		
		player1.printName();
		System.out.print(": ");
		player1.playSolo();
		
		player2.printName();
		System.out.print(": ");
		player2.playSolo();
		
		System.out.println();
		player1 = new GameCharacterAngus();
		System.out.print("Player 1 is ");
		player1.printName();
		System.out.println();
		
		player2 = new GameCharacterSlash();
		System.out.print("Player 2 is ");
		player2.printName();
		System.out.println();
		
		player1.setGuitar(new GibsonFlying());
		player1.setSolo(new SmashGuitar());
		player2.setGuitar(new GibsonSG());
		player2.setSolo(new GuitarFire());
		
		player1.printName();
		System.out.print(": ");
		player1.playGuitar();
		
		player2.printName();
		System.out.print(": ");
		player2.playGuitar();
		
		player1.printName();
		System.out.print(": ");
		player1.playSolo();
		
		player2.printName();
		System.out.print(": ");
		player2.playSolo();
		
	}
}
