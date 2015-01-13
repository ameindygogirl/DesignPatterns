/*
Team: The Nikola Teslas
Members: Ryan Babcock, Stacy Carlson, and Laura Humphreys 
*/
import java.util.Observer;
import java.util.Observable;


public class BadGuy implements Observer
{
	Observable eye;
	private String name;
	private Enemies enemies;
	
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
			enemies = (Enemies)arg;
			displayEnemies();
		}
	}
	
	public void displayEnemies()
	{
		System.out.println(this.name + " saw "+ enemies.getHobbits() + " hobbits, " + enemies.getElves() + " elves, " + enemies.getDwarves() + " dwarves, " + enemies.getMen() +" men");
	}

}
