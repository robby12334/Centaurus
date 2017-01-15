import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomWeapon {
	public static void main(String[] args) {
		randomWeapon(5);
	}

	public static ArrayList<String> randomWeapon(int numWeap) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < numWeap; i++) {
			int a;
			int x = 1;
			int y = 100;
			int z = number(x, y);

			if (z >= 80) {
				a = 0; // 0 is a specialized weapon
			} else {
				a = 1; // 1 is a martial weapon
			}

			String type = metal();
			String weapon = weapon(a);
			String fullWeap = type.concat(" ").concat(weapon);
			list.add(fullWeap);
		}
		System.out.println(list);
		return list;
	}

	public static int number(int min, int max) {
		int i = ThreadLocalRandom.current().nextInt(min, max + 1);
		return i;
	}

	public static String metal() {
		String b = "";
		int x = number(1, 100);
		if (x <= 35) {
			b = "Bronze";
		} else if (55 >= x && x > 35) {
			b = "Iron";
		} else if (75 >= x && x > 55) {
			b = "Steel";
		} else if (90 >= x && x > 75) {
			b = "Orichalcum";
		} else if (99 >= x && x > 90) {
			b = "Mythril";
		} else if (x == 100) {
			b = "Adamantite";
		}
		return b;
	}

	public static String weapon(int type) {
		String a = "";
		if (type == 1) {
			int x = number(1, 22); // there are 22 martial weapons
			if (x == 1) {
				a = "Shortsword";
			} else if (x == 2) {
				a = "Longsword";
			} else if (x == 3) {
				a = "Mace";
			} else if (x == 4) {
				a = "Maul";
			} else if (x == 5) {
				a = "Warhammer";
			} else if (x == 6) {
				a = "Sling";
			} else if (x == 7) {
				a = "Hunting Bow";
			} else if (x == 8) {
				a = "Shortbow";
			} else if (x == 9) {
				a = "Spear";
			} else if (x == 10) {
				a = "Quarterstaff";
			} else if (x == 11) {
				a = "Falx";
			} else if (x == 12) {
				a = "Pike";
			} else if (x == 13) {
				a = "Crossbow";
			} else if (x == 14) {
				a = "Greatsword";
			} else if (x == 15) {
				a = "Tower Shield";
			} else if (x == 16) {
				a = "Javelin";
			} else if (x == 17) {
				a = "Throwing Knife";
			} else if (x == 18) {
				a = "Dagger";
			} else if (x == 19) {
				a = "Hatchet";
			} else if (x == 20) {
				a = "Roundshield";
			} else if (x == 21) {
				a = "Axe";
			} else if (x == 22) {
				a = "Greataxe";
			}
		} else {
			int x = number(1, 25);

			if (x == 1) {
				a = "Scimitar";
			} else if (x == 2) {
				a = "Halberd";
			} else if (x == 3) {
				a = "Nadziak";
			} else if (x == 4) {
				a = "Parmotvol";
			} else if (x == 5) {
				a = "Cho-ko-nu";
			} else if (x == 6) {
				a = "Lance";
			} else if (x == 7) {
				a = "Longbow";
			} else if (x == 8) {
				a = "Arbalest";
			} else if (x == 9) {
				a = "Net";
			} else if (x == 10) {
				a = "Whip";
			} else if (x == 11) {
				a = "Bolas";
			} else if (x == 12) {
				a = "Chakram";
			} else if (x == 13) {
				a = "Tiger Claw";
			} else if (x == 14) {
				a = "Naginata";
			} else if (x == 15) {
				a = "Katana";
			} else if (x == 16) {
				a = "No-Dachi";
			} else if (x == 17) {
				a = "Trident";
			} else if (x == 18) {
				a = "Rapier";
			} else if (x == 19) {
				a = "Tetsubo";
			} else if (x == 20) {
				a = "Flail";
			} else if (x == 21) {
				a = "Atlatl";
			} else if (x == 22) {
				a = "Buckler";
			} else if (x == 23) {
				a = "Quickfire Dart";
			} else if (x == 24) {
				a = "Hand Crossbow";
			} else if (x == 25) {
				a = "Katar";
			}
		}
		return a;
	}
}
