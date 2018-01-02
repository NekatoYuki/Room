
public class Board 
{
	private Room[][] rooms;
	private int size;
	public  Board(int size)
	{
		this.size = size;
		this.rooms = new Room [size][size];
		int x = (int)(Math.random()*size);
		int y = (int)(Math.random()*size);

		for ( x = 0; x<size; x++)
		{
			for ( y = 0; y < size; y++)
			{
				rooms [x][y] = new Room(x,y);
			}
		} 
		/*Create a random TrapDoor.
		rooms[0][1] = new Trapdoor(0, 1);
		rooms[1][2] = new Trapdoor(1, 2);
		rooms[2][3] = new Trapdoor(2, 3);
	
		//Create a random WarpZone.
		rooms[size -1 ][size -1] = new WarpZone(size-1, size-1);
		rooms[0][size -1 ] = new WarpZone(0, size-1);
		rooms[size -1 ][0] = new WarpZone(size-1, 0);
		*/
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
