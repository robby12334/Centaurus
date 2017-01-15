import java.util.Scanner;

public class Enemy {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		createEnemy("random");
	}

	public static String enemyRace() {
		int x = RandomWeapon.number(1, 18);
		String race;
		if (x == 1) {
			race = "Aleakii";
		} else if (x == 2) {
			race = "Iliarii";
		} else if (x == 3) {
			race = "River Centaur";
		} else if (x == 4) {
			race = "Plains Centaur";
		} else if (x == 5) {
			race = "Frost Dwarf";
		} else if (x == 6) {
			race = "Fir Dwarf";
		} else if (x == 7) {
			race = "Elf Diktator";
		} else if (x == 8) {
			race = "Elf Servitor";
		} else if (x == 9) {
			race = "Brakashi Gnome";
		} else if (x == 10) {
			race = "Durog Gnome";
		} else if (x == 11) {
			race = "Human";
		} else if (x == 12) {
			race = "Fae-touched Human";
		} else if (x == 13) {
			race = "Orc";
		} else if (x == 14) {
			race = "Goblin";
		} else if (x == 15) {
			race = "Surfacer Troll";
		} else if (x == 16) {
			race = "Larys Troll";
		} else if (x == 17) {
			race = "Ghashim San'Trell";
		} else {
			race = "Viper San'Trell";
		}
		return race;
	}

	public static void rogue() {
		System.out.println("Rogue");
		System.out.println("Please enter which class you'd like the enemy to be: ");
		String eClass = input.next();

		if (eClass.equalsIgnoreCase("thief")) {
			System.out.println("You have chosen a sentient enemy of the " + eClass + " class");
			System.out.println("Race? If random enter \"random\": ");
			String race = input.next();
			if (race.equalsIgnoreCase("random")) {
				race = enemyRace();

				System.out.println(race + " " + eClass);
			}
		} else if (eClass.equalsIgnoreCase("justicar")) {
			System.out.println("You have chosen a sentient enemy of the " + eClass + " class");
			System.out.println("Race? If random enter \"random\": ");
			String race = input.next();
			if (race.equalsIgnoreCase("random")) {
				race = enemyRace();

				System.out.println(race + " " + eClass);
			}
		} else if (eClass.equalsIgnoreCase("woodrover")) {
			System.out.println("You have chosen a sentient enemy of the " + eClass + " class");
			System.out.println("Race? If random enter \"random\": ");
			String race = input.next();
			if (race.equalsIgnoreCase("random")) {
				race = enemyRace();

				System.out.println(race + " " + eClass);
			}
		} else if (eClass.equalsIgnoreCase("ranger")) {
			System.out.println("You have chosen a sentient enemy of the " + eClass + " class");
			System.out.println("Race? If random enter \"random\": ");
			String race = input.next();
			if (race.equalsIgnoreCase("random")) {
				race = enemyRace();

				System.out.println(race + " " + eClass);
			}
		}

	}

	public static void warrior() {

	}

	public static void mage() {

	}

	public static void createEnemy(String meta) {
		if (meta.equalsIgnoreCase("rogue")) {
			rogue();
		}
		if (meta.equalsIgnoreCase("warrior")) {
			warrior();
		}
		if (meta.equalsIgnoreCase("mage")) {
			mage();
		}
		if (meta.equalsIgnoreCase("random")) {
			int x = RandomWeapon.number(1, 3);
			if (x == 1) {
				rogue();
			} else if (x == 2) {
				warrior();
			} else {
				mage();
			}
		}
	}
}
