//contributors:  Dave
import java.util.Random;
import java.util.Scanner;

public class BossRoom extends Room
{
	Boss boss;
	//boss room is made by entering the location and the boss 
	public BossRoom(int x, int y, Boss boss) 
	{
		super(x, y);
		this.boss = boss;
	}

	public void enterRoom(Person x)
	{
		System.out.println("The final boss you encountered is a " + rERR() + " it has hp of " +  boss.getHp() 
		+  " and total damage of " + boss.getDMG() + " per turn" + " Do you wish to fight or run?");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		Scanner inputInRoom = new Scanner(System.in);
		String input = inputInRoom.nextLine();
		
		// gets the attack and hp stat from the player
		int attack = x.getAttac();
		int hp = x.getProtec();
		
		int enemyAttack= boss.getDMG();
		int enemyHp = boss.getHp();
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
					System.out.println("Congratulations on defeating the Boss you obtained the golden key!");
					//Key acquired for beating the room
					int amount = 1;
					x.addKey(amount);
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
	//how to print the boss room
	public void toPrint()
	{
		if(occupant!= null)
		{
			System.out.print("[x B]");
			occupant = null;
		}
		else
		{
			System.out.print("[  B]");
		}
	}
	
	//a method that generates random bosses 
	private String rERR()
	{
		
		Random r = new Random ();
		
			return rerr [r.nextInt(rerr.length)];
		
	}
	//some actual enemies and then I decided to have some fun
	private String [] rerr = {"mighty Hydra", "deadly Dragon", "Fire elemental Lord, Giant", "That one boss in that one hard game everyone knows about", "Some Knight with a big ol Sword "
					};


}