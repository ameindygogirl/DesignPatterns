/*
Team: The Nikola Teslas
Members: Ryan Babcock, Stacy Carlson, and Laura Humphreys 
*/
public class GuitarHero {

	public static void main(String[] args) {
		GameCharacter player1 = new GameCharacterSlash();
		GameCharacter player2 = new GameCharacterHendrix();
		player1.playGuitar();
		player2.playGuitar();
		player1.playSolo();
		player2.playSolo();
		System.out.println("Player 1 changes guitars.");
		player1.setGuitar(new FlyingVGuitar());
		player1.playGuitar();
		System.out.println("Player 2 changes characters.");
		player2 = new GameCharacterYoung();
		player2.playGuitar();
		player2.playSolo();
		System.out.println("Player 1 changes solos.");
		player1.setSolo(new SmashSolo());
		player1.playSolo();

	}

}
