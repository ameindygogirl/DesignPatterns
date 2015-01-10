public class GameCharacterHendrix extends GameCharacter
{
	public GameCharacterHendrix()
	{
		guitarChoice = new GibsonSG();
		soloChoice = new SmashGuitar();
	}

	@Override
	public void printName()
	{
		System.out.print("Jimi Hendrix");		
	}
}
