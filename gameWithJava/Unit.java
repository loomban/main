public class Unit{
	//name of the unit
	String kianuName;
	// strength is the variable that has impact on units damage
	private int strength;
	//defence is the variable that has impact on damage the unit gets
	private int defence;
	// mana makes the unit have magic or not and reduces after using magic
	private int mana;
	// this makes the unit heal the Hp of a unit by the variable amount
	private int healpow;
	// determines if the unit can perform magic
	private boolean magic; 
	// gives Hp, Hp is how much health the unit has
	private int unitHp;
	Skill[] usableMagic;
	//using 1 for unit counter for user friendliness
	private static int unitCounter = 1;
	public Unit(String n){
		kianuName = n;
		int totalPower = (int)(Math.random()*100)+ 200;
		strength = (int)(Math.random() * (totalPower/2));totalPower-=strength;
		defence = (int)(Math.random()*totalPower) + 20;totalPower -= defence;
		mana = (int)(Math.random()*totalPower);totalPower -=mana;
		healpow = totalPower;
		unitHp = (int)(Math.random()*400+800);
		if(mana > healpow){
			mana += healpow;
			healpow = 0;
			if(mana > 80){
				magic = true;
				usableMagic = new Skill[2];
				usableMagic[0] = new FireBall();
				usableMagic[1] = new IceBreak();
			}
		}
		else{
			healpow += mana;
			mana = 0;
		}
		unitCounter++;		
	}
	public int getStrength(){
		return strength;
	}
	public int getHp(){
		return unitHp;
	}
	public static void attack(Monsters n, Unit s) {
		n.setHp((s.strength + Critical.criticalDamage(s)));
	}
	public static void setHp(int damage,Unit s){
		s.unitHp -= (int)(damage/(s.defence*0.02));
	}
	public void printStats(){
		System.out.println(unitCounter + ". name: " + kianuName + " str: " + strength +" def: " + defence + " mana: " + mana + " heal power: " + healpow +" hp: " + unitHp);
	}
	public void healUnit(Unit s){
		s.unitHp += healpow * 2;

	}
	public boolean getMagic(){
		return magic;
	}
	public void setMana(Skill n){
		mana -= n.getmanaUse();
	}

}
