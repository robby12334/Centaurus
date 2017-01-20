
public class RacialStats {
	public static void main(String[] args){
		String[] output = Race("Aleakii");
		
		int length = output.length;
		for(int i = 0; i < length; i++){
			System.out.println(output[i]);
		}
		
	}
	
	public static String[] Race(String Race){
		String Selected = Race;
		
		String [] input = new String[]{"INCORRECT INPUT"};
		
		String [] races = new String[]{"", "Aleakii", "Illari", "River Centaur", "Plains Centaur",
				"Frost Dwarf", "Fir Dwarf", "Diktator", "Servitor", "Brakashi", "Durog", "Untouched", 
				"Fae-touched", "Goblin", "Orc", "Surfacer", "Larys", "Ghashim", "Viper"};
		
		if(Selected == "Aleakii"){
			String [] Aleakii = new String[]{"Ability Score: +2 DEX", "Exploration Proficiency: Intimidation", "Ability Score Increase: Years of combat training and a harsh environment have made you better prepared to face the world. +1 to STR.", 
					"Vision: while in air Perception +2. Flying high above terrain Perception +4. Tracking rolls are increased by the same amount",
					"Proficient in shortbow, shortsword, and mauls", "50% resistance to electrical dmg, Advantage on all rolls involving electricity",
					"Sky Drop: Grasp enemy your size or smaller, carry into sky short distance before slamming back into earth, make STR check to see if you lift foe and opponent makes a DEX or STR save (whichever is highest) should either check fail opponent suffers 1d6 of impact dmg, if successful they suffer 3d6 impact dmg",
					"Claustrophobia: While in spaces under 10x10x10 with no obvious access to the sky, you must make periodic morale checks; once when you enter the space, and once when entering combat, as well as whenever the DM deems it appropriate. Failing a morale check will result in you attempting to flee to the outside. You must also make these checks when underground.",
					"Aerial Maneuvers: When struck by a ranged attack while in flight, you may choose to make a Dexterity save and avoid all damage. This ability can be used three times per long rest.",
					"Downtime proficiencies: Pick one of the following: Hunting, Writing, Pottery, Music",
					"Exploration proficiencies: Pick one of the following: Skyreading, Fletching, Investigation, Herblore", "Carnivore: You may choose to consume the flesh of defeated enemies, including other sentients, either raw or cooked. This action will restore up to 1d10 hp, but know that in general, consuming sentient beings is frowned upon by most races in Aruwen."
					};
			
			return Aleakii;
		}
		else if(Selected == "Illari"){
			String [] Illari = new String[]{"Ability Score Increase +2 Dexterity", "Vision: While in the air, your perception is increased by 2. Flying high above the terrain will increase your perception to +4. In addition, your tracking rolls are increased by the same amount.",
					"Aerial Assault Training: Aepyorns are proficient in shortbow and shortsword. Iliarii are proficient in nets.", "Resistance: Aepyorns have 50% resistance to electrical damage, and advantage on all rolls involving electricity, due to their familiarity with lightning, its effects, and its patterns.", 
					"Sky Drop: Grasping an enemy your size or smaller, in your talons, you are able to carry them into the sky for a short distance before slamming them back to the earth. You must make a STR check to determine if you can lift the foe successfully, and the opponent makes a DEX or STR save (whichever is higher) to determine if they can wrest free of your grasp. Should either check fail, you drop your opponent, and they suffer 1d6 impact damage. If you are successful in holding onto your opponent, you slam them into the ground, dealing 3d6 impact damage.",
					"Claustrophobia: While in spaces under 10x10x10 with no obvious access to the sky, you must make periodic morale checks; once when you enter the space, and once when entering combat, as well as whenever the DM deems it appropriate. Failing a morale check will result in you attempting to flee to the outside. You must also make these checks when underground.",
					"Aerial Maneuvers: When struck by a ranged attack while in flight, you may choose to make a Dexterity save and avoid all damage. This ability can be used three times per long rest.", 
					"Downtime proficiencies: Pick one of the following: Hunting, Writing, Pottery, Music",
					"Exploration proficiencies: Pick one of the following: Skyreading, Fletching, Investigation, Herblore",
					"Nimble Watchers: Your life has been spent in fear of predators; you gain advantage on DEX saves.",
					"Downtime Proficiency: Music. Note that you possess a treasured instrument which never leaves your person for more than a few seconds.",
					"Birds of a Feather: Being a gentle soul, birds of all kinds are attracted to you. You can communicate with them, asking for anything from directions to military intelligence. Birds will be hesitant to approach if you are near other sentients,"		
			};
			return Illari;
			
		}
		else if(Selected == "River Centaur"){
			String [] River_Centaur = new String []
				{"Ability Score Increase: Your Constitution is increased by 2.", "Sprint Bonuses: . For piercing weapons (pike, lance, spear), the bonus is 1d8. For other melee weapons, the bonus is 1d4. For thrown weapons, such as the javelin or throwing axe, the bonus is also 1d4, but the hit roll suffers a penalty of -2. Centaurs at full gallop need about 25 feet to stop, some of which can be moving sideways.", "Speedvision: Centaurs suffer no perception or accuracy penalty when moving, except for thrown weapons which possess the penalty described above and have exceptionally clear vision. As such, they can recognize shapes on the horizon, if they are size small or larger.",
						"Resistance: Due to their large size, centaurs require a stronger dose of poisons and diseases to be adversely affected by them. As long as a poison is intended to disable, not kill, a smaller target, centaurs have advantage on the saving throw.", "Centaur formation training: Centaur characters have proficiency in halberd, spear, and lance.", "Mounting: Your companions may ride on your back, and you can carry additional weight, up to a maximum of 300 lbs over long distances, or ½*CON*100 over short distances, no more than half a mile. You can carry up to two medium-sized companions or three small companions, provided their weight does not exceed the limitations above.",
						"Combat mounting: As it takes two action turns for both rider and centaur to mount successfully, it is not recommended that anyone mount up while in combat, especially in an enclosed space. Nevertheless, in combat, a companion mounted on a centaur is a lethal combination. The companion can use weapons and spells while mounted, although any ranged attack has an accuracy penalty of -1 while standing still, or -2 while moving. Additionally, without a saddle, any time the rider suffers more than 25% of their hitpoints in damage in one turn, they must make a dexterity check to remain mounted. If they are knocked off, they take 1d4 in damage (halved if wearing a helmet), and are considered prone. Any melee attack made by a mounted character on a non-mounted opponent receives +1 to damage.",
						"Downtime Proficiencies: You may select one of the following: Music, Construction, Hunting, or Husbandry.", "Exploration Proficiencies: You may select one of the following: Skyreading, Javelin-making, Herblore, or Medicine.", 
						"Rear end whallop: In addition to your regular attack, you can slam an enemy with your rear hooves for 2d6 damage. Hooves can also be plated to increase their damage. This cannot be used when charging.", "Hyperaware: Centaurs must constantly be on watch for the varied threats that hunt them down in their lands. As such, enemies cannot surprise you when you are awake, and you receive advantage on perception rolls when asleep.", "Meditative Trance: Long hours of staring into the rivers looking and waiting for food have given you the ability to shut out distractions while still being aware of threats. At any point, you may choose to stop and slip into this trance (which takes about a minute), allowing you to detect hidden enemies within 250 feet.",
						"Downtime Proficiency: Fishing.", "You can also hold your breath for twice as long as normal."
					
				};
			return River_Centaur;
		}
		else if(Selected == "Plains Centaur"){
			String [] Plains_Centaur = new String[]{"Ability Score Increase: Your Constitution is increased by 2.", "Sprint Bonuses: . For piercing weapons (pike, lance, spear), the bonus is 1d8. For other melee weapons, the bonus is 1d4. For thrown weapons, such as the javelin or throwing axe, the bonus is also 1d4, but the hit roll suffers a penalty of -2. Centaurs at full gallop need about 25 feet to stop, some of which can be moving sideways.", "Speedvision: Centaurs suffer no perception or accuracy penalty when moving, except for thrown weapons which possess the penalty described above and have exceptionally clear vision. As such, they can recognize shapes on the horizon, if they are size small or larger.",
					"Resistance: Due to their large size, centaurs require a stronger dose of poisons and diseases to be adversely affected by them. As long as a poison is intended to disable, not kill, a smaller target, centaurs have advantage on the saving throw.", "Centaur formation training: Centaur characters have proficiency in halberd, spear, and lance.", "Mounting: Your companions may ride on your back, and you can carry additional weight, up to a maximum of 300 lbs over long distances, or ½*CON*100 over short distances, no more than half a mile. You can carry up to two medium-sized companions or three small companions, provided their weight does not exceed the limitations above.",
					"Combat mounting: As it takes two action turns for both rider and centaur to mount successfully, it is not recommended that anyone mount up while in combat, especially in an enclosed space. Nevertheless, in combat, a companion mounted on a centaur is a lethal combination. The companion can use weapons and spells while mounted, although any ranged attack has an accuracy penalty of -1 while standing still, or -2 while moving. Additionally, without a saddle, any time the rider suffers more than 25% of their hitpoints in damage in one turn, they must make a dexterity check to remain mounted. If they are knocked off, they take 1d4 in damage (halved if wearing a helmet), and are considered prone. Any melee attack made by a mounted character on a non-mounted opponent receives +1 to damage.",
					"Downtime Proficiencies: You may select one of the following: Music, Construction, Hunting, or Husbandry.", "Exploration Proficiencies: You may select one of the following: Skyreading, Javelin-making, Herblore, or Medicine.", 
					"Rear end whallop: In addition to your regular attack, you can slam an enemy with your rear hooves for 2d6 damage. Hooves can also be plated to increase their damage. This cannot be used when charging.", "Hyperaware: Centaurs must constantly be on watch for the varied threats that hunt them down in their lands. As such, enemies cannot surprise you when you are awake, and you receive advantage on perception rolls when asleep.", "Combat Proficiency: Javelin", "Long Lives, Many Friends: You have had amiable dealings with the merchants of one major city of your choice, and they grant you a major discount for being such a good partner.", "Well-Travelled, Well-Armed: You may select a proficiency in any non-race specific weapon."
					
			};
			return Plains_Centaur;
		}
		return input;
		
	}
}
