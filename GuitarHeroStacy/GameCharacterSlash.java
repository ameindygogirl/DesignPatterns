public class GameCharacterSlash extends GameCharacter
{
	public GameCharacterSlash()
	{
		setGuitar(new Fender());
		setSolo(new JumpStage());
	}

	@Override
	public void printName()
	{
		System.out.print("Slash");	
	}
}
