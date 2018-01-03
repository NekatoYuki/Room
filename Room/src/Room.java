
public class Room {
	Person occupant;
	int xLoc,yLoc;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	
	public void toPrint()
	{
		if(occupant!= null)
		{
			System.out.print("[");
			occupant.toPrint();
			System.out.print("  ]");
		}
		else
		{
			System.out.print("[   ]");
		}
	}
}


