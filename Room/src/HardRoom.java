//contributors: Nicholas.
import java.util.Random;
import java.util.Scanner;

public class HardRoom extends Room
{
	public HardRoom(int x, int y) 
	{
		super(x, y);
	}

	public void enterRoom(Person x)
	{
		System.out.println(rERR() + " Do you wish to fight or run?");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		Scanner inputInRoom = new Scanner(System.in);
		String input = inputInRoom.nextLine();
		
		// gets the attack and hp stat from the player
		int attack = x.getAttac();
		int hp = x.getProtec();
		//enemy hp and attack
		int enemyAttack= 15;
		int enemyHp = 50;
		boolean inRoom = true;
		while (inRoom)
		{
			if (input.equals("fight"))
			{
				
				if (EasyRoom.fightSequence(attack, hp, enemyHp, enemyAttack) == false) 
				{
					System.out.println("Game Over");
					inRoom = false;
					Runner.gameOff();
				}
				
				if (EasyRoom.fightSequence(attack, hp, enemyHp, enemyAttack) == true) 
				{
					System.out.println("Congratulations on defeating the enemy you looted 40 gold!");
					//gold acquired for beating the room
					int amount = 40;
					x.addGold(amount);
					inRoom = false;
				
				}
			}
			
			if (input.equals("run"))
			{
				System.out.println("You ran away!");
				inRoom = false;
			}
		}
	}
	//how to print the room
	public void toPrint()
	{
		if(occupant!= null)
		{
			System.out.print("[x H]");
			occupant = null;
		}
		else
		{
			System.out.print("[  H]");
		}
	}
	
	//a method that generates random responses when you enter the room
	private String rERR()
	{
		
		Random r = new Random ();
		
			return rerr [r.nextInt(rerr.length)];
		
	}
	
	private String [] rerr = {"You stumbled upon a minotaur with a giant battleaxe. it has hp of 50 and total damage of 15 per turn",
			"You disturbed a group of sleeping orcs, to say they were angry will be an understatement. They have a combined hp of 50 and total damage of 15 per turn"
			,"You discovered a mysterious creature. Wonder what that thing is. It has a hp of 50 and total damage of 15 per turn"
					};
}