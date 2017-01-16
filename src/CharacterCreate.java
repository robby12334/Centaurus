public class CharacterCreate {
	
	public static int getSTR(int str, String Race){
		// Aleakii +1
		// Dwarven +2
		// Brakashi +1
		// Troll + 1
		// Ghashim + 2
		if(Race == "Aleakii"){
			return str+1;
		}
		if(Race == "Frost Dwarf"){
			return str+2;
		}
		if(Race == "Fir Dwarf"){
			return str+2;
		}
		if(Race == "Brakashi"){
			return str+1;
		}
		if(Race == "Larys"){
			return str+1;
		}
		if(Race == "Surfacer"){
			return str+1;
		}
		if(Race == "Ghashim"){
			return str+2;
		}
		return str;
	}
	
	public static int getDEX(int dex, String Race){
		// Alekii illari + 2
		// Human +2
		// Viper + 2 
		if(Race == "Aleakii"){
			return dex+2;
		}
		if(Race == "Illiarii"){
			return dex+2;
		}
		if(Race == "Untouched"){
			return dex+2;
		}
		if(Race == "Fae-touched"){
			return dex+2;
		}
		if(Race == "Viper"){
			return dex+2;
		}
		return dex;
	}
	
	public static int getCON(int con, String Race){
		// Centaur +2
		// Troll + 1
		// Ghashim + 2
		// Viper - 2 
		if(Race == "River Centaur"){
			return con+2;
		}
		if(Race == "Plains Centaur"){
			return con+2;
		}
		if(Race == "Surfacer"){
			return con+1;
		}
		if(Race == "Larys"){
			return con+1;
		}
		if(Race == "Ghashim"){
			return con+2;
		}
		if(Race == "Viper"){
			return con-2;
		}
		return con;
	}
	
	public static int getINT(int intel, String Race){
		// Elven +1
		// Durog +1
		// Orc +2
		// Ghashim - 2
		// Viper + 2 
		if(Race == "Servitor"){
			return intel+1;
		}
		if(Race == "Diktator"){
			return intel+1;
		}
		if(Race == "Durog"){
			return intel+1;
		}
		if(Race == "Orc"){
			return intel+2;
		}
		if(Race == "Goblin"){
			return intel+2;
		}
		if(Race == "Ghashim"){
			return intel-2;
		}
		if(Race == "Viper"){
			return intel+2;
		}
		return intel;
	}
	
	public static int getWIS(int wis, String Race){
		// Gnome +2
		// Troll + 1
		// Ghashim - 2
		if(Race == "Brakashi"){
			return wis+2;
		}
		if(Race == "Durog"){
			return wis+2;
		}
		if(Race == "Larys"){
			return wis+1;
		}
		if(Race == "Surfacer"){
			return wis+1;
		}
		if(Race == "Ghashim"){
			return wis-2;
		}
		
		return wis;
	}
	
	public static int getCHA(int cha, String Race){
		// Elven +2
		// Viper - 2 
		if(Race == "Servitor"){
			return cha+2;
		}
		if(Race == "Diktator"){
			return cha+2;
		}
		if(Race == "Viper"){
			return cha-2;
		}
		return cha;
	}
	
	public static int getHP(int con, int lvl, String Class, int bonusHp, String Race){
		// Larys +1 hp & +1hp per level
		// Titan 12+con + (2d6 + con) * lvl + (2*lvl if lvl>3)
		// Devastator 12+con + (2d6 + con) * lvl
		// Bastion 12+con + (2d6 + con) * lvl
		
		// Militia 10+con + (1d10 + con) * lvl
		// Hospitaller 10+con + (1d10 + con) * lvl
		// Blade Dancer 8+con + (1d8 + con) * lvl
		// Woodrover 8+con + (1d8 + con) * lvl
		// Ranger 8+con + (1d10 + con) * lvl
		// Thief 8+con + (1d8 + con) * lvl
		// Warlock 8+con + (1d8 + con) * lvl
		// Sorcerer 6+con + (1d6 + con) * lvl
		// Witch 6+con + (1d6 + con) * lvl
		// Wizard 6+con + (1d6 + con) * lvl
		
		int totalHP = 0;
		
		if(Class=="Titan"){
			totalHP += 12 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(2, 12);
				totalHP += con;
			}
			if (lvl >=3){
				totalHP += 2*lvl;
			}
		}
		if(Class=="Devastator"){
			totalHP += 12 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(2, 12);
				totalHP += con;
			}
		}
		if(Class=="Bastion"){
			totalHP += 12 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(2, 12);
				totalHP += con;
			}
		}
		if(Class=="Engineer"){
			totalHP += 10 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 10);
				totalHP += con;
			}
		}
		if(Class=="Commander"){
			totalHP += 10 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 10);
				totalHP += con;
			}
		}
		if(Class=="Champion"){
			totalHP += 10 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 10);
				totalHP += con;
			}
		}
		if(Class=="Protector"){
			totalHP += 10 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 10);
				totalHP += con;
			}
		}
		if(Class=="Exemplar"){
			totalHP += 10 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 10);
				totalHP += con;
			}
		}
		if(Class=="Stalwart"){
			totalHP += 10 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 10);
				totalHP += con;
			}
		}
		if(Class=="Duelist"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Master at Arms"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Dervish"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Sentinel"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Warden"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Reaver"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Hunter"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Bandit"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Sharpshooter"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 10);
				totalHP += con;
			}
		}
		if(Class=="Vollier"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 10);
				totalHP += con;
			}
		}
		if(Class=="Skirmisher"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 10);
				totalHP += con;
			}
		}
		if(Class=="Spy"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Assassin"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Burglar"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Arcanister"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Pyromancer"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Cryomancer"){
			totalHP += 8 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 8);
				totalHP += con;
			}
		}
		if(Class=="Necromancer"){
			totalHP += 6 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 6);
				totalHP += con;
			}
		}
		if(Class=="Illusionist"){
			totalHP += 6 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 6);
				totalHP += con;
			}
		}
		if(Class=="Channel"){
			totalHP += 6 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 6);
				totalHP += con;
			}
		}
		if(Class=="Maelstrom"){
			totalHP += 6 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 6);
				totalHP += con;
			}
		}
		if(Class=="Mindstrom"){
			totalHP += 6 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 6);
				totalHP += con;
			}
		}
		if(Class=="Portalstrom"){
			totalHP += 6 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 6);
				totalHP += con;
			}
		}
		if(Class=="Bonecaster"){
			totalHP += 6 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 6);
				totalHP += con;
			}
		}
		if(Class=="Maleficar"){
			totalHP += 6 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 6);
				totalHP += con;
			}
		}
		if(Class=="Shapeshifter"){
			totalHP += 6 + con;
			for(int i = 2; i <=lvl; i++){
				totalHP += RandomWeapon.number(1, 6);
				totalHP += con;
			}
		}
		
		if (Race == "Larys"){
			totalHP += 1;
			totalHP += lvl;
		}
		
		 
		return totalHP+bonusHp;
	}
	
	public static int getWillpower(int total){
		if(total %6 >0){
			return (total/6)+1;
		}else{
			return total/6;
		}
	}
	
	public static int getAC(int dex, String Shield, String Armor,int lvl){
		int totalAC = 0;
		totalAC+=(dex-10)/2;
		totalAC+=8;
		if(Shield == "Buckler"){
			totalAC+=1;
		}
		if(Shield == "RoundSheild"){
			totalAC+=2;
		}
		if(Shield == "TowerShield"){
			totalAC+=3;
		}
		
		if(Armor == "Light"){
			totalAC+=1;
		}
		if(Armor == "Medium"){
			totalAC+=3;
		}
		if(Armor == "Heavy"){
			totalAC+=5;
		}
		
		
		return totalAC;
	}
	
	public static String getSpeed(String Race){
		// allekii / illari 25/50
		// Centaur 50/100
		// Dwarf 25/50
		// Elven 30/60
		// Gnome 25/50
		// Human 30/60
		// Orc 30/60
		// San’Trell 35/70
		
		if(Race == "Aleakii" || Race == "Illiarii"){
			return "25/50 - In Air:60";
		}else if(Race == "River Centaur" || Race == "Plains Centaur"){
			return "50/100";
		}else if(Race == "Frost Dwarf" || Race == "Fir Dwarf"){
			return "25/50";
		}else if(Race == "Diktator" || Race == "Servitor"){
			return "30/60";
		}else if(Race == "Brakashi" || Race == "Durog"){
			return "25/50";
		}else if(Race == "Untouched" || Race == "Fae-touched"){
			return "30/60";
		}else if(Race == "Goblin" || Race == "Orc"){
			return "30/60";
		}else if(Race == "Surfacer" || Race == "Larys"){
			return "30/60";
		}else{
			return "35/70";
		}
	}
	public static String getToHit(int dex, int intel, int str, int lvl, int bonusToHit){
		int toHitStr = (str-10) /2;
		int toHitIntel = (intel-10) /2;
		int toHitdex = (dex-10) /2;
		
		if(lvl < 5){
			toHitStr+=2;
			toHitIntel+=2;
			toHitdex+=2;
		}else if(lvl >= 5 || lvl <9){
			toHitStr+=3;
			toHitIntel+=3;
			toHitdex+=3;
		}else if(lvl >= 9 || lvl <13){
			toHitStr+=4;
			toHitIntel+=4;
			toHitdex+=4;
		}else if(lvl >= 13 || lvl <17){
			toHitStr+=5;
			toHitIntel+=5;
			toHitdex+=5;
		}else{
			toHitStr+=6;
			toHitIntel+=6;
			toHitdex+=6;
		}
		toHitStr+=bonusToHit;
		toHitIntel+=bonusToHit;
		toHitdex+=bonusToHit;
		
		return "Dex Bonus:"+ toHitdex + " Str Bonus:" + toHitStr + " Int Bonus:" + toHitIntel;
	}
}
