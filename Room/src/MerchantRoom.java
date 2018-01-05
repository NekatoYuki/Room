//Nicholas Huynh shop to buy items
import java.util.Scanner;
public class MerchantRoom extends Room 
{

	public MerchantRoom(int k, int l) {
		super(k, l);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		System.out.println("You have found an old merchant, would you like to purchase something?(y/n)");		
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		//gets stats
		
		int gold = x.getGold();
		int attack = x.getAttac();
		int defense = x.getProtec();

		System.out.println("Gold Available: "+ gold);
		Scanner inputInMerch = new Scanner(System.in);
		String input = inputInMerch.nextLine();
		
		if(input.equals("y"))
		{
			System.out.println("ahh good...what do you want to buy?!");
			System.out.println("You may only purchase 1 thing at a time");
			
			//buying options
			
			System.out.println("1. Sword(20 gold)");
			System.out.println("2. Shield(30 gold)");
			System.out.println("3. Armor(40 gold)");
			System.out.println("4. Health potion (5 gold)");
			
			Scanner inputBuy = new Scanner(System.in);
			String inputb = inputBuy.nextLine();
			
			if(inputb.equals("1"))
			{
				
				//checks if they have enough gold
				if(gold>20)
				{
					System.out.println("This new sword will cost you 20 gold...(y/n?)");
					Scanner inputBuyR = new Scanner(System.in);
					String inputResponse = inputBuyR.nextLine(); 
					if(inputResponse.equals("y"))
					{
						System.out.println("...here is the sword of owinfor");
						System.out.println("*YOUR SWORD GAVE YOU +10 ATK!*");
						System.out.println("Gold Left: " + (gold-20));
						x.subtractGold(20);
						
						//adds to stats
						attack = attack +10;
						System.out.println("Attack: " + attack);
						x.addAttack(10);
					}
				}
				else
				{
					System.out.println("Sorry Kill more enemies for more gold to buy this item");
				}
				
			}
			else if(inputb.equals("2"))
			{
				
				//checks if they have enough gold
				if(gold>30)
				{
					System.out.println("This new shield will cost you 30 gold...(y/n?)");
					Scanner inputBuyR = new Scanner(System.in);
					String inputResponse = inputBuyR.nextLine(); 
					if(inputResponse.equals("y"))
					{
						System.out.println("...here is the shield of giefguwe");
						System.out.println("*YOUR SHIELD GAVE YOU +25 HP!*");
						System.out.println("Gold Left: " + (gold-30));
						x.subtractGold(30);
						
						//adds to stats
						defense= defense +10;
						System.out.println("HP: " + defense);
						x.addHp(10);
					}
				}
				else
				{
					System.out.println("Sorry Kill more enemies for more gold to buy this item");
				}
				
			}
			else if(inputb.equals("3"))
			{
				
				//checks if they have enough gold				
				if(gold>40)
				{
					System.out.println("This new armor will cost you 40 gold...(y/n?)");
					Scanner inputBuyR = new Scanner(System.in);
					String inputResponse = inputBuyR.nextLine(); 
					if(inputResponse.equals("y"))
					{
						System.out.println("woah...nice armor");
						System.out.println("*YOUR ARMOR GAVE YOU +35 HP!*");
						System.out.println("Gold Left: " + (gold-40));
						x.subtractGold(40);
				
						//adds to stats
						defense= defense +35;
						System.out.println("HP: " + defense);
						x.addHp(35);
					}
				}
				else
				{
					System.out.println("Sorry Kill more enemies for more gold to buy this item");
				}
			}
			if(inputb.equals("4"))
			{
				
				//checks if they have enough gold
				if(gold>5)
				{
					System.out.println("This Health potion will cost you 5 gold...(y/n?)");
					Scanner inputBuyR = new Scanner(System.in);
					String inputResponse = inputBuyR.nextLine(); 
					if(inputResponse.equals("y"))
					{
						System.out.println("...here is your health potion...drink up");
						System.out.println("*YOUR SWORD GAVE YOU +5 health!*");
						System.out.println("Gold Left: " + (gold-5));
						x.subtractGold(5);
						
						//adds to stats
						defense = defense +10;
						System.out.println("HP: " + defense);
						x.addHp(5);
					}
				}
				else
				{
					System.out.println("Sorry Kill more enemies for more gold to buy this item");
				}
				
			}
		}
		else
		{
			System.out.println("Have a nice day...try not to die to those goblins...");
		}
	}
	
	
	public void toPrint()
	{
		if(occupant!= null)
		{
			System.out.print("[xme]");
		}
		else
		{
			System.out.print("[ me]");
		}
	}
}
