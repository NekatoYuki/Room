
public class BausRoom extends Room
{
	DatBoi baus;
	public BausRoom(int x, int y, DatBoi baus) 
	{
		super(x, y);
		this.baus=baus;
	}

	public boolean escapeRoom (Person x, DatBoi baus1)
	{
		if (x.getAttac() > baus1.getProtec()) 
		{
			return true;
		}
		return false;
	}
	public void enterRoom(Person x, DatBoi baus1) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("BAUS");
		if (escapeRoom(x, baus1) == true)
		{
			System.out.print("ya win");
		}
	}
	public void toPrint()
	{
		System.out.print("[  ]");
	}
}
