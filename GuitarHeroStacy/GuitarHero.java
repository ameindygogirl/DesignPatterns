public class GuitarHero
{
	public static void main(String[] args)
	{
		GameCharacter player1;
		GameCharacter player2;
		
		player1 = new GameCharacterSlash();
		characterIntro(player1, "1");

		player2 = new GameCharacterHendrix();
		characterIntro(player2, "2");
	
		guitarPlaying(player1);
		guitarPlaying(player2);
		
		soloPlaying(player1);
		soloPlaying(player2);
		
		System.out.println();
		player1 = new GameCharacterAngus();
		characterIntro(player1, "1");
	
		player2 = new GameCharacterSlash();
		characterIntro(player2, "2");
		
		player1.setGuitar(new GibsonFlying());
		player1.setSolo(new SmashGuitar());
		player2.setGuitar(new GibsonSG());
		player2.setSolo(new GuitarFire());
		
		guitarPlaying(player1);
		guitarPlaying(player2);
		
		soloPlaying(player1);
		soloPlaying(player2);		
	}
	
	private static void characterIntro(GameCharacter player, String playerNum)
	{
		System.out.print("Player "+ playerNum + " is ");
		player.printName();
		System.out.println();
	}
	
	private static void guitarPlaying(GameCharacter player)
	{
		player.printName();
		System.out.print(": ");
		player.playGuitar();
	}
	
	private static void soloPlaying(GameCharacter player)
	{
		player.printName();
		System.out.print(": ");
		player.playSolo();
	}
}
