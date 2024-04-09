public class Monsters {
	private int hp;
	private int atckPw;
	Monsters(){
		hp = 1500;
		atckPw = 150;
	}
	public int getMonsterHp(){
		return hp;
	}
	public void setHp(int attacked){
		hp-= attacked;
	}
	public void setToMinHp(){
		hp = 0;
	}
	public int getMonstersDamage(){
		return atckPw;
	}
}
