import java.math.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomWeapon {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Minimum Roll: ");
		int x = input.nextInt();
		
		System.out.print("Maximum Roll: ");
		int y = input.nextInt();
		int z = number(x,y);
		
		System.out.println(z);
	}
	public static int number(int min, int max){
		int i = ThreadLocalRandom.current().nextInt(min, max+1);
		return i;
	}
}
