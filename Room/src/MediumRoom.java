 import java.util.Random;
import java.util.Scanner;

public class MediumRoom extends Room
{
	public MediumRoom(int x, int y) 
	{
		super(x, y);
	}

	public void enterRoom(Person x)
	{
		System.out.println(rERR());
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
				
				if (EasyRoom.fightSequence(attack, hp, enemyHp, enemyAttack) == false) 
				{
					System.out.println("Game Over");
					inRoom = false;
					Runner.gameOff();
				}
				
				if (EasyRoom.fightSequence(attack, hp, enemyHp, enemyAttack) == true) 
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
				System.out.println("You ran away!");
				inRoom = false;
			}
		}
	}

	public void toPrint()
	{
		if(occupant!= null)
		{
			System.out.print("[x M]");
			occupant = null;
		}
		else
		{
			System.out.print("[  M]");
		}
	}
	
	//a method that generates random responses when you enter the room
	private String rERR()
	{
		
		Random r = new Random ();
		
			return rerr [r.nextInt(rerr.length)];
		
	}
	
	private String [] rerr = {"You found a group of hell hounds. They have a combined hp of 40 and total damage of 6" + 
			"You walked group of Treemen sucking water from the ground, they seem are quite angry. They have a combined hp of 40 and total damage of 6"
			+"You accidently stepped on the tail of a bull monster. They have a combined hp of 40 and total damage of 6"
					};
}