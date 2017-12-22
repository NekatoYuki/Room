import java.util.Scanner;
public class Board 
{
	private Room[][] rooms;
	private int size;
	public  Board(int size)
	{
		this.size = size;
		
		int x = (int)(Math.random()*size);
		int y = (int)(Math.random()*size);

		for ( x = 0; x<size; x++)
		{
			for ( y = 0; y < size; y++)
			{
				rooms [x][y] = new Room(x,y);
			}
		} 
		//Create a random TrapDoor.
		rooms[x][y] = new Trapdoor(0, 1);
		rooms[x][y] = new Trapdoor(1, 2);
		rooms[x][y] = new Trapdoor(2, 3);
		
		//Create a random WarpZone.
		rooms[4][4] = new WarpZone(size-1, size-1);
		rooms[0][4] = new WarpZone(0, size-1);
		rooms[4][0] = new WarpZone(size-1, 0);
		
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
