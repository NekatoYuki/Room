//contributors: Nicholas, Dave, Kenneth 
import java.util.Scanner;

public class Runner {
	

	public static boolean gameOn = true;
	public static boolean startup = true;
	public static void main(String[] args)
	{
		//opening text
		System.out.println("Welcome to our TBA");
		System.out.println("easy mode there are less enemies and the boss is easier");
		System.out.println("medium mode there are more and tougher enemies and the boss is harder");
		System.out.println("hard mode is where there are all types of enemies and the boss is the hardest");
		System.out.println("Instructions : use w a s d to move and i to check your stats such as HP/Attack/Gold");
		System.out.println("Warp zones are represented by [( )] and they teleport you to a random location. Use the location on the top of the map to see where you end up");
		System.out.println("Merchants a re represented by [  $] and they sell you items in exchange for gold");
		System.out.println("Enemy Rooms are represented by[  *] *being E/M/H based on the difficulty Easy/Medium/Hard");
		System.out.println("The final boss room is represented by [  B], defeat it to obtain the golden key to unlock the door to win");
		System.out.println("The winning room that is locked is represented by [(W)]");
		System.out.println("TIPS: can be acess via t I highly recommend reading it");
		System.out.println("Good Luck");
		System.out.println("Now Please choose board size: easy medium hard");
		
		/*
		 * the initial board size will be set to easy, only by selecting medium or hard will you actually change the size
		 */
		int boardSize = 5;
		Board board = new Board(boardSize, "easy");
		Scanner in = new Scanner(System.in);
		String chooseMode = in.nextLine();
		
		
		if (chooseMode.equals("medium"))
		{
			boardSize = 7;
			Board boardM = new Board (boardSize, "medium");
			board = boardM;

			
		}
		
		else if (chooseMode.equals("hard"))
		{
			boardSize = 10;
			Board boardH = new Board (boardSize, "hard");
			board = boardH;
	
		}
		
		else if (chooseMode.equals("easy"))
		{
			
		}
		
	
		//Setup player 1 and the input scanner
		//player starts at room 0,0 with base stats of 15 hp and 10 attack with 0 gold and 0 golden keys
		Person player1 = new Person (0,0, 15, 10, 0, 0);
		Room Startroom = board.getRooms()[0][0];
		Startroom.enterRoom(player1);
		while(gameOn)
		{
			
			board.printboard();
			System.out.println("Where would you like to move? (Choose W, A, S, D)");
			String move = in.nextLine();
			//press i to see your stats and gold and amount of golden key
			if (move.equals("i"))
			{
				System.out.println("Hp: " + player1.getProtec() + " " + "Attack: " + player1.getAttac() + " " + "Gold: " + player1.getGold() 
				+ "Golden Key(s) " + player1.getGoldenKey());
			}
			//press t for tips on the game
			if (move.equals("t"))
			{
				System.out.println("TIP 1: Combat is determined via our special algoritim. This is a turn base game that skips all the BS and skips "
						+ "straight to the results. Use this to determine if you can win the battle!");
				System.out.println("TIP 2: You can grind gold by re-entering the enemy room, you can also purchase multiple of the same items form the merchant");
			}
			else if(validMove(move, player1, board.getRooms()))
			{
				System.out.println("Your Loaction: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
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


