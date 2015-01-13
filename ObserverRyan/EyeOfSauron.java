import java.util.Observable;

public class EyeOfSauron extends Observable
{
	private int dwarfCount;
	private int elfCount;
	private int humanCount;
	private int hobbitCount;
	
	public void setEnemies(int hoCount, int eCount, int dCount, int huCount)
	{
		dwarfCount = dCount;
		elfCount = eCount;
		hobbitCount = hoCount;
		humanCount = huCount;

		setChanged();
		notifyObservers();
	}
	
	public void setDwarves(int count)
	{	
		if(dwarfCount == count) return;
		dwarfCount = count;
		setChanged();
		notifyObservers();
	}
	
	public void setElves(int count)
	{	
		if(elfCount == count) return;
		elfCount = count;
		setChanged();
		notifyObservers();
	}
	
	public void setHobbits(int count) 
	{	
		if(hobbitCount == count) return;
		hobbitCount = count;
		setChanged();
		notifyObservers();
	}
	
	public void setHumans(int count) 
	{	
		if(humanCount == count) return;
		humanCount = count;
		setChanged();
		notifyObservers();
	}
	public int getDwarfCount() {
		return dwarfCount;
	}
	
	public int getElfCount() {
		return elfCount;
	}
	
	public int getHobbitCount() {
		return hobbitCount;
	}
	
	public int getHumanCount() {
		return humanCount;
	}	
}