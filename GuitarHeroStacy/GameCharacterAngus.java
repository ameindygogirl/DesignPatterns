public class GameCharacterAngus extends GameCharacter
{
	public GameCharacterAngus()
	{
		guitarChoice = new GibsonFlying();
		soloChoice = new GuitarFire();
	}

	@Override
	public void printName()
	{
		System.out.print("Angus Young");		
	}
}
