//contributors:  Kenneth
public class WinningRoom extends Room {



	public WinningRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found the winning room!");
		//can only win if you beat the boss and obtained the key
		int key = x.getGoldenKey(); 
		if (key  >= 1) 
		{
			System.out.println("You opened the door with the key. Congratulations on beating the game You Win!");
			Runner.gameOff();
		}
		
		if(key<=1)
		{
			System.out.println("The door is locked, you need a golden key");
		}
	}
	//how to print the board
	public void toPrint()
	{
		if(occupant!= null)
		{
			System.out.print("[X W]");
		}
		else
		{
			System.out.print("[(W)]");
		}
	}
}


