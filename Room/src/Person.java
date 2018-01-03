
public class Person {
	
	int Protec;
	int Attac;
	int xLoc, yLoc;
	int gold;
	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}
	
	public int getProtec() {
		return Protec;
	}

	public void setProtec(int protec) {
		Protec = protec;
	}

	public int getAttac() {
		return Attac;
	}

	public void setAttac(int attac) {
		Attac = attac;
	}
	
	public Person (int xLoc, int yLoc, int Protec, int Attac, int gold)
	{
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.Protec = Protec;
		this.Attac = Attac;
		this.gold = gold;
	}

	public void toPrint()
	{
		System.out.print("x");
	}
	
	//methods to add gold/hp/and attack stats to the player after doing certain actions
	public void addGold(int amount)
	{
		this.gold= this.gold + amount;
	}
	public void addAttack(int amount)
	{
		this.Attac= this.Attac + amount;
	}
	public void addHp(int amount)
	{
		this.Protec= this.Protec + amount;
	}
}


