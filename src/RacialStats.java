
public class RacialStats {
//	public static void main(String[] args){
//		String output = Race("Servitor");
//		
//		System.out.println(output);
//		
//		
//	}

	static String [] Aleakii = new String[10];
	static String [] Illari =  new String[10];
	static String [] PlainsCentaur =  new String[10];
	static String [] RiverCentaur =  new String[10];
	static String [] FirDwarf =  new String[10];
	static String [] FrostDwarf =  new String[10];
	static String [] Diktator =  new String[10];
	static String [] Servitor =  new String[10];
	static String [] Brakashi =  new String[10];
	static String [] Durog =  new String[10];
	static String [] Untouched =  new String[10];
	static String [] Faetouched =  new String[10];
	static String [] Goblin =  new String[10];
	static String [] Orc =  new String[10];
	static String [] Surfacer =  new String[10];
	static String [] Larys =  new String[10];
	static String [] Ghashim =  new String[10];
	static String [] Viper =  new String[10];
	
	
	public static String Race(String Race){
		String Selected = Race;
		
		String traits = "";
		
		String [] races = new String[]{"", "Aleakii", "Illari", "River Centaur", "Plains Centaur",
				"Frost Dwarf", "Fir Dwarf", "Diktator", "Servitor", "Brakashi", "Durog", "Untouched", 
				"Fae-touched", "Goblin", "Orc", "Surfacer", "Larys", "Ghashim", "Viper"};
		
		if(Selected == "Aleakii"){
			Aleakii[0] = "Vision: While in the air, your perception is increased by 2. Flying high above the terrain will increase your perception to +4. In addition, your tracking rolls are increased by the same amount.";
			Aleakii[1] = "Resistance: Aepyorns have 50% resistance to electrical damage, and advantage on all rolls involving electricity, due to their familiarity with lightning, its effects, and its patterns.";
			Aleakii[2] = "Sky Drop: Grasping an enemy your size or smaller, in your talons, you are able to carry them into the sky for a short distance before slamming them back to the earth. You must make a STR check to determine if you can lift the foe successfully, and the opponent makes a DEX or STR save (whichever is higher) to determine if they can wrest free of your grasp. Should either check fail, you drop your opponent, and they suffer 1d6 impact damage. If you are successful in holding onto your opponent, you slam them into the ground, dealing 3d6 impact damage.";
			Aleakii[3] = "Claustrophobia: While in spaces under 10x10x10 with no obvious access to the sky, you must make periodic morale checks; once when you enter the space, and once when entering combat, as well as whenever the DM deems it appropriate. Failing a morale check will result in you attempting to flee to the outside. You must also make these checks when underground.";
			Aleakii[4] = "Aerial Maneuvers: When struck by a ranged attack while in flight, you may choose to make a Dexterity save and avoid all damage. This ability can be used three times per long rest.";
			Aleakii[5] ="Carnivore: You may choose to consume the flesh of defeated enemies, including other sentients, either raw or cooked. This action will restore up to 1d10 hp, but know that in general, consuming sentient beings is frowned upon by most races in Aruwen.";
			for (int i = 0; i < 6; i++) {
				traits = traits.concat(Aleakii[i] + "\n");
			}
		
		
		}
		else if(Selected == "Illari"){
			Illari[0] = "Vision: While in the air, your perception is increased by 2. Flying high above the terrain will increase your perception to +4. In addition, your tracking rolls are increased by the same amount.";
			Illari[1] = "Resistance: Aepyorns have 50% resistance to electrical damage, and advantage on all rolls involving electricity, due to their familiarity with lightning, its effects, and its patterns.";
			Illari[2] = "Sky Drop: Grasping an enemy your size or smaller, in your talons, you are able to carry them into the sky for a short distance before slamming them back to the earth. You must make a STR check to determine if you can lift the foe successfully, and the opponent makes a DEX or STR save (whichever is higher) to determine if they can wrest free of your grasp. Should either check fail, you drop your opponent, and they suffer 1d6 impact damage. If you are successful in holding onto your opponent, you slam them into the ground, dealing 3d6 impact damage.";
			Illari[3] = "Claustrophobia: While in spaces under 10x10x10 with no obvious access to the sky, you must make periodic morale checks; once when you enter the space, and once when entering combat, as well as whenever the DM deems it appropriate. Failing a morale check will result in you attempting to flee to the outside. You must also make these checks when underground.";
			Illari[4] = "Aerial Maneuvers: When struck by a ranged attack while in flight, you may choose to make a Dexterity save and avoid all damage. This ability can be used three times per long rest.";
			Illari[5] = "Nimble Watchers: Your life has been spent in fear of predators; you gain advantage on DEX saves.";
			for (int i = 0; i < 6; i++) {
				traits = traits.concat(Illari[i] + "\n");
			}
		}
		else if(Selected == "River Centaur"){
			RiverCentaur[0] = "Speedvision: Centaurs suffer no perception or accuracy penalty when moving, except for thrown weapons which possess the penalty described above and have exceptionally clear vision";
			RiverCentaur[1] = "Resistance: Due to their large size, centaurs require a stronger dose of poisons and diseases to be adversely affected by them. As long as a poison is intended to disable, not kill, a smaller target, centaurs have advantage on the saving throw.";
			RiverCentaur[2] = "Rear end whallop: In addition to your regular attack, you can slam an enemy with your rear hooves for 2d6 damage. Hooves can also be plated to increase their damage. This cannot be used when charging.";
			RiverCentaur[3] = "Hyperaware: Centaurs must constantly be on watch for the varied threats that hunt them down in their lands. As such, enemies cannot surprise you when you are awake, and you receive advantage on perception rolls when asleep.";
			RiverCentaur[4] = "Meditative Trance: Long hours of staring into the rivers looking and waiting for food have given you the ability to shut out distractions while still being aware of threats. At any point, you may choose to stop and slip into this trance (which takes about a minute), allowing you to detect hidden enemies within 250 feet.";
			RiverCentaur[5] = "You can also hold your breath for twice as long as normal.";
			for (int i = 0; i < 6; i++) {
				traits = traits.concat(RiverCentaur[i] + "\n");
			}
		}
		else if(Selected == "Plains Centaur"){
			PlainsCentaur[0] = "Speedvision: Centaurs suffer no perception or accuracy penalty when moving, except for thrown weapons which possess the penalty described above and have exceptionally clear vision";
			PlainsCentaur[1] = "Resistance: Due to their large size, centaurs require a stronger dose of poisons and diseases to be adversely affected by them. As long as a poison is intended to disable, not kill, a smaller target, centaurs have advantage on the saving throw.";
			PlainsCentaur[2] = "Rear end whallop: In addition to your regular attack, you can slam an enemy with your rear hooves for 2d6 damage. Hooves can also be plated to increase their damage. This cannot be used when charging.";
			PlainsCentaur[3] = "Hyperaware: Centaurs must constantly be on watch for the varied threats that hunt them down in their lands. As such, enemies cannot surprise you when you are awake, and you receive advantage on perception rolls when asleep.";
			PlainsCentaur[4] = "Long Lives, Many Friends: You have had amiable dealings with the merchants of one major city of your choice, and they grant you a major discount for being such a good partner.";
			PlainsCentaur[5] = "Well-Travelled, Well-Armed: You may select a proficiency in any non-race specific weapon.";
			for (int i = 0; i < 6; i++) {
				traits = traits.concat(PlainsCentaur[i] + "\n");
			}
			
		}else if(Selected == "Frost Dwarf"){
			FrostDwarf[0] = "Advanced Timbersense: Dwarves spend a great deal of time in their forests, and can sense when something is amiss. You gain +2 perception when in forests, and you cannot become lost unless affected by a mental status condition (fear, charm, hallucinations). ";
			FrostDwarf[1] = "Resistance: Dwarves are considerably more sturdy than most other races, and as such, they cannot be stunned or knocked prone.";
			FrostDwarf[2] = "Beware the Depths: Dwarves feel unease being underground, and are downright scared of caves. You suffer -1 Intelligence and -1 Wisdom whenever you are underground, and in natural caves, you must make periodic Morale checks, normally at the DM’s discretion, but you must roll a Morale check when entering, and upon encountering an enemy. Failing a morale check will result in the dwarf fleeing the cave at full speed. Other party members may attempt to call the dwarf back, but this will require an action in combat and a charisma check. The charisma roll must exceed the dwarf’s morale +2 in order to succeed. Certain spells can also be used, with greater success rates.";
			FrostDwarf[3] = "Great Sprinters: Dwarves are excellent sprinters, very dangerous across short distances, but are wasted on cross country. Dwarves can charge up to 50 feet in a combat turn, doing +2 damage with a melee weapon or +4 with a piercing weapon. After this charge, they cannot move more than ten feet the next turn without suffering disadvantage.";
			FrostDwarf[4] = "You lose only 1 Perception in blizzards or heavy rain.";
			FrostDwarf[5] = "You gain 50% resistance to cold damage. ";
			for (int i = 0; i < 6; i++) {
				traits = traits.concat(FrostDwarf[i] + "\n");
			}
		}else if(Selected == "Fir Dwarf"){
			FirDwarf[0] = "Advanced Timbersense: Dwarves spend a great deal of time in their forests, and can sense when something is amiss. You gain +2 perception when in forests, and you cannot become lost unless affected by a mental status condition (fear, charm, hallucinations). ";
			FirDwarf[1] = "Resistance: Dwarves are considerably more sturdy than most other races, and as such, they cannot be stunned or knocked prone.";
			FirDwarf[2] = "Beware the Depths: Dwarves feel unease being underground, and are downright scared of caves. You suffer -1 Intelligence and -1 Wisdom whenever you are underground, and in natural caves, you must make periodic Morale checks, normally at the DM’s discretion, but you must roll a Morale check when entering, and upon encountering an enemy. Failing a morale check will result in the dwarf fleeing the cave at full speed. Other party members may attempt to call the dwarf back, but this will require an action in combat and a charisma check. The charisma roll must exceed the dwarf’s morale +2 in order to succeed. Certain spells can also be used, with greater success rates.";
			FirDwarf[3] = "Great Sprinters: Dwarves are excellent sprinters, very dangerous across short distances, but are wasted on cross country. Dwarves can charge up to 50 feet in a combat turn, doing +2 damage with a melee weapon or +4 with a piercing weapon. After this charge, they cannot move more than ten feet the next turn without suffering disadvantage.";
			FirDwarf[4] = "Woodcunning: +1 perception and +2 to luck rolls when dealing with anything made of wood that is not enchanted. ";
			FirDwarf[5] = "Whittling: You make tokens and trinkets that can be sold, enchanted, or marked with runes. You make one trinket per 12 hours awake, 4 hours if idling (waiting for party members, in a tavern, etc)";
			for (int i = 0; i < 6; i++) {
				traits = traits.concat(FirDwarf[i] + "\n");
			}
		}else if(Selected == "Diktator"){
			Diktator[0] = "Soaring Leap: Given a running start, Elves not wearing more than light armor can leap twice the distance of their running start, up to 60 feet.";
			Diktator[1] = "Vision: Elves possess limited darkvision, being able to see 100 feet in front of them in total darkness, and they have no disadvantage in dim light.";
			Diktator[2] = "Resistance: Elves are invulnerable to disease and highly resistant to poison. Against poisons intended to disable, Elves gain +4 to their CON saving throw. Against poisons intended to kill, Elves gain +2 to their throw.";
			Diktator[3] = "Magical Attunement: Any Elf who decides to pursue the Teles school of magic will receive a proficiency bonus of +1 to all rolls in which they use Teles abilities.";
			Diktator[4] = "Battle Rage: When you drop below 50% and 25% hp, make a morale check. If you fail the morale check, you fly into a rage, attacking until either the enemy or you are dead. You must attack the enemy who caused you to drop below the health threshold, unless you cannot reach them. While in a rage, you gain 1d6 to all attacks, and if you possess more than 5 initiative beyond your opponent, you attack twice every round until the individual enemy is defeated. When you drop from 50% to 25% hp, you make a morale check to determine if your wounds shock you back into lucidity (success) or if you continue to attack in anger (failure).";
			for (int i = 0; i < 5; i++) {
				traits = traits.concat(Diktator[i] + "\n");
			}
		}else if(Selected == "Servitor"){
			Servitor[0] = "Soaring Leap: Given a running start, Elves not wearing more than light armor can leap twice the distance of their running start, up to 60 feet.";
			Servitor[1] = "Vision: Elves possess limited darkvision, being able to see 100 feet in front of them in total darkness, and they have no disadvantage in dim light.";
			Servitor[2] = "Resistance: Elves are invulnerable to disease and highly resistant to poison. Against poisons intended to disable, Elves gain +4 to their CON saving throw. Against poisons intended to kill, Elves gain +2 to their throw.";
			Servitor[3] = "Magical Attunement: Any Elf who decides to pursue the Teles school of magic will receive a proficiency bonus of +1 to all rolls in which they use Teles abilities.";
			Servitor[4] = "Thureos Shield: A small amulet that signifies you are one of the Thureophoi. It can be activated once a day to reduce incoming damage by 5 for the next 4 combat rounds. ";
			for (int i = 0; i < 5; i++) {
				traits = traits.concat(Servitor[i] + "\n");
			}
		}else if(Selected == "Brakashi"){
			Brakashi[0] = "Resistances: All gnomes are resistant to Charm spells, and have disadvantage for all other status effect attacks (grapples, paralysis, poison, petrification)";
			Brakashi[1] = "Vision: The Brakashi get the ‘Speedvision’ trait of the Centaurs due to their close companionship with their people.";
			Brakashi[2] = "Frenzy: 3 times every day, the Brakashi can enter a frenzied state for one turn, allowing them to make an additional attack with advantage, although the next attack against them has advantage as well. ";
			Brakashi[3] = "Limited Telepathy: When paired with a Centaur, they have the ability to speak telepathically within 20ft of each other. (This requires a pairing with a Centaur to be used)";
			for (int i = 0; i < 4; i++) {
				traits = traits.concat(Brakashi[i] + "\n");
			}
		}
		else if(Selected == "Durog"){
			Durog[0] = "Resistances: All gnomes are resistant to Charm spells, and have disadvantage for all other status effect attacks (grapples, paralysis, poison, petrification)";
			Durog[1] = "Vision: Due to the lifetimes of living in their caverns, they have natural darkvision.";
			Durog[2] = "Meditation: You can use active perception while resting, a long rest = 4 hours instead of the normal 8.";
			for (int i = 0; i < 3; i++) {
				traits = traits.concat(Durog[i] + "\n");
			}
		}else if(Selected == "Untouched"){
			Untouched[0] = "Vision: Humans receive no benefits to their vision, but the species has invented the spyglass for viewing distant objects.";
			Untouched[1] = "Racket Horn: When in or near human territory, a blast from this horn will summon a band of Racketeers to aid you. While it can be used in combat, it is better to use it before you enter battle, as it gives the Racketeers time to reach you. The horn can only be heard by Racketeers.";
			Untouched[2] = "Rapid Mastery: You may select your archetype at level 2. ";
			Untouched[3] = "Presence of Mind: 50% reduction to incoming psychic damage and advantage on moral saves (your willpower against someone else’s)";
			Untouched[4] = "Resistance: Humans are resistant to Arcane magic, and take only half damage from such spells.";
			for (int i = 0; i < 5; i++) {
				traits = traits.concat(Untouched[i] + "\n");
			}
		}
		else if(Selected == "Fae-touched"){
			Faetouched[0] = "Vision: Humans receive no benefits to their vision, but the species has invented the spyglass for viewing distant objects.";
			Faetouched[1] = "Racket Horn: When in or near human territory, a blast from this horn will summon a band of Racketeers to aid you. While it can be used in combat, it is better to use it before you enter battle, as it gives the Racketeers time to reach you. The horn can only be heard by Racketeers.";
			Faetouched[2] = "Open Channel: Against an induced fear attack (not the creature’s appearance, but a spell once battle has commenced), your morale check has a penalty of -6.";
			Faetouched[3] = "Attuned: Once a day, you may open yourself to the magic around you, and detect all life within a half mile. You must pass a CON saving throw to avoid passing out after attuning yourself; this value depends on the amount of life within that sphere.";
			Faetouched[4] = "A Blessing or a Curse: You possess one tier-one spell which you may use once per long rest.";
			for (int i = 0; i < 5; i++) {
				traits = traits.concat(Faetouched[i]) + "\n";
			}
		}else if(Selected == "Goblin"){
			Goblin[0] = "Vision: Orcs can see clearly underwater, regardless of whether they are submerged or not.";
			Goblin[1] = "Resistance: Orcs are somewhat resistant to blade and pierce damage. When struck by either weapon, if the hit is at or one above the victim’s AC, they receive only half damage. This value is calculated after modifiers have been applied, including critical hits.";
			Goblin[2] = "Way of the Sea: All Orcs can swim indefinitely.";
			Goblin[3] = "Logical Obedience: Male Orcs both ask for and follow directions given by female counterparts, because they are typically more concerned with other “more important” things.";
			Goblin[4] = "Wicked Widget: You throw a thingamabob you’ve been tinkering with at the enemy. It does 1d8 damage and causes a random effect (1d10).";
			for (int i = 0; i < 5; i++) {
				traits = traits.concat(Goblin[i] + "\n");
			}
		}
		else if(Selected == "Orc"){
			Orc[0] = "Vision: Orcs can see clearly underwater, regardless of whether they are submerged or not.";
			Orc[1] = "Resistance: Orcs are somewhat resistant to blade and pierce damage. When struck by either weapon, if the hit is at or one above the victim’s AC, they receive only half damage. This value is calculated after modifiers have been applied, including critical hits.";
			Orc[2] = "Way of the Sea: All Orcs can swim indefinitely.";
			Orc[3] = "Logical Obedience: Male Orcs both ask for and follow directions given by female counterparts, because they are typically more concerned with other “more important” things.";
			Orc[4] = "Nerves of Logic: You are immune to the visages of scary foes.";
			Orc[5] = "Pain is Learning: Once per long rest, you may ignore 4 +1*level damage received, restoring your current hp by that amount.";
			for (int i = 0; i < 6; i++) {
				traits = traits.concat(Orc[i] + "\n");
			}
		}else if(Selected == "Surfacer"){
			Surfacer[0] = "Vision: Trolls can see perfectly, even in complete darkness. As such, they receive no penalty to perception when in dim light or no light at all.";
			Surfacer[1] = "Resistance: Trolls are resistant to fire and cold damage, taking only half damage whenever it would be applied.";
			Surfacer[2] = "Regeneration: Trolls possess the ability to regenerate. They may take an action in combat to focus their energies and cure themselves of disease or poison. Outside of combat, they may do the same.";
			for (int i = 0; i < 3; i++) {
				traits = traits.concat(Surfacer[i] + "\n");
			}
		}
		else if(Selected == "Larys"){
			Larys[0] = "Vision: Trolls can see perfectly, even in complete darkness. As such, they receive no penalty to perception when in dim light or no light at all.";
			Larys[1] = "Resistance: Trolls are resistant to fire and cold damage, taking only half damage whenever it would be applied.";
			Larys[2] = "Regeneration: Trolls possess the ability to regenerate. They may take an action in combat to focus their energies and cure themselves of disease or poison. Outside of combat, they may do the same.";
			Larys[3] = "Undercunning: Underground, you cannot get lost. Ever. Not gonna happen.";
			Larys[4] = "Sunstone: You possess a sunstone, a magical rock that stores light. You can, should you so choose, bring out the sunstone when in darkness or dim light, and a sphere with a radius of 300 feet (600 foot diameter) will be illuminated. Sunstones can also be affixed to lanterns, staves, and shields. A sunstone cannot be destroyed, but it can be stolen or lost.";
			for (int i = 0; i < 5; i++) {
				traits = traits.concat(Larys[i] + "\n");
			}
		}else if(Selected == "Ghashim"){
			Ghashim[0] = "Vision: San’Trell are largely nocturnal, as such, you possess darkvision. In bright light, you suffer -4 to perception, and in normal daylight, you suffer -2 to perception. At night, however, you have excellent vision unless a light source is generated in front of you.";
			Ghashim[1] = "Resistance: Strong scales, thick muscle, and tough bone make you resist 50% of impact damage.";
			Ghashim[2] = "Vicious fangs: You tear into enemies with a powerful bite, dealing 1d8 damage. The bite bleeds, causing 1d6 damage the next turn. If you hit, the damage can only be resisted by non-living entities.";
			Ghashim[3] = "Cold-blooded: When the weather is warm or it is sunny out, you receive +2 initiative. When the weather is cold, you receive -2 initiative.";
			Ghashim[4] = "Scaled Fury: You may choose to, once per battle, add double your modifier to an attack.";
			Ghashim[5] = "Scarlet Rage: Once per long rest, you may enter a period of manic rage, for five minutes. You receive a second attack and +5 initiative, however the DM selects your targets by assigning each person on the battlefield a number and rolling. Greater priority is given to targets close at hand. You can be knocked out of rage by falling below 50% of your max hp, at which point you roll a Wisdom save against your STR value. You also lose 4 AC entering this state.";
			Ghashim[6] = "Imposing presence: You have advantage on intimidation rolls.";
			for (int i = 0; i < 7; i++) {
				traits = traits.concat(Ghashim[i] + "\n");
			}
			
		}
		else if(Selected == "Viper"){
			Viper[0] = "Vision: San’Trell are largely nocturnal, as such, you possess darkvision. In bright light, you suffer -4 to perception, and in normal daylight, you suffer -2 to perception. At night, however, you have excellent vision unless a light source is generated in front of you.";
			Viper[1] = "Resistance: Strong scales, thick muscle, and tough bone make you resist 50% of impact damage.";
			Viper[2] = "Vicious fangs: You tear into enemies with a powerful bite, dealing 1d8 damage. The bite bleeds, causing 1d6 damage the next turn. If you hit, the damage can only be resisted by non-living entities.";
			Viper[3] = "Cold-blooded: When the weather is warm or it is sunny out, you receive +2 initiative. When the weather is cold, you receive -2 initiative.";
			Viper[4] = "Scaled Fury: You may choose to, once per battle, add double your modifier to an attack.";
			Viper[5] = "Worldly Knowledge: You know how to blend into any crowd, despite your appearance.";
			for (int i = 0; i < 6; i++) {
				traits = traits.concat(Viper[i] + "\n");
			}
			
		}
		return traits;
		
	}
}
