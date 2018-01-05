
public class Board 
{
	private Room[][] rooms;
	private int size;
	public  Board(int size, String difficulty)
	{
		this.size = size;
		this.rooms = new Room [size][size];
		int warpzonerooms = 0;
		
		for ( int a = 0; a<size; a++)
		{
			for ( int b = 0; b < size; b++)
			{
				rooms [a][b] = new Room(a,b);
			}
		} 
		/*Create a random TrapDoor.
		
		rooms[1][2] = new Trapdoor(1, 2);
		rooms[2][3] = new Trapdoor(2, 3);
	
		Create a random WarpZone.*/
			while (warpzonerooms < 3)
			{
				
				int x = (int)(Math.random()*size);
				int y = (int)(Math.random()*size);
				rooms[x][y] = new WarpZone(x, y);
			warpzonerooms++;
			}
		//Creates Merchant
			int k = (int)(Math.random()*size);
			int l = (int)(Math.random()*size);
			rooms[k][l] = new MerchantRoom(k,l);
			
		//Creates EasyRoom based on difficulty
		
		if (difficulty.equals("easy"))
		{
			int i =0;
			int j =0;
			while (i < 4)
			{
				int g = (int)(Math.random()*size);
				int h = (int)(Math.random()*size);
				//makes it so you can't spawn into a enemy room
				if(g != 0 || h !=0) 
				{
				rooms[g][h] = new EasyRoom(g, h);
				}
				i++;
			}
		
			while (j < 2)
			{
				int g = (int)(Math.random()*size);
				int h = (int)(Math.random()*size);
				//makes it so you can't spawn in an enemy room
				if(g != 0 || h !=0) 
				{
				rooms[g][h] = new MediumRoom(g, h);
				}
				j++;
			}
		}
	
		if (difficulty.equals("medium"))
		{
			int i =0;
			while (i < 5)
			{
				int g = (int)(Math.random()*size);
				int h = (int)(Math.random()*size);
				if(g != 0 || h !=0) 
				{
				rooms[g][h] = new EasyRoom(g, h);
				}
				i++;
			}
		}
		
		if (difficulty.equals("hard"))
		{
			int i =0;
			while (i < 6)
			{
				int g = (int)(Math.random()*size);
				int h = (int)(Math.random()*size);
				if(g != 0 || h !=0) 
				{
				rooms[g][h] = new EasyRoom(g, h);
				}
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
