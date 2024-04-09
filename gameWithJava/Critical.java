public class Critical {
	static public boolean isCritical(){
		double percentToCritical = .5;
		double critical = Math.random();
		if(critical > percentToCritical){
			return false;
		}
		return true;
	}
	public static int criticalDamage(Unit n){
		isCritical();
		if(isCritical()){
		double percentDamageIncrease = 0.5;
		int addedDamage = (int)(n.getStrength()*percentDamageIncrease);
		return addedDamage;
		}
		return 0;
	}
}
