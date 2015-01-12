/*
Team: The Nikola Teslas
Members: Ryan Babcock, Stacy Carlson, and Laura Humphreys 
*/
public abstract class GameCharacter {
	
	private String name;
	private Guitar guitar;
	private Solo solo;
	
	public GameCharacter(String name, Guitar guitar, Solo solo)
	{
		this.name = name;
		this.guitar = guitar;
		this.solo = solo;
	}
	
	public void setGuitar(Guitar newGuitar)
	{
		this.guitar = newGuitar;
	}
	
	public void setSolo(Solo newSolo)
	{
		this.solo = newSolo;
	}
	
	public void playGuitar()
	{
		System.out.print(this.name);
		this.guitar.playGuitar();
	}
	
	public void playSolo()
	{
		System.out.print(this.name);
		this.solo.playSolo();
	}
}
