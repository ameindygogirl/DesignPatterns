public class GameCharacterSlash extends GameCharacter
{
	public GameCharacterSlash()
	{
		guitarChoice = new Fender();
		soloChoice = new JumpStage();
	}

	@Override
	public void printName()
	{
		System.out.print("Slash");	
	}
}
