//contributors: Dave
public class Boss 
{
	int Hp;
	int DMG;

	public Boss (int Hp, int DMG)
	{
		this.Hp = Hp;
		this.DMG = DMG;
	}

	public int getHp() {
		return Hp;
	}

	public void setHp(int hp) {
		Hp = hp;
	}

	public int getDMG() {
		return DMG;
	}

	public void setDMG(int dMG) {
		DMG = dMG;
	}
}
