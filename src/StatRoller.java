import java.util.ArrayList;


public class StatRoller {

	public static ArrayList<Integer> statRoller () {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {

			int[] rand = new int[4];
			rand[0] = RandomWeapon.number(2, 6);
			rand[1] = RandomWeapon.number(2, 6);
			rand[2] = RandomWeapon.number(2, 6);
			rand[3] = RandomWeapon.number(2, 6);
			
			for (int q = 0; q < 4; q++){
				for(int w = 0; w < 4; w++){
					
					if(rand[q] > rand[w]){
						int temp = rand[w];
						rand[w] = rand[q];
						rand[q] = temp;
						
					}
					
				}
			}
			//System.out.println(rand[0] + " " + rand[1] + " " + rand[2] + " " + rand[3]);
			int stat = rand[1] + rand[2] + rand[0];
			list.add(stat);
		}
		return list;
	}
	
}
