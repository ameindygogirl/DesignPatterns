import java.util.Observer;
import java.util.Observable;


public class BadGuy implements Observer
{
	Observable eye;
	private String name;
	private int hobbits;
	private int elves;
	private int dwarves;
	private int men;
	
	public BadGuy(EyeOfSauron eye, String name)
	{
		this.eye = eye;
		eye.addObserver(this);
		this.name = name;
	}

	public void defeated()
	{
		eye.deleteObserver(this);		
	}

	@Override
	public void update(Observable obs, Object arg)
	{
		if(obs instanceof EyeOfSauron)
		{
			EyeOfSauron eye = (EyeOfSauron)obs;
			this.hobbits = eye.getHobbits();
			this.elves = eye.getElves();
			this.dwarves = eye.getDwarves();
			this.men = eye.getMen();
			displayEnemies();
		}
	}
	
	public void displayEnemies()
	{
		System.out.println(this.name + " saw "+ this.hobbits + " hobbits, " + this.elves + " elves, " + this.dwarves + " dwarves, " + this.men +" men");
	}

}
