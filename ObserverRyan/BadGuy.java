import java.util.Observer;
import java.util.Observable;

public class BadGuy implements Observer {

	private EyeOfSauron leader;
	private String name;
	private int dwarfCount;
	private int elfCount;
	private int humanCount;
	private int hobbitCount;
	
	public BadGuy(EyeOfSauron leader, String name) {
		this.leader = leader;
		leader.addObserver(this);
		this.name = name;
	}
	
	public void defeated() {
		leader.deleteObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg)
	{
		if(o == leader) {
			dwarfCount 	= leader.getDwarfCount();
			elfCount 	= leader.getElfCount();
			hobbitCount = leader.getHobbitCount();
			humanCount 	= leader.getHumanCount();
			this.display();
		}
	}
	
	public void display()
	{
		System.out.print(name);
		System.out.printf(" see's %d dwarves, %d humans, %d elves, and %d hobbits.\n", dwarfCount, humanCount, elfCount, hobbitCount);
	}
}
