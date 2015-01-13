/*
Team: The Nikola Teslas
Members: Ryan Babcock, Stacy Carlson, and Laura Humphreys 
*/
import java.util.Observable;
import java.util.Observer;

public class EyeOfSauron extends Observable
{
	private Enemies enemies;
	
	public void setEnemies(int hobbits, int elves, int dwarves, int men)
	{
		enemies = new Enemies(hobbits, elves, dwarves, men);	
		setChanged();
		notifyObservers(enemies);
	}
}
