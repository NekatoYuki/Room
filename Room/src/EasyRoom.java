import java.util.Scanner;

public class EasyRoom extends Room
{
	public EasyRoom(int x, int y) 
	{
		super(x, y);
	}

	public void enterRoom(Person x)
	{
		System.out.println("You found 3 goblins. They have total hp of 30 and total damge of 3 per turn."
				+ " Do you wish to fight or run?");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		Scanner inputInRoom = new Scanner(System.in);
		String input = inputInRoom.nextLine();
		
		// gets the attack and hp stat from the player
		int attack = x.getAttac();
		int hp = x.getProtec();
		//since this is an easy room, the enemy always have the same amount of hp and attack
		int enemyAttack= 3;
		int enemyHp = 30;
		boolean inRoom = true;
		while (inRoom)
		{
			if (input.equals("fight"))
			{
				
				if (fightSequence(attack, hp, enemyHp, enemyAttack) == false) 
				{
					System.out.println("Game Over");
					inRoom = false;
					Runner.gameOff();
				}
				
				if (fightSequence(attack, hp, enemyHp, enemyAttack) == true) 
				{
					System.out.println("Congrats");
					//gold acquired for beating the room
					int amount = 10;
					x.addGold(amount);
					inRoom = false;
				
				}
			}
			
			if (input.equals("run"))
			{
				inRoom = false;
			}
		}
	}

	public void toPrint()
	{
		if(occupant!= null)
		{
			System.out.print("[x g]");
			occupant = null;
		}
		else
		{
			System.out.print("[  g]");
		}
	}
	
	public static boolean fightSequence(int attack, int hp, int enemyHp, int enemyAttack)
	{
		// amount of turns it takes for the enemy to kill you
		int enemyRounds = hp/enemyAttack;
		
		// amount of turns it takes for the play to take down the enemy
		int playerRounds = enemyHp/attack;
		
		/*
		 * since in this TBA the enemy always goes first, 
		 * if the amount of turns it takes for the enemy to kill you is the same 
		 * as the amount of turns it takes for you to kill the enemy, you lose
		 */
		if (enemyRounds == playerRounds)
		{
			return false;
		}
		
		/*
		 * if the enemy kill you before you do, you lose
		 */
		else if (enemyRounds <= playerRounds)
		{
			return false;
		}
		
		/*
		 * if you kill the enemy before they kill you, you win
		 */
		else if (enemyRounds >= playerRounds)
		{
			return true;
		}
		
		return false;
	
	}
}
