
public class Board 
{
	private Room[][] rooms;
	private int size;
	public  Board(int size, String difficulty)
	{
		this.size = size;
		this.rooms = new Room [size][size];
		int i =0; 
		/*
		int x = (int)(Math.random()*size);
		int y = (int)(Math.random()*size);
		*/
		for ( int a = 0; a<size; a++)
		{
			for ( int b = 0; b < size; b++)
			{
				rooms [a][b] = new Room(a,b);
			}
		} 
		//Create a random TrapDoor.
		
		rooms[1][2] = new Trapdoor(1, 2);
		rooms[2][3] = new Trapdoor(2, 3);
	
		//Create a random WarpZone.
			while (i < 3)
			{
				int x = (int)(Math.random()*size);
				int y = (int)(Math.random()*size);
				rooms[x][y] = new WarpZone(x, y);
			i++;
			}
		
		//Creates EasyRoom based on difficulty
		
		if (difficulty.equals("easy"))
		{
			while (i < 4)
			{
				int g = (int)(Math.random()*size);
				int h = (int)(Math.random()*size);
				rooms[g][h] = new EasyRoom(g, h);
			i++;
			}
		}
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


	public Room[][] getRooms() {
		return rooms;
	}


	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}

	

}
