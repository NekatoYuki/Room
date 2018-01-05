//contributors: Nicholas, Dave, Kenneth.
public class Board 
{
	private Room[][] rooms;
	private int size;
	public  Board(int size, String difficulty)
	{
		//the size of the board is based on size that is entered from the runner
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
		
	
		//Create a random WarpZone.
			while (warpzonerooms < 3)
			{
				
				int x = (int)(Math.random()*size);
				int y = (int)(Math.random()*size);
				if (x!= 0 || y!= 0)
				{
				rooms[x][y] = new WarpZone(x, y);
				}
			warpzonerooms++;
			}
		
			
		//Creates the amount of hard/easy/medium rooms based on selected difficulty
		
		if (difficulty.equals("easy"))
		{
			int i =0;
			int j =0;
			
			
			while (i < 4)
			{
				int g = (int)(Math.random()*size);
				int h = (int)(Math.random()*size);
				//makes it so you dont start in a enemy room
				if(g != 0 || h !=0 ) 
				{
				rooms[g][h] = new EasyRoom(g, h);
				}
				i++;
			}
		
			while (j < 2)
			{
				int g1 = (int)(Math.random()*size);
				int h1 = (int)(Math.random()*size);
				//makes it so you can't spawn in an enemy room
				if(g1 != 0 || h1 !=0) 
				{
				rooms[g1][h1] = new MediumRoom(g1, h1);
				}
				j++;
			}
			//generates a boss of easy difficulty and placing it in the center of the board
			Boss boss = new Boss(150, 15);
			rooms[2][2] = new BossRoom (2, 2, boss);
		}
	
		if (difficulty.equals("medium"))
		{
			int i =0;
			int p =0;
			int j =0;
			
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
		
			while (j < 6)
			{
				int g1 = (int)(Math.random()*size);
				int h1 = (int)(Math.random()*size);
				//makes it so you can't spawn in an enemy room
				if(g1 != 0 || h1 !=0) 
				{
				rooms[g1][h1] = new MediumRoom(g1, h1);
				}
				j++;
			}
			
			while (p < 3)
			{
				int g2 = (int)(Math.random()*size);
				int h2 = (int)(Math.random()*size);
				if(g2!= 0 || h2 !=0) 
				{
				rooms[g2][h2] = new HardRoom(g2, h2);
				}
				p++;
			}
			//generates a boss of medium difficulty and placing it in the center of the board
			Boss boss = new Boss(150, 15);
			rooms[3][3] = new BossRoom (3, 3, boss);
		
		}
		
		if (difficulty.equals("hard"))
		{
			int i =0;
			int p =0;
			int j =0;
			while (i < 10)
			{
				int g = (int)(Math.random()*size);
				int h = (int)(Math.random()*size);
				if(g != 0 || h !=0) 
				{
				rooms[g][h] = new EasyRoom(g, h);
				}
				i++;
			}
		
			while (j < 9)
			{
				int g1 = (int)(Math.random()*size);
				int h1 = (int)(Math.random()*size);
				//makes it so you can't spawn in an enemy room
				if(g1 != 0 || h1 !=0) 
				{
				rooms[g1][h1] = new MediumRoom(g1, h1);
				}
				j++;
			}
			
			while (p < 7)
			{
				int g2 = (int)(Math.random()*size);
				int h2 = (int)(Math.random()*size);
				if(g2 != 0 || h2 !=0) 
				{
				rooms[g2][h2] = new HardRoom(g2, h2);
				}
				p++;
			}
			
			//generates a boss of medium difficulty and placing it in the center of the board
			Boss boss = new Boss(300, 20);
			rooms[5][5] = new BossRoom (5, 5, boss);
		
		}
		//Creates Merchant Room
		rooms[1][1] = new MerchantRoom(1,1);
		//the winning room
		rooms[3][3] = new WinningRoom (3, 3);
	}
	
	// how to print the board
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
