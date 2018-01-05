// Contributor: Nicholas
import java.util.Random;

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
		System.out.println(rERR());
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
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

	// this makes it so when you walk into the room, random responses are generated
		private String rERR()
		{
			
			Random r = new Random ();
			
				return rerr [r.nextInt(rerr.length)];
			
		}
		
		private String [] rerr = {"You walked into a plain old room", "You entered a dark room", "you entered a room with ntohing in it",
				"You found a picture of what seems to be a family", "You entered a room only to find nothing but cobwebs", "You found a rusty and damaged saber"
				,"You found a a weird creature but it ran away before you could figure out what it was"
						};

}


