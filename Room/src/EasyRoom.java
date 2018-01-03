
public class EasyRoom extends Room
{
	public EasyRoom(int x, int y) 
	{
		super(x, y);
	}

	public void enterRoom(Person x)
	{
		System.out.println("You found some weak ass enemies xd");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
	}



}
