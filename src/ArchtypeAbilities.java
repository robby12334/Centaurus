public class ArchtypeAbilities {
	private static String[] Juggernaut = new String[21];
	private static String[] Militia = new String[21];
	private static String[] Hospitaller = new String[21];
	private static String[] BladeDancer = new String[21];
	private static String[] Woodrover = new String[21];
	private static String[] Justicar = new String[21];
	private static String[] Ranger = new String[21];
	private static String[] Thief = new String[21];
	private static String[] Warlock = new String[21];
	private static String[] Sorcerer = new String[21];
	private static String[] Witch = new String[21];
	private static String[] Wizard = new String[21];

	private static String[] Titan = new String[21];
	private static String[] Devastator = new String[21];
	private static String[] Bastion = new String[21];
	private static String[] Engineer = new String[21];
	private static String[] Commander = new String[21];
	private static String[] Champion = new String[21];
	private static String[] Protector = new String[21];
	private static String[] Examplar = new String[21];
	private static String[] Stalwart = new String[21];
	private static String[] Duelist = new String[21];
	private static String[] MasterAtArms = new String[21];
	private static String[] Dervist = new String[21];

	private static String[] Sentinel = new String[21];
	private static String[] Warden = new String[21];
	private static String[] Reaver = new String[21];
	private static String[] Hunter = new String[21];
	private static String[] Sage = new String[21];
	private static String[] Bandit = new String[21];
	private static String[] Sharpshooter = new String[21];
	private static String[] Vollier = new String[21];
	private static String[] Skirmisher = new String[21];
	private static String[] Spy = new String[21];
	private static String[] Assassin = new String[21];
	private static String[] Burglar = new String[21];

	private static String[] Arcanister = new String[21];
	private static String[] Pyromancer = new String[21];
	private static String[] Cryomancer = new String[21];
	private static String[] Necromancer = new String[21];
	private static String[] Illusiuonist = new String[21];
	private static String[] Channel = new String[21];
	private static String[] Maelstrom = new String[21];
	private static String[] Mindstrom = new String[21];
	private static String[] Portalstrom = new String[21];
	private static String[] Bonecaster = new String[21];
	private static String[] Maleficar = new String[21];
	private static String[] Shapeshifter = new String[21];

	public String getAbilities(String Class) {
		setAbilities();

		return "";
	}

	private void setAbilities() {

		Juggernaut[0] = "Resolve: Once per long rest, you may choose to ignore any status condition.";
		Juggernaut[1] = "Solid: Once per long rest, when you are reduced to 0 hp, you instead drop to 1 hp and remain conscious.";
		Juggernaut[2] = "Vicious Swing: This attack adds 1d6 damage to 1-handed weapon attacks, and 1d8 damage to 2-handed attacks. Enemies next to you receive an attack of opportunity against you if they are not the target. This may be used three times per long rest.";
		Juggernaut[5] = "Fearless: You no longer make morale checks upon encountering scary enemies, and you have advantage for all other morale checks.";
		Juggernaut[7] = "Solid: You gain another use per long rest.";
		Juggernaut[9] = "Vicious Swing: Now adds 1d10 to 1-handed attacks, and 2d8 to 2-handed attacks.";
		
		Militia[0] = "Home Turf: When in your nation, you cannot get lost unless affected by status conditions.";
		Militia[1] = "Cover: You duck under your shield and take only half damage from a melee attack, or no damage from a ranged attack. This ability may be used twice per long rest. ";
		Militia[2] = "Surprise!: You throw your weapon at the enemy. They do not expect this, and if you hit, you may add +2 to your damage roll. The roll to hit is the same as the normal roll. The target must be within fifteen feet, and if you are unable to recover your weapon, you will need to use a spare or your shield.";
		Militia[5] = "Cover: You may absorb three attacks per use of the ability";
		Militia[7] = "Solid: You gain another use per long rest.";
		Militia[9] = "Surprise!: Throwing your weapon at the enemy is now so unexpected you gain +2 to ATK as well as damage.";
		
		Hospitaller[0] = "Prayer of Haste: You pray to Baal-Hammon for one minute, and he grants you a boon of + 20 speed for one hour. This ability may be used once per long rest.";
		Hospitaller[1] = "Lay on Hands: You touch an ally and channel divine magic, restoring 1d8 + CHA hp. This ability adds another 1d8 every other level (3, 5, 7, 9, etc). This ability may be used 1 x Level per long rest.";
		Hospitaller[2] = "Nullify Magic: You take an action to pray, nullifying all magic within ten feet of you. This sphere remains in place, even if you move, and lasts for twenty seconds. You may use this ability 1/2/3/4/5/6/7/8/9/10 times per long rest, the value increasing by one on even numbered levels (2/4/6/8/10/12/14/16/18/20). Nullify magic regains half of its uses upon the completion of a short rest. No spells may be cast in this sphere, including other Hospitaller abilities. Spells entering the sphere are instantly dispelled, except in the following circumstances: If the mage is five levels or more above the hospitaller, they may make a wisdom or intelligence saving throw (Depending on the nature of their spells) to determine if their spell survives. Heretical spells always make this saving throw. Constructs make a CON save each turn or they are destroyed. Heretical constructs have advantage on this save. Nullify Magic’s DC is 10+CHA+proficiency bonus. At level 12, Nullify Magic is cast instantly, extending its duration to four turns in combat.";
		Hospitaller[5] = "Conviction: Against heretics, magical creatures, and constructs, you deal +1 damage with all weapons. You also have advantage on willpower rolls involving these opponents. When other Hospitallers use Nullify Magic, your abilities are not dispelled. You cannot cast new spells while in a nullify sphere, but you are otherwise unaffected";
		Hospitaller[7] = "Lay on Hands: This ability now removes temporary status effects (on fire, freeze, poison, slow, etc";
		Hospitaller[9] = "Nullify Magic: The sphere moves with you, should you desire it.";
		
		BladeDancer[0] = "Confidence: Parrying a blow allows you to make an extra attack your next turn.";
		BladeDancer[1] = "Parry: Every time an enemy successfully attacks you with a melee attack, roll a d10. If you roll a 10, you parry the blow, taking no damage. This ability has no effect on other abilities, spells, ranged attacks, or melee attacks made without weapons.";
		BladeDancer[2] = "Riposte: Every time you successfully parry a melee attack, you may add 1d8 to your next attack roll. ";
		BladeDancer[5] = "Centauran Waltz: You are no longer vulnerable to melee attacks of opportunity.";
		BladeDancer[7] = "Parry: The d10 becomes a d8";
		BladeDancer[9] = "Riposte: Add 1d8 to both attack and damage.";
		
		Justicar[0] = "Favored Enemy: Select 2 alignments. When fighting enemies with those alignments, you receive +2 willpower and ATK. At level 7, this bonus increases to +3, and you may select a third alignment at level 9. ";
		Justicar[1] = "Melquart’s Blessing: Tapping your amulet of Melquart will highlight any person or creature within a hundred feet of you that possesses your favored alignments. This effect lasts for ten seconds. At level 8, it also reveals the trails of those favored enemies, if they have passed that way in the last day.";
		Justicar[2] = "Level 2: Enterprises: Select 3 enterprises in which you are proficient. These enterprises will allow you to make money even when you are not out adventuring, although you will not necessarily sustain yourself in this manner.";
		Justicar[10] = "Level 10: Imperative: You no longer need to make persuasion checks against non-party members; your word as a Justicar is accepted as law.";
		
		Woodrover[0] = "Favored Enemy: Select three animal species/genera that are your favored enemies. Against these creatures, you receive +4 to tracking, perception, and damage rolls. These species must be from your home territory. In addition, you know how to properly harvest every useful part of these creatures.";
		Woodrover[1] = "Animal Speak: You speak the language and dialects of your animal’s scientific order (Carnivora, Artiodactyla, etc).";
		Woodrover[2] = "Enterprises: Select 3 enterprises in which you are proficient. These enterprises will allow you to make money even when you are not out adventuring, although you will not necessarily sustain yourself in this manner.";
		Woodrover[5] = "Scrapper’s Luck: Twice per long rest, you may reroll a damage roll";
		
		Woodrover[0] = "Favored Enemies: Select 2 of the playable classes, or one of the sentient races to be favored enemies. Against these opponents, you deal an additional 1d6 damage, and have +2 to hit. ";
		Woodrover[2] = "Precision: Three times per long rest, you may make a ranged attack against an opponent within your weapon’s primary range, gaining a +4 to hit. At level 9, this ability grants a critical hit on a natural 19 or 20, in addition to the bonus.";
		Woodrover[7] = "Hold: You may regenerate 1d8 hp after killing an enemy. This ability may be used twice per long rest.";
		Woodrover[10] = "Thin Gray Line: You have advantage to hit charging enemies.";

		Thief[0] = "Favored Enemy: Select a sentient race. Against that race, you possess +2 to stealth, persuasion, and deception rolls. You also understand their financial, political, and social systems as a result of studying them for quite some time.";
		Thief[1] = "Twin Fang: When you attack an opponent who is unaware or not facing you, you deal an additional 1d8 damage. This amount increases by 1d8 every other level, and replaces the normal sneak attack damage.";
		Thief[2] = "Devious: You hurl a fistful of sand, dirt, dust, or snow into an opponent’s face. While the attack does no damage, they must make a DEX saving throw or become blinded for two turns. This ability may be used 1*DEX times per long rest.";
		Thief[7] = "Evasion: You do not take half damage from attacks that require a DEX save, you take none instead.";
		


	}

	public static void main(String[] Args) {

	}

}
