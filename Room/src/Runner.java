import java.util.Scanner;

public class Runner {
	

	public static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		
		System.out.println("choose board boardSize:  medium *purchase OtHeR gAmE mOdE DLC to unlock hard mode* *Purchase all Surprise Boxes to unlock easy mode*");
		int boardSize = 5;
		Board board = new Board(boardSize);
		Scanner in = new Scanner(System.in);
		if (in.nextLine().equals("medium"))
		{
			boardSize = 7;
			Board boardM = new Board (boardSize);
			board = boardM;

			
		}
		
		else if (in.nextLine().equals("hard"))
		{
			boardSize = 10;
			Board boardH = new Board (boardSize);
			board = boardH;
	
		}
		
		else
		{
			
		}

	
		//Setup player 1 and the input scanner
		Person player1 = new Person (0,0, 10, 10);
		Room Startroom = board.getRooms()[0][0];
		Startroom.enterRoom(player1);
	
		while(gameOn)
		{
			board.printboard();
			System.out.println("Where would you like to move? (Choose W, A, S, D)");
			String move = in.nextLine();
			if(validMove(move, player1, board.getRooms()))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
			
			
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "d":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "a":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	

}


