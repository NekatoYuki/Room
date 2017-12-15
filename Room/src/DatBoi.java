
public class DatBoi extends Person
{
	
	
	public DatBoi(int Protec, int Attac, int xLoc, int yLoc) 
	{
		super (xLoc, yLoc, Protec, Attac);
	}
	
	public void printStats()
	{
		System.out.print("Boss Attack: " + Attac + "Boss Hp: "+ Protec);
	}
}
