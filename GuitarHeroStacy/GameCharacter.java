public abstract class GameCharacter 
{
	private GuitarChoice guitarChoice;
	private SoloChoice soloChoice;
	
	public void setGuitar(GuitarChoice gc)
	{
		guitarChoice = gc;
	}
	
	public void setSolo(SoloChoice sc)
	{
		soloChoice = sc;
	}
	
	public void playGuitar()
	{
		guitarChoice.play();
	}
	
	public void playSolo()
	{
		soloChoice.solo();
	}
	
	public abstract void printName();
}
