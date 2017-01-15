public class EnchantmentCreator {

	public static String getEnchantment(String type){
		
		System.out.println(type);
		
		int x = RandomWeapon.number(1, 1000);
		if(type.equalsIgnoreCase("Unique Item")){
			return getUniqueEnchantment(type);
		}else if(type.equalsIgnoreCase("Legendary Item")){
			return getLegendaryEnchantment(type);
		}else if(x > 800 && x <=995){
			return getUniqueEnchantment(type);
		}else if(x > 995 && x <=1000){
			return getLegendaryEnchantment(type);
		}else{
			return getStatBoost(type);
		}
		
	}
	
	public static String getStatBoost(String type){
		System.out.println("StatBoost");
		int x = RandomWeapon.number(1, 100);
		
		String stat = getBasicEnchant(type);
		System.out.println(stat);
		
		String exploration;
		
		if (stat == "Exploration Proficiancy"){
			exploration = getProficiancy(type);
			System.out.println(exploration);
		}
		
		if(x < 60){
			//+1
			System.out.println("+1");
			
		}else if(x >=60 && x <90){
			//+2
			System.out.println("+2");
		}else{
			//+3
			System.out.println("+3");
		}
		
		return null;
	}
	
	public static String getUniqueEnchantment(String type){
		System.out.println("UniqueEnchant");
		return null;
	}
	public static String getLegendaryEnchantment(String type){
		System.out.println("LegendaryEnchant");
		return null;
	}
	private static String getBasicEnchant(String type){
		//{"Armor", "Ring", "Amulet", "Cloak", "Helm", "Boots", "Gloves"};
		int x;
		switch(type){
			case "Armor":
				//All Stats = 1, HP = 2, resistance: blade, pierce, Impact = 3, AC = 4
				x = RandomWeapon.number(1, 4);
				if(x == 1){
					return getStat(type);
				}else if(x == 2){
					return "HP";
				}else if(x == 3){
					return "Resistance";
				}else if(x == 4){
					return "AC";
				}
				break;
			case "Ring":
				//All Stats = 1, HP = 2, Initiative = 3, Willpower = 4, All Exploration Prof = 5
				x = RandomWeapon.number(1, 4);
				if(x == 1){
					return getStat(type);
				}else if(x == 2){
					return "HP";
				}else if(x == 3){
					return "Initiative";
				}else if(x == 4){
					return "Exploration Proficiancy";
				}
				break;
			case "Amulet":
				//All Stats = 1, HP = 2, Initiative = 3, Willpower = 4, All Exploration Prof = 5
				x = RandomWeapon.number(1, 5);
				if(x == 1){
					return getStat(type);
				}else if(x == 2){
					return "HP";
				}else if(x == 3){
					return "Initiative";
				}else if(x == 4){
					return "Willpower";
				}else if(x == 5){
					return "Exploration Proficiancy";
				}
				break;
			case "Cloak":
				//All Stats = 1, HP = 2, All Explorations = 3
				x = RandomWeapon.number(1, 3);
				if(x == 1){
					return getStat(type);
				}else if(x == 2){
					return "HP";
				}else if(x == 3){
					return "Exploration Proficiancy";
				}
				break;
			case "Helm":
				//All Stats = 1, HP = 2, All Explorations = 3
				x = RandomWeapon.number(1, 3);
				if(x == 1){
					return getStat(type);
				}else if(x == 2){
					return "HP";
				}else if(x == 3){
					return "Exploration Proficiancy";
				}
				break;
			case "Boots":
				//All Stats = 1, HP = 2, Initiative = 3,  All Explorations = 4
				x = RandomWeapon.number(1, 4);
				if(x == 1){
					return getStat(type);
				}else if(x == 2){
					return "HP";
				}else if(x == 3){
					return "Initiative";
				}else if(x == 4){
					return "Exploration Proficiancy";
				}
				break;
			case "Gloves":
				//All Stats = 1, HP = 2,  All Explorations = 3
				x = RandomWeapon.number(1, 3);
				if(x == 1){
					return getStat(type);
				}else if(x == 2){
					return "HP";
				}else if(x == 3){
					return "Exploration Proficiancy";
				}
				break;
			case "Weapon":
				//  Str Dex Int = 1,Added Damage Enchant = 2, Initiative = 3, To Hit = 4, Dmg Conversion = 5, lifesteal = 6;
				// Electric, Fire, Arcane, Frost
				x = RandomWeapon.number(1, 6);
				if(x == 1){
					return getStat(type);
				}else if(x == 2){
					return "Elemental Damage";
				}else if(x == 3){
					return "Initiative";
				}else if(x == 4){
					return "To Hit";
				}else if(x == 5){
					return "Damage Cerverted to";
				}else if(x == 6){
					return "Life-Steal";
				}
				break;
			case "Shield":
				//CON STR DEX = 1, HP = 2, resistance: blade, pierce, Impact =3, AC = 4
				x = RandomWeapon.number(1, 4);
				if(x == 1){
					return getStat(type);
				}else if(x == 2){
					return "HP";
				}else if(x == 3){
					return "Resistance";
				}else if(x == 4){
					return "AC";
				}
				break;
			
		}
		
		return null;
	}
	
	private static String getStat(String type){
		int x = RandomWeapon.number(1, 6);
		
		if (type == "Weapon"){
			x = RandomWeapon.number(2, 4);
		}else if(type == "Shield"){
			x = RandomWeapon.number(1,3);
		}else if(type == "Prof"){
			x = RandomWeapon.number(2,6);
		}
		
		switch(x){
			case 1:
				return "CON";
			case 2:
				return "STR";
			case 3:
				return "DEX";
			case 4:
				return "INT";
			case 5:
				return "WIS";
			case 6:
				return "CHA";
		}
	
			
		
		return "Fail";
	}

	private static String getProficiancy(String type){
		String proficiency = getStat("Prof");
		int x;
		switch(proficiency){
		case "STR":
			x = RandomWeapon.number(1, 4);
			switch(x){
				case 1:
					return "Athletics";
				case 2:
					return "Swimming";
				case 3:
					return "Climbing";
				case 4:
					return "Spelunking";
			}
		case "DEX":
			x = RandomWeapon.number(1, 4);
			switch(x){
				case 1:
					return "Lockpicking";
				case 2:
					return "Acrobatics";
				case 3:
					return "Stealth";
				case 4:
					return "Sleight of Hand";
			}
		case "INT":
			x = RandomWeapon.number(1, 9);
			switch(x){
				case 1:
					return "Investigation";
				case 2:
					return "Arcana";
				case 3:
					return "History";
				case 4:
					return "Herblore";
				case 5:
					return "Medicine";
				case 6:
					return "Appraisal";
				case 7:
					return "Religion";
				case 8:
					return "Poisonmaking";
				case 9:
					return "Flaskmaking";
			}
			
		case "WIS":
			x = RandomWeapon.number(1, 6);
			switch(x){
				case 1:
					return "Animal Handling";
				case 2:
					return "Insight";
				case 3:
					return "Sky Reading";
				case 4:
					return "Tracking";
				case 5:
					return "Perception";
				case 6:
					return "Passive Perception";
			}
			
		case "CHA":
			x = RandomWeapon.number(1, 4);
			switch(x){
				case 1:
					return "Deception";
				case 2:
					return "Intimidation";
				case 3:
					return "Persuasion";
				case 4:
					return "Haggling";
			}
		}
		return null;
	}

}
