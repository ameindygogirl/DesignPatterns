
public class Enemies
{
	private int hobbits;
	private int elves;
	private int dwarves;
	private int men;
	
	public Enemies(int hobbits, int elves, int dwarves, int men)
	{
		this.hobbits = hobbits;
		this.elves = elves;
		this.dwarves = dwarves;
		this.men = men;
	}
	
	public int getMen()
	{
		return men;
	}

	public int getDwarves()
	{
		return dwarves;
	}

	public int getElves()
	{
		return elves;
	}

	public int getHobbits()
	{
		return hobbits;
	}
}
