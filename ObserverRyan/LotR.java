
public class LotR {

	public static void main(String[] args) 
	{
		EyeOfSauron eyeOfSauron = new EyeOfSauron();
        BadGuy saruman = new BadGuy(eyeOfSauron, "Saruman");
        BadGuy angmar = new BadGuy(eyeOfSauron, "Angmar");
        
        eyeOfSauron.setEnemies(1, 1, 2, 0); //hobbits, elves, dwarves, humans
        
        System.out.println("Saruman was defeated in battle and retreats!");
        saruman.defeated();

        eyeOfSauron.setEnemies(4, 2, 2, 100);
	}
}