
import java.util.Scanner;
public class fake{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
    	System.out.println("Welcome to the game");
		int sheildNumber = 0;
		Unit unitOne = new Unit("Lol");
		UnitManager.addUnit(unitOne);
		Unit unitTwo = new Unit("Lone");
		UnitManager.addUnit(unitTwo);
		Unit unitThree = new Unit("Loy");
		UnitManager.addUnit(unitThree);
		int unitChosen;
		Monsters goblin = new Monsters();
		while(goblin.getMonsterHp() > 0 && UnitManager.getUnit(1).getHp() > 0 && UnitManager.getUnit(2).getHp() > 0 && UnitManager.getUnit(3).getHp() > 0)
		{
			System.out.println("Choose an action:");
			System.out.println("1. Attack - Deal damage to the monster.");
			System.out.println("2. Defend - Reduce incoming damage for one turn.");
			System.out.println("3. Heal - Restore health to one of your units.");
			System.out.println("4. Magic - Use a magical skill for powerful effects. Requires mana.");
			int action = scanner.nextInt();
			System.out.println("what unit will you use?");
			unitOne.printStats();
			unitTwo.printStats();
			unitThree.printStats();
			unitChosen = scanner.nextInt();
			switch(action) {
				case 1:
					// Attack logic
					Unit.attack(goblin, UnitManager.getUnit(unitChosen));;
					if (sheildNumber > 0){
						Unit.setHp((int)(goblin.getMonstersDamage()/2.0), UnitManager.getUnit(unitChosen));
					}
					else {
					Unit.setHp(goblin.getMonstersDamage(), UnitManager.getUnit(unitChosen));
					}
					sheildNumber -= 1;
					break;
				case 2:
					// Defend logic
					sheildNumber = 2;
					Unit.setHp((int)(goblin.getMonstersDamage()/2.0), UnitManager.getUnit(unitChosen));
					break;
				case 3:
					// Heal logic
					System.out.println("Who would you heal");
					unitOne.printStats();
					unitTwo.printStats();
					unitThree.printStats();
					int unitHealed = scanner.nextInt();
					UnitManager.getUnit(unitChosen).healUnit(UnitManager.getUnit(unitHealed));
					if (sheildNumber > 0){
						Unit.setHp((int)(goblin.getMonstersDamage()/2.0), UnitManager.getUnit(unitChosen));
					}
					else {
					Unit.setHp(goblin.getMonstersDamage(), UnitManager.getUnit(unitChosen));
					}
					break;
				case 4:
					if(UnitManager.getUnit(unitChosen).getMagic()){
						System.out.println("what magic do you choose");
						for(int i = 0; i < UnitManager.getUnit(unitChosen).usableMagic.length; i++){
							System.out.println(UnitManager.getUnit(unitChosen).usableMagic[i].getSkillName());
						}	
						scanner.nextLine();
						String magicChoose = scanner.nextLine().trim();
						if (magicChoose.equalsIgnoreCase("fire ball") || magicChoose.equals("fireball")){
							goblin.setHp(UnitManager.getUnit(unitChosen).usableMagic[0].getDamage());
							UnitManager.getUnit(unitChosen).setMana(UnitManager.getUnit(unitChosen).usableMagic[0]);
						}
						else if (magicChoose.equalsIgnoreCase("ice break") || magicChoose.equals("icebreak")){
							goblin.setHp(UnitManager.getUnit(unitChosen).usableMagic[1].getDamage());
							UnitManager.getUnit(unitChosen).setMana(UnitManager.getUnit(unitChosen).usableMagic[1]);
						} else {
							System.out.println("Invalid magic selected");
						}

					} else{
						System.out.println("This unit cannot do magic");
					}
					if (sheildNumber > 0){
						Unit.setHp((int)(goblin.getMonstersDamage()/2.0), UnitManager.getUnit(unitChosen));
					}
					else {
					Unit.setHp(goblin.getMonstersDamage(), UnitManager.getUnit(unitChosen));
					}
					break;
					
				default:
					System.out.println("Invalid choice, please select a valid action.");
					break;
			}
			if(goblin.getMonsterHp() < 0){
				goblin.setToMinHp();
			} 
			System.out.println("monster health left: " + goblin.getMonsterHp());
			if (UnitManager.getUnit(unitChosen).getHp() < 0){
				System.out.println("left HP: 0");
			}
			else{
				
				System.out.println("left HP: " + UnitManager.getUnit(unitChosen).getHp());
			}
		}
		if (goblin.getMonsterHp() == 0){
			System.out.println("You win");
		}
		else{
			System.out.println("You lose");
		}
		scanner.close();
	}
}