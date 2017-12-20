
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
		if(occupant!= null)
		{
<<<<<<< HEAD
			System.out.print("[(x]");
			occupant = null;
=======
			System.out.print("[(x)]");
>>>>>>> branch 'master' of https://github.com/NekatoYuki/Room.git
		}
		else
		{
<<<<<<< HEAD
			System.out.print("[()]");
=======
			System.out.print("[( )]");
>>>>>>> branch 'master' of https://github.com/NekatoYuki/Room.git
		}
	}
}


