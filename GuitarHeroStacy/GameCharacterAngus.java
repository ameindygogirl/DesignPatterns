public class GameCharacterAngus extends GameCharacter
{
	public GameCharacterAngus()
	{
		setGuitar(new GibsonFlying());
		setSolo(new GuitarFire());
	}

	@Override
	public void printName()
	{
		System.out.print("Angus Young");		
	}
}
