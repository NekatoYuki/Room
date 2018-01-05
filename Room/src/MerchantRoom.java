//contributors:  Dave
import java.util.Scanner;
public class MerchantRoom extends Room 
{

	public MerchantRoom(int k, int l) {
		super(k, l);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		System.out.println("You have found an old merchant, would you like to purchase something?");		
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		Scanner inputInMerch = new Scanner(System.in);
		String input = inputInMerch.nextLine();
		int gold = x.getGold();
		System.out.println("Gold Available: "+ gold);
	
	}
	
	public void toPrint()
	{
		if(occupant!= null)
		{
			System.out.print("[xme]");
		}
		else
		{
			System.out.print("[ me]");
		}
	}
}
