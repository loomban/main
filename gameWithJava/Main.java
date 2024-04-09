
/*import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
    	System.out.println("Welcome to the game");
		int sheildNumber = 0;
		Unit unitOne = new Unit("Lol");
		Unit.produceUnit(unitOne);
		Unit unitTwo = new Unit("Lone");
		Unit.produceUnit(unitTwo);
		Unit unitThree = new Unit("Loy");
		Unit.produceUnit(unitThree);
		int move;
		int unitChosen;
		Monsters goblin = new Monsters();
		while(goblin.getMonsterHp() > 0 && Unit.getUnitNumber(1).getHp() > 0 || Unit.getUnitNumber(2).getHp() > 0 || Unit.getUnitNumber(3).getHp() > 0)
		{
			System.out.println("1.attack 2. defend 3. heal 4. magic 0. back");
			move = scanner.nextInt();
			System.out.println("what unit will you use?");
			unitOne.printStats();
			unitTwo.printStats();
			unitThree.printStats();
			unitChosen = scanner.nextInt();
			if(move == 1){
				Unit.attack(goblin, Unit.getUnitNumber(unitChosen));;
				if (sheildNumber > 0){
					Unit.setHp((int)(goblin.getMonstersDamage()/2.0), Unit.getUnitNumber(unitChosen));
				}
				else {
					Unit.setHp(goblin.getMonstersDamage(), Unit.getUnitNumber(unitChosen));
				}
				sheildNumber -= 1;
			}
			if (move == 2) {
				sheildNumber = 2;
				Unit.setHp((int)(goblin.getMonstersDamage()/2.0), Unit.getUnitNumber(unitChosen));
			}
			if (move == 3) {
				int unitHealed = scanner.nextInt();
				Unit.getUnitNumber(unitChosen).healUnit(Unit.getUnitNumber(unitHealed));
			}
			if(move == 4){
				if(Unit.getUnitNumber(unitChosen).getMagic()){
					System.out.println("what magic do you choose");
					for(int i = 0; i < Unit.getUnitNumber(unitChosen).usableMagic.length; i++){
						System.out.println(Unit.getUnitNumber(unitChosen).usableMagic[i].getSkillName());
					}	
					scanner.nextLine();
					String magicChoose = scanner.nextLine().trim();
					if (magicChoose.equalsIgnoreCase("fire ball")){
						goblin.setHp(Unit.getUnitNumber(unitChosen).usableMagic[0].getDamage());
					}
					else if (magicChoose.equalsIgnoreCase("ice break")){
						goblin.setHp(Unit.getUnitNumber(unitChosen).usableMagic[1].getDamage());
					} else {
						System.out.println("Invalid magic selected");
					}

				} else{
					System.out.println("This unit cannot do magic");
				}

			}
			if(goblin.getMonsterHp() < 0){
				goblin.setToMinHp();
			} 
			System.out.println("monster health left: " + goblin.getMonsterHp());
			if (Unit.getUnitNumber(unitChosen).getHp() < 0){
				System.out.println("left HP: 0");
			}
			else{
				
				System.out.println("left HP: " + Unit.getUnitNumber(unitChosen).getHp());
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
*/