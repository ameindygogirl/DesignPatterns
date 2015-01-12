public abstract class GameCharacter
{
	String character;
	Guitar guitar;
	Solo solo;
	
	public void setGibsonSG() {
		this.guitar = new GibsonSG();
	}
	
	public void setFenderTelecaster() {
		this.guitar = new FenderTelecaster();
	}
	
	public void setGibsonFlyingV() {
		this.guitar = new GibsonFlyingV();
	}
	
	public void setJumpsOffTheStage() {
		this.solo = new JumpsOffTheStage();
	}
	
	public void setSmashesTheGuitar() {
		this.solo = new SmashesTheGuitar();
	}

	public void setPutGuitarOnFire() {
		this.solo = new PutGuitarOnFire();
	}

	protected void playGuitar()
	{
		System.out.print(character);
		guitar.playGuitar();
	}
	
	protected void playSolo()
	{
		System.out.print(character);
		solo.playSolo();
	}
}
