
public class WarpZone extends Room {
	
	Room[][] building = new Room[5][5];

	public WarpZone(int c, int d)
	{
		super(c, d);
	}
	@Override
	public void enterRoom(Person x)
	{
		occupant = x;
		x.setxLoc((int)(Math.random()*building.length));
		x.setyLoc((int)(Math.random()*building.length));
		System.out.println("You have entered a WarpZone! Sending player to random room...");
		
	}

}


