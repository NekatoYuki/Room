
public class Trapdoor extends Room
{

	public Trapdoor(int a, int b)
	{
		super(a, b);
	}
	@Override
	public void enterRoom(Person x)
	{
		occupant = x;
		x.setxLoc(0);
		x.setyLoc(0);
		System.out.println("You fell into a trapdoor! Sent back to square one!");
	}
}


