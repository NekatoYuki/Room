import java.util.Scanner;
public class Board 
{
	private Room[][] rooms;
	public  Board(Room [][] rooms)
	{
		this.rooms=rooms;
	}
		
	public void printboard()
	{

	
		for (Room[]i:rooms)
		{
			for (Room j : i)
				{
					j.toPrint();
				}
			System.out.println();
		}
		
		
	}
}
