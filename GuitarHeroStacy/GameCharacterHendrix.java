public class GameCharacterHendrix extends GameCharacter
{
	public GameCharacterHendrix()
	{
		setGuitar(new GibsonSG());
		setSolo(new SmashGuitar());
	}

	@Override
	public void printName()
	{
		System.out.print("Jimi Hendrix");		
	}
}
