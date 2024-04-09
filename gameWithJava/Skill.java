public class Skill {
	private String skillName;
	private int damage;
	private int manaUse;
	Skill(String name, int dmg, int costMana){
		skillName = name;
		manaUse = costMana; 
		damage = dmg;
	}
	public String getSkillName(){
		return skillName;
	}
	public int getDamage(){
		return damage;
	}
	public int getmanaUse(){
		return manaUse;
	}
}
class FireBall extends Skill{
	FireBall(){
		super("fire ball", 150, 30);
		int burnDamage = 30;
	}
}
class IceBreak extends Skill{
	IceBreak(){
		super("ice break", 250, 60);
		int freezeTurn = 2;
	}
}
