
public class WarpZone extends Room {
	
	Room[][] building = new Room[5][5];
	boolean isIn = false;
	public WarpZone(int c, int d)
	{
		super(c, d);
	}
	@Override
	public void enterRoom(Person x)
	{
		isIn = true;
		occupant = x;
		x.setxLoc((int)(Math.random()*building.length));
		x.setyLoc((int)(Math.random()*building.length));
		System.out.println("You have entered a WarpZone! Sending player to random room...");
		
	}

	public void toPrint()
	{
		if (isIn == true) 
		{
			System.out.print("[O*]");
		}
		else if (isIn == false)
		{
			System.out.print("[O ]");
		}
	}
}


