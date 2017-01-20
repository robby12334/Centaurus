public class ArchtypeAbilities {
	private static String[] Juggernaut = new String[21];
	private static String[] Militia = new String[21];
	private static String[] Hospitaller = new String[21];
	private static String[] BladeDancer = new String[21];
	private static String[] Woodrover = new String[21];
	private static String[] Justicar = new String[21];
	private static String[] Ranger = new String[21];
	private static String[] Thief = new String[21];

	private static String[] Titan = new String[21];
	private static String[] Devastator = new String[21];
	private static String[] Bastion = new String[21];
	private static String[] Engineer = new String[21];
	private static String[] Commander = new String[21];
	private static String[] Champion = new String[21];
	private static String[] Protector = new String[21];
	private static String[] Exemplar = new String[21];
	private static String[] Stalwart = new String[21];
	private static String[] Duelist = new String[21];
	private static String[] MasterAtArms = new String[21];
	private static String[] Dervish = new String[21];

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

	//
	private static String[] Warlock = new String[21];
	private static String[] WarlockSpells = new String[12];
	private static String[] Arcanister = new String[21];
	private static String[] ArcanisterSpells = new String[12];
	private static String[] Pyromancer = new String[21];
	private static String[] PyromancerSpells = new String[12];
	private static String[] Cryomancer = new String[21];
	private static String[] CryomancerSpells = new String[12];

	//
	private static String[] Sorcerer = new String[21];
	private static String[] SorcererSpells = new String[12];
	private static String[] Necromancer = new String[21];
	private static String[] NecromancerSpells = new String[12];
	private static String[] Illusionist = new String[21];
	private static String[] IllusionistSpells = new String[12];
	private static String[] Channel = new String[21];
	private static String[] ChannelSpells = new String[12];

	//
	private static String[] Witch = new String[21];
	private static String[] WitchSpells = new String[12];
	private static String[] Maelstrom = new String[21];
	private static String[] MaelstromSpells = new String[12];
	private static String[] Mindstrom = new String[21];
	private static String[] MindstromSpells = new String[12];
	private static String[] Portalstrom = new String[21];
	private static String[] PortalstromSpells = new String[12];

	//
	private static String[] Wizard = new String[21];
	private static String[] WizardSpells = new String[12];
	private static String[] Bonecaster = new String[21];
	private static String[] BonecasterSpells = new String[12];
	private static String[] Maleficar = new String[21];
	private static String[] MaleficarSpells = new String[12];
	private static String[] Shapeshifter = new String[21];
	private static String[] ShapeshifterSpells = new String[12];

	public static String getAbilities(String Class, int lvl) {
		setAbilities();
		String returnStatement= "";
		switch(Class){
			
		case"Titan":
				for(int i = 0; i <= lvl; i++){
					if(!(Juggernaut[i]==(null))){
						returnStatement = returnStatement.concat(Juggernaut[i] + "\n");
					}
				}
				for (int i = 0; i <= lvl; i++) {
					if(!(Titan[i]==(null))){
						returnStatement = returnStatement.concat(Titan[i] + "\n");
					}
				}
			
			break;
			
		case"Devastator":
			for(int i = 0; i <= lvl; i++){
				if(!(Juggernaut[i]==(null))){
					returnStatement = returnStatement.concat(Juggernaut[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Devastator[i]==(null))){
					returnStatement = returnStatement.concat(Devastator[i] + "\n");
				}
			}
		
		break;
		
		case"Bastion":
			for(int i = 0; i <= lvl; i++){
				if(!(Juggernaut[i]==(null))){
					returnStatement = returnStatement.concat(Juggernaut[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Bastion[i]==(null))){
					returnStatement = returnStatement.concat(Bastion[i] + "\n");
				}
			}
		
		break;
		
		case"Engineer":
			for(int i = 0; i <= lvl; i++){
				if(!(Militia[i]==(null))){
					returnStatement = returnStatement.concat(Militia[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Engineer[i]==(null))){
					returnStatement = returnStatement.concat(Engineer[i] + "\n");
				}
			}
		
		break;
		
		case"Commander":
			for(int i = 0; i <= lvl; i++){
				if(!(Militia[i]==(null))){
					returnStatement = returnStatement.concat(Militia[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Commander[i]==(null))){
					returnStatement = returnStatement.concat(Commander[i] + "\n");
				}
			}
		
		break;
		
		case"Champion":
			for(int i = 0; i <= lvl; i++){
				if(!(Militia[i]==(null))){
					returnStatement = returnStatement.concat(Militia[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Champion[i]==(null))){
					returnStatement = returnStatement.concat(Champion[i] + "\n");
				}
			}
		
		break;

		case"Protector":
			for(int i = 0; i <= lvl; i++){
				if(!(Hospitaller[i]==(null))){
					returnStatement = returnStatement.concat(Hospitaller[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Protector[i]==(null))){
					returnStatement = returnStatement.concat(Protector[i] + "\n");
				}
			}
		
		break;
		
		case"Exemplar":
			for(int i = 0; i <= lvl; i++){
				if(!(Hospitaller[i]==(null))){
					returnStatement = returnStatement.concat(Hospitaller[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Exemplar[i]==(null))){
					returnStatement = returnStatement.concat(Exemplar[i] + "\n");
				}
			}
		
		break;
		
		case"Stalwart":
			for(int i = 0; i <= lvl; i++){
				if(!(Hospitaller[i]==(null))){
					returnStatement = returnStatement.concat(Hospitaller[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Stalwart[i]==(null))){
					returnStatement = returnStatement.concat(Stalwart[i] + "\n");
				}
			}
		
		break;
		
		case"Duelist":
			for(int i = 0; i <= lvl; i++){
				if(!(BladeDancer[i]==(null))){
					returnStatement = returnStatement.concat(BladeDancer[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Duelist[i]==(null))){
					returnStatement = returnStatement.concat(Duelist[i] + "\n");
				}
			}
		
		break;
		
		case"Master at Arms":
			for(int i = 0; i <= lvl; i++){
				if(!(BladeDancer[i]==(null))){
					returnStatement = returnStatement.concat(BladeDancer[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(MasterAtArms[i]==(null))){
					returnStatement = returnStatement.concat(MasterAtArms[i] + "\n");
				}
			}
		
		break;
		
		case"Dervish":
			for(int i = 0; i <= lvl; i++){
				if(!(BladeDancer[i]==(null))){
					returnStatement = returnStatement.concat(BladeDancer[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Dervish[i]==(null))){
					returnStatement = returnStatement.concat(Dervish[i] + "\n");
				}
			}
		
		break;
		
		case"Sentinel":
			for(int i = 0; i <= lvl; i++){
				if(!(Justicar[i]==(null))){
					returnStatement = returnStatement.concat(Justicar[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Sentinel[i]==(null))){
					returnStatement = returnStatement.concat(Sentinel[i] + "\n");
				}
			}
		
		break;
		
		case"Warden":
			for(int i = 0; i <= lvl; i++){
				if(!(Justicar[i]==(null))){
					returnStatement = returnStatement.concat(Justicar[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Warden[i]==(null))){
					returnStatement = returnStatement.concat(Warden[i] + "\n");
				}
			}
		
		break;
		
		case"Reaver":
			for(int i = 0; i <= lvl; i++){
				if(!(Justicar[i]==(null))){
					returnStatement = returnStatement.concat(Justicar[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Reaver[i]==(null))){
					returnStatement = returnStatement.concat(Reaver[i] + "\n");
				}
			}
		
		break;
		
		case"Hunter":
			for(int i = 0; i <= lvl; i++){
				if(!(Woodrover[i]==(null))){
					returnStatement = returnStatement.concat(Woodrover[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Hunter[i]==(null))){
					returnStatement = returnStatement.concat(Hunter[i] + "\n");
				}
			}
		
		break;
		
		case"Sage":
			for(int i = 0; i <= lvl; i++){
				if(!(Woodrover[i]==(null))){
					returnStatement = returnStatement.concat(Woodrover[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Sage[i]==(null))){
					returnStatement = returnStatement.concat(Sage[i] + "\n");
				}
			}
		
		break;
		
		case"Bandit":
			for(int i = 0; i <= lvl; i++){
				if(!(Woodrover[i]==(null))){
					returnStatement = returnStatement.concat(Woodrover[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Bandit[i]==(null))){
					returnStatement = returnStatement.concat(Bandit[i] + "\n");
				}
			}
		
		break;
		
		case"Sharpshooter":
			for(int i = 0; i <= lvl; i++){
				if(!(Ranger[i]==(null))){
					returnStatement = returnStatement.concat(Ranger[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Sharpshooter[i]==(null))){
					returnStatement = returnStatement.concat(Sharpshooter[i] + "\n");
				}
			}
		
		break;
		
		case"Vollier":
			for(int i = 0; i <= lvl; i++){
				if(!(Ranger[i]==(null))){
					returnStatement = returnStatement.concat(Ranger[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Vollier[i]==(null))){
					returnStatement = returnStatement.concat(Vollier[i] + "\n");
				}
			}
		
		break;
		
		case"Skirmisher":
			for(int i = 0; i <= lvl; i++){
				if(!(Ranger[i]==(null))){
					returnStatement = returnStatement.concat(Ranger[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Skirmisher[i]==(null))){
					returnStatement = returnStatement.concat(Skirmisher[i] + "\n");
				}
			}
		
		break;
		
		case"Spy":
			for(int i = 0; i <= lvl; i++){
				if(!(Thief[i]==(null))){
					returnStatement = returnStatement.concat(Thief[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Spy[i]==(null))){
					returnStatement = returnStatement.concat(Spy[i] + "\n");
				}
			}
		
		break;
		
		case"Assassin":
			for(int i = 0; i <= lvl; i++){
				if(!(Thief[i]==(null))){
					returnStatement = returnStatement.concat(Thief[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Assassin[i]==(null))){
					returnStatement = returnStatement.concat(Assassin[i] + "\n");
				}
			}
		
		break;
		
		case"Burglar":
			for(int i = 0; i <= lvl; i++){
				if(!(Thief[i]==(null))){
					returnStatement = returnStatement.concat(Thief[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Burglar[i]==(null))){
					returnStatement = returnStatement.concat(Burglar[i] + "\n");
				}
			}
		
		break;
		
		//One unlocks at level 1, Tier Two at level 3, Tier Three at level 8, Tier Four at level 13, and Tier Five at level 18.
		case"Arcanister":
			for(int i = 0; i <= lvl; i++){
				if(!(Warlock[i]==(null))){
					returnStatement = returnStatement.concat(Warlock[i] + "\n");
				}
			}
			for (int i = 0; i < WarlockSpells.length; i++){
				if(!(WarlockSpells[i]==(null))){
					returnStatement = returnStatement.concat(WarlockSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Arcanister[i]==(null))){
					returnStatement = returnStatement.concat(Arcanister[i] + "\n");
				}
				if(i == 3){
					returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(ArcanisterSpells[j]!=null){
							returnStatement = returnStatement.concat(ArcanisterSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(ArcanisterSpells[j]!=null){
							returnStatement = returnStatement.concat(ArcanisterSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(ArcanisterSpells[j]!=null){
							returnStatement = returnStatement.concat(ArcanisterSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(ArcanisterSpells[j]!=null){
							returnStatement = returnStatement.concat(ArcanisterSpells[j] + "\n");
						}
					}
				}
			}
			
		
		break;
		
		case"Pyromancer":
			for(int i = 0; i <= lvl; i++){
				if(!(Warlock[i]==(null))){
					returnStatement = returnStatement.concat(Warlock[i] + "\n");
				}
			}
			for (int i = 0; i < WarlockSpells.length; i++){
				if(!(WarlockSpells[i]==(null))){
					returnStatement = returnStatement.concat(WarlockSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Pyromancer[i]==(null))){
					returnStatement = returnStatement.concat(Pyromancer[i] + "\n");
				}
				if(i == 3){
					returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(PyromancerSpells[j]!=null){
							returnStatement = returnStatement.concat(PyromancerSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(PyromancerSpells[j]!=null){
							returnStatement = returnStatement.concat(PyromancerSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(PyromancerSpells[j]!=null){
							returnStatement = returnStatement.concat(PyromancerSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(PyromancerSpells[j]!=null){
							returnStatement = returnStatement.concat(PyromancerSpells[j] + "\n");
						}
					}
				}
			}
			
		
		break;
		
		case"Cryomancer":
			for(int i = 0; i <= lvl; i++){
				if(!(Warlock[i]==(null))){
					returnStatement = returnStatement.concat(Warlock[i] + "\n");
				}
			}
			for (int i = 0; i < WarlockSpells.length; i++){
				if(!(WarlockSpells[i]==(null))){
					returnStatement = returnStatement.concat(WarlockSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Cryomancer[i]==(null))){
					returnStatement = returnStatement.concat(Cryomancer[i] + "\n");
				}
				if(i == 3){
					returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(CryomancerSpells[j]!=null){
							returnStatement = returnStatement.concat(CryomancerSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(CryomancerSpells[j]!=null){
							returnStatement = returnStatement.concat(CryomancerSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(CryomancerSpells[j]!=null){
							returnStatement = returnStatement.concat(CryomancerSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(CryomancerSpells[j]!=null){
							returnStatement = returnStatement.concat(CryomancerSpells[j] + "\n");
						}
					}
				}
			}
			
		
		break;
		
		case"Necromancer":
			for(int i = 0; i <= lvl; i++){
				if(!(Sorcerer[i]==(null))){
					returnStatement = returnStatement.concat(Sorcerer[i] + "\n");
				}
			}
			for (int i = 0; i < SorcererSpells.length; i++){
				if(!(SorcererSpells[i]==(null))){
					returnStatement = returnStatement.concat(SorcererSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Necromancer[i]==(null))){
					returnStatement = returnStatement.concat(Necromancer[i] + "\n");
				}
				if(i == 3){
					//returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(NecromancerSpells[j]!=null){
							returnStatement = returnStatement.concat(NecromancerSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					//returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(NecromancerSpells[j]!=null){
							returnStatement = returnStatement.concat(NecromancerSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					//returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(NecromancerSpells[j]!=null){
							returnStatement = returnStatement.concat(NecromancerSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					//returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(NecromancerSpells[j]!=null){
							returnStatement = returnStatement.concat(NecromancerSpells[j] + "\n");
						}
					}
				}
			}
			
		
		break;
		
		case"Illusionist":
			for(int i = 0; i <= lvl; i++){
				if(!(Sorcerer[i]==(null))){
					returnStatement = returnStatement.concat(Sorcerer[i] + "\n");
				}
			}
			for (int i = 0; i < SorcererSpells.length; i++){
				if(!(SorcererSpells[i]==(null))){
					returnStatement = returnStatement.concat(SorcererSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Illusionist[i]==(null))){
					returnStatement = returnStatement.concat(Necromancer[i] + "\n");
				}
				if(i == 3){
					//returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(IllusionistSpells[j]!=null){
							returnStatement = returnStatement.concat(IllusionistSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					//returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(IllusionistSpells[j]!=null){
							returnStatement = returnStatement.concat(IllusionistSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					//returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(IllusionistSpells[j]!=null){
							returnStatement = returnStatement.concat(IllusionistSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					//returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(IllusionistSpells[j]!=null){
							returnStatement = returnStatement.concat(IllusionistSpells[j] + "\n");
						}
					}
				}
			}
			
		
		break;
		
		case"Channel":
			for(int i = 0; i <= lvl; i++){
				if(!(Sorcerer[i]==(null))){
					returnStatement = returnStatement.concat(Sorcerer[i] + "\n");
				}
			}
			for (int i = 0; i < SorcererSpells.length; i++){
				if(!(SorcererSpells[i]==(null))){
					returnStatement = returnStatement.concat(SorcererSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Channel[i]==(null))){
					returnStatement = returnStatement.concat(Necromancer[i] + "\n");
				}
				if(i == 3){
					//returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(ChannelSpells[j]!=null){
							returnStatement = returnStatement.concat(ChannelSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					//returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(ChannelSpells[j]!=null){
							returnStatement = returnStatement.concat(ChannelSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					//returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(ChannelSpells[j]!=null){
							returnStatement = returnStatement.concat(ChannelSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					//returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(ChannelSpells[j]!=null){
							returnStatement = returnStatement.concat(ChannelSpells[j] + "\n");
						}
					}
				}
			}
		break;
		
		case"Maelstrom":
			for(int i = 0; i <= lvl; i++){
				if(!(Witch[i]==(null))){
					returnStatement = returnStatement.concat(Witch[i] + "\n");
				}
			}
			for (int i = 0; i < WitchSpells.length; i++){
				if(!(WitchSpells[i]==(null))){
					returnStatement = returnStatement.concat(WitchSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Maelstrom[i]==(null))){
					returnStatement = returnStatement.concat(Maelstrom[i] + "\n");
				}
				if(i == 3){
					returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(MaelstromSpells[j]!=null){
							returnStatement = returnStatement.concat(MaelstromSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(MaelstromSpells[j]!=null){
							returnStatement = returnStatement.concat(MaelstromSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(MaelstromSpells[j]!=null){
							returnStatement = returnStatement.concat(MaelstromSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(MaelstromSpells[j]!=null){
							returnStatement = returnStatement.concat(MaelstromSpells[j] + "\n");
						}
					}
				}
			}
		break;
		
		case"Mindstrom":
			for(int i = 0; i <= lvl; i++){
				if(!(Witch[i]==(null))){
					returnStatement = returnStatement.concat(Witch[i] + "\n");
				}
			}
			for (int i = 0; i < WitchSpells.length; i++){
				if(!(WitchSpells[i]==(null))){
					returnStatement = returnStatement.concat(WitchSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Mindstrom[i]==(null))){
					returnStatement = returnStatement.concat(Mindstrom[i] + "\n");
				}
				if(i == 3){
					returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(MindstromSpells[j]!=null){
							returnStatement = returnStatement.concat(MindstromSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(MindstromSpells[j]!=null){
							returnStatement = returnStatement.concat(MindstromSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(MindstromSpells[j]!=null){
							returnStatement = returnStatement.concat(MindstromSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(MindstromSpells[j]!=null){
							returnStatement = returnStatement.concat(MindstromSpells[j] + "\n");
						}
					}
				}
			}
		break;
		
		case"Portalstrom":
			for(int i = 0; i <= lvl; i++){
				if(!(Witch[i]==(null))){
					returnStatement = returnStatement.concat(Witch[i] + "\n");
				}
			}
			for (int i = 0; i < WitchSpells.length; i++){
				if(!(WitchSpells[i]==(null))){
					returnStatement = returnStatement.concat(WitchSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Portalstrom[i]==(null))){
					returnStatement = returnStatement.concat(Portalstrom[i] + "\n");
				}
				if(i == 3){
					returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(PortalstromSpells[j]!=null){
							returnStatement = returnStatement.concat(PortalstromSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(PortalstromSpells[j]!=null){
							returnStatement = returnStatement.concat(PortalstromSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(PortalstromSpells[j]!=null){
							returnStatement = returnStatement.concat(PortalstromSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(PortalstromSpells[j]!=null){
							returnStatement = returnStatement.concat(PortalstromSpells[j] + "\n");
						}
					}
				}
			}
		break;
		
		case"Bonecaster":
			for(int i = 0; i <= lvl; i++){
				if(!(Wizard[i]==(null))){
					returnStatement = returnStatement.concat(Wizard[i] + "\n");
				}
			}
			for (int i = 0; i < WitchSpells.length; i++){
				if(!(WizardSpells[i]==(null))){
					returnStatement = returnStatement.concat(WizardSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Bonecaster[i]==(null))){
					returnStatement = returnStatement.concat(Bonecaster[i] + "\n");
				}
				if(i == 3){
					//returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(BonecasterSpells[j]!=null){
							returnStatement = returnStatement.concat(BonecasterSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					//returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(BonecasterSpells[j]!=null){
							returnStatement = returnStatement.concat(BonecasterSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					//returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(BonecasterSpells[j]!=null){
							returnStatement = returnStatement.concat(BonecasterSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					//returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(BonecasterSpells[j]!=null){
							returnStatement = returnStatement.concat(BonecasterSpells[j] + "\n");
						}
					}
				}
			}
		break;
		
		case"Maleficar":
			for(int i = 0; i <= lvl; i++){
				if(!(Wizard[i]==(null))){
					returnStatement = returnStatement.concat(Wizard[i] + "\n");
				}
			}
			for (int i = 0; i < WitchSpells.length; i++){
				if(!(WizardSpells[i]==(null))){
					returnStatement = returnStatement.concat(WizardSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Maleficar[i]==(null))){
					returnStatement = returnStatement.concat(Maleficar[i] + "\n");
				}
				if(i == 3){
					//returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(MaleficarSpells[j]!=null){
							returnStatement = returnStatement.concat(MaleficarSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					//returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(MaleficarSpells[j]!=null){
							returnStatement = returnStatement.concat(MaleficarSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					//returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(MaleficarSpells[j]!=null){
							returnStatement = returnStatement.concat(MaleficarSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					//returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(MaleficarSpells[j]!=null){
							returnStatement = returnStatement.concat(MaleficarSpells[j] + "\n");
						}
					}
				}
			}
		break;
		
		case"Shapeshifter":
			for(int i = 0; i <= lvl; i++){
				if(!(Wizard[i]==(null))){
					returnStatement = returnStatement.concat(Wizard[i] + "\n");
				}
			}
			for (int i = 0; i < WitchSpells.length; i++){
				if(!(WizardSpells[i]==(null))){
					returnStatement = returnStatement.concat(WizardSpells[i] + "\n");
				}
			}
			for (int i = 0; i <= lvl; i++) {
				if(!(Shapeshifter[i]==(null))){
					returnStatement = returnStatement.concat(Shapeshifter[i] + "\n");
				}
				if(i == 3){
					returnStatement = returnStatement.concat("Tier 1: \n");
					for (int j = 0; j < 3; j++) {
						if(ShapeshifterSpells[j]!=null){
							returnStatement = returnStatement.concat(ShapeshifterSpells[j] + "\n");
						}
					}
				}
				if(i == 8){
					//returnStatement = returnStatement.concat("Tier 2: \n");
					for (int j = 3; j < 6; j++) {
						if(ShapeshifterSpells[j]!=null){
							returnStatement = returnStatement.concat(ShapeshifterSpells[j] + "\n");
						}
					}
				}
				if(i == 13){
					//returnStatement = returnStatement.concat("Tier 3: \n");
					for (int j = 6; j < 9; j++) {
						if(ShapeshifterSpells[j]!=null){
							returnStatement = returnStatement.concat(ShapeshifterSpells[j] + "\n");
						}
					}
				}
				if(i == 18){
					//returnStatement = returnStatement.concat("Tier 4: \n");
					for (int j = 9; j < 12; j++) {
						if(ShapeshifterSpells[j]!=null){
							returnStatement = returnStatement.concat(ShapeshifterSpells[j] + "\n");
						}
					}
				}
			}
		break;
		
		
		
			
		}
		
		return returnStatement;
	}

	private static void setAbilities() {

		//
		Juggernaut[0] = "Resolve: Once per long rest, you may choose to ignore any status condition.";
		Juggernaut[1] = "Solid: Once per long rest, when you are reduced to 0 hp, you instead drop to 1 hp and remain conscious.";
		Juggernaut[2] = "Vicious Swing: This attack adds 1d6 damage to 1-handed weapon attacks, and 1d8 damage to 2-handed attacks. Enemies next to you receive an attack of opportunity against you if they are not the target. This may be used three times per long rest.";
		Juggernaut[5] = "Fearless: You no longer make morale checks upon encountering scary enemies, and you have advantage for all other morale checks.";
		Juggernaut[7] = "Solid: You gain another use per long rest.";
		Juggernaut[9] = "Vicious Swing: Now adds 1d10 to 1-handed attacks, and 2d8 to 2-handed attacks.";

		Titan[3] = "Second Wind: Once per long rest, you may regenerate 1d10+your level hp. This may be used in combat, and at levels 6, 9, 12, 15, and 18, you add another 1d10.\nResilient: +2 hp per level";
		Titan[7] = "Thick Skin, Thicker Scars: You gain +2 AC against all non-magical attacks.";
		Titan[10] = "Unbowed: When reduced to zero hp by a magical attack, roll a d20. If above 10, you remain conscious and regain 1d6 hp. This ability may be used once per long rest, but activates automatically.";
		Titan[12] = "Scarred Strength: You become resistant to either pierce, blade, or impact damage.";
		Titan[13] = "Unbent: When reduced to zero hp, roll a d20. If above 10, you remain conscious and regain 1d8 hp. This ability may be used once per long rest, but activates automatically.";
		Titan[15] = "Deterrent: Enemies in front of you must make a morale check. If they fail, they do not attack or move that turn. Enemies above your level are unaffected.";
		Titan[18] = "Unbroken: When reduced to zero hp, roll a d20. Any roll higher than 5 and you remain conscious, and regain 4d6 hp. This ability may be used once per long rest, but activates automatically.";
		Titan[20] = "Titan of the Ages: For five turns, you take half damage from magical attacks, and none from physical attacks. This ability may be used once per long rest.";

		Devastator[3] = "Sever: Swinging with tremendous force, you detach an enemy’s limb. This attack has a -4 penalty to hit, but deals 1d10 bonus damage in addition to severing a limb. Each consecutive sever attack adds -2 to the attack roll.\nMighty Weapons: Whenever you wield a 2-handed weapon, you add 1/2 of your level to the weapon’s damage.";
		Devastator[7] = "Best Defense: You gain +2 AC/ATK against sentient enemies";
		Devastator[10] = "Cleave: You swing a 2-handed weapon in a circle around you, dealing 3d10 damage to anyone in melee range. This ability may be used twice per long rest.";
		Devastator[12] = "Rage: Your fury boils over. Until you either fall below 25% hp or combat ends, you have four attacks per turn. This ability may be used once per long rest.";
		Devastator[13] = "Carve a Path: You spin forwards, dealing 5d10 damage to anyone in a cone 15 feet in front of you. This ability may be used once per long rest.";
		Devastator[15] = "Giga Impact: You leap into the air and put your entire weight behind your weapon. You can reach an enemy 15 feet away, and you deal 5d20 damage on hit. This ability may be used once per long rest. You must make a DC 15 CON save to avoid breaking bones in your body.";
		Devastator[18] = "Unholy Terror: An enemy who attacks you must make a morale check. If they fail, you gain a free attack against them in addition to your normal action in your next turn.";
		Devastator[20] = "Unstoppable: Using any Devastator abilities removes any and all status conditions you are affected by.";

		Bastion[3] = "Shield Bash: You drive the broad section of your shield into an enemy’s center of mass, dealing 3d6 impact damage; the opponent must also make a CON save to remain standing. This ability may be used twice per long rest.\nPalisade: When you hold your shield up, you reduce incoming pierce damage by 3.";
		Bastion[7] = "Indefatigable: Moving to protect an ally, you interpose your shield between them and their attacker. You can move at double your speed to use this action; attacks made against you or the person you’re defending suffer disadvantage. This ability may be used twice per long rest.";
		Bastion[10] = "Fortified: With a shield equipped and held in front of you, you are resistant to fire, cold, arcane, and electric attacks.";
		Bastion[12] = "Resolve: You fear nothing. No sentient, monster, beast, magical creature, construct, or spell can shake your courage.";
		Bastion[13] = "Steadfast: You draw all enemy attacks towards your shield for one turn. All enemies within a 60 foot cone must pass a morale check or their attacks will be made against you and your shield. You gain resistance to all attacks made against you in that turn.";
		Bastion[15] = "Shield Master: You can attack enemies twice per turn with your shield, and twice with your weapon.";
		Bastion[18] = "Heavily Fortified: With a shield equipped and held in front of you, you are very resistant to fire, cold, arcane, and electric attacks.";
		Bastion[20] = "Once per long rest, you may catch a critical hit on your shield, and take no damage from it.";

		//
		Militia[0] = "Home Turf: When in your nation, you cannot get lost unless affected by status conditions.";
		Militia[1] = "Cover: You duck under your shield and take only half damage from a melee attack, or no damage from a ranged attack. This ability may be used twice per long rest. ";
		Militia[2] = "Surprise!: You throw your weapon at the enemy. They do not expect this, and if you hit, you may add +2 to your damage roll. The roll to hit is the same as the normal roll. The target must be within fifteen feet, and if you are unable to recover your weapon, you will need to use a spare or your shield.";
		Militia[5] = "Cover: You may absorb three attacks per use of the ability";
		Militia[7] = "Solid: You gain another use per long rest.";
		Militia[9] = "Surprise!: Throwing your weapon at the enemy is now so unexpected you gain +2 to ATK as well as damage.";

		Engineer[3] = "Strike while Hot: You use your smith’s hammer and strike an enemy three times in one turn, aiming for the weakpoints in their armor. You deal 1d8 damage per hit. This ability may be used once per long rest.\nSmith: You can sharpen weapons and improve armor. Once during each long rest, you may choose to take either of those actions for one weapon or piece of armor, improving its damage or resistance by 1. This effect wears off after 30 days. The process takes several hours, long enough that you would not gain the normal benefits of a long rest.";
		Engineer[7] = "Structural Weakness: When indoors, you can detect a building’s weakpoints, provided you are familiar with the architectural style (ie the builders’ race). You can determine if you or a companion can collapse part of the building or items mounted on the walls or ceiling. You can also determine if traps have been set.";
		Engineer[10] = "Smither: You gain proficiency in fletching, javelin-making, and smithing, if you don’t have those proficiencies already. You can now improve weapons and armor by +2, again sacrificing a long rest.";
		Engineer[12] = "Makeshift: You can now take an action and create a barricade or a mantlet using readily available materials. This does not work everywhere, but when it does, you can take cover behind it, and attacks made against you suffer disadvantage, unless the barricade is removed or otherwise bypassed.";
		Engineer[13] = "Structural Vulnerabilities: You can find any building or structure’s weakpoint, even the armor and shields worn by your opponents. Against heavy armor, you now have +2 to attack, and against medium armor, you have +3. You can determine if traps have been set, and exactly where to step to avoid them.";
		Engineer[15] = "Smithest: You possess mastery in smithing, and can reforge armor at a forge to increase the AC it grants by +1.";
		Engineer[18] = "Hammerfall: You can attack three times in one turn, using your smith’s hammer. These attacks each deal 3d8 damage as you strike the opponent’s most vulnerable spots. This ability may be used once per long rest.";
		Engineer[20] = "In Fire Forged: You may craft a masterpiece; a single weapon or suit of armor that provides considerably more damage or armor than its normal version.";

		Commander[3] = "Silence: You gain proficiency in Intimidation.\nRally: You inspire fleeing allies back into the fight. Any routing ally within 100 feet makes a willpower check with advantage. If they pass, they return to the fight. This ability may be used three times per long rest.";
		Commander[7] = "Coordinate: You direct allies to attack a target of your choice. All allies in range of the target must make a DEX check of DC 13. Passing that, they attack the target during your turn with either a basic attack or a cantrip. This ability may be used once per long rest.";
		Commander[10] = "Stand your ground: All routing allies within 100 feet make a DC 16 willpower check, returning to fight if they pass. All non-routing allies have their willpower increased by 5 for the next 3 turns. This ability may be used once per long rest.";
		Commander[12] = "Shield Wall: You call all allies with shields to your side, forming an impenetrable wall. This only works if you have at least one ally with a shield. If you do not, you gain resistance against the next three attacks made on you. If you possess an ally with a shield, they join you and you both gain resistance to the next three attacks, and immunity to crowd control abilities that are fired at you (The DM decides how this applies)";
		Commander[13] = "Recruit: You can recruit up to five NPCs who are friendly or neutral to you to join your cause for a limited time. Friendly characters can be recruited on a persuasion check of DC 10-15, and neutral characters can be recruited on a persuasion check of DC 12-17 with every 50 silver you offer them reducing the DC by one. NPCs will accompany you for up to 30 days, depending on how you and the party treat them.";
		Commander[15] = "Born Leader: You inspire everyone around you. Allies fighting with you in battle gain a constant +2 willpower.";
		Commander[18] = "Battlefield Savior: You speak to an ally, giving them the strength to fight harder. They gain 2d10 hp, which can increase beyond their normal maximum. This ability may be used once per long rest.";
		Commander[20] = "Legendary: Your prowess on the battlefield is such that all enemies within a 100 foot radius suffer -3 to willpower and must make a morale check.";

		Champion[3] = "Feint: You make an attack from an unexpected direction, adding 1d8 to your attack roll. This ability may be used twice per long rest.\nChallenge: You call an enemy who understands your language to battle you, and you alone. If they fail a morale check, they engage you in combat. All others within a 50 foot radius must roll an Intelligence or Wisdom save (whichever is higher) or they will merely watch the two of you engage in single combat. If you are defeated, your allies add -2 to morale rolls until the battle has ended. If your opponent is defeated, they suffer the same fate. This ability may be used once per long rest.";
		Champion[7] = "The Ol’ One Three: You attack twice in one action, adding 1d10 to your damage roll each time. Your enemy gets to attack you in between your first and second attacks, however. This ability may be used once per long rest.";
		Champion[10] = "Hamstring: You plunge a melee weapon into your opponent’s limb, slicing through tendon and bone as well as muscle. The opponent must make a CON save or be crippled. This ability may be used twice per long rest.";
		Champion[12] = "Onslaught: You charge forwards, attacking the three closest enemies. Against the first enemy, you have normal attack and damage rolls, but against the next two, you have +3 to both attack and damage. You can travel up to twice your movement speed with this ability. This ability may be used once per long rest.";
		Champion[13] = "Hero: You have gained fame! Your deeds in battle have made you well recognized. If you tell your stories, taverns of your race will host you free of charge and stores may provide a discount.";
		Champion[15] = "Glory: Once per long rest, you may slay an opponent with less than 40 hp in one hit. You must make a STR check to oppose their CON save, and if your check is higher, you slay that opponent.";
		Champion[18] = "Godlike: Tales of your deeds have spread far and wide. When you arrive in any city, town, or village, roll a d6. If you roll a one, nothing happens. If you roll a 2 or a 3, you are recognized and a crowd gathers. Some people may want autographs, some may give you free things. If you roll a 4 or 5, the local leader invites you to a feast. If you roll a 6, the local leader gives you a quest.";
		Champion[20] = "One Person Army: You may engage up to five opponents in one action, attacking each twice for normal weapon damage. This ability may be used once per long rest.";

		//
		Hospitaller[1] = "Lay on Hands: You touch an ally and channel divine magic, restoring 1d8 + CHA hp. This ability adds another 1d8 every other level (3, 5, 7, 9, etc). This ability may be used 1 x Level per long rest.";
		Hospitaller[2] = "Nullify Magic: You take an action to pray, nullifying all magic within ten feet of you. This sphere remains in place, even if you move, and lasts for twenty seconds. You may use this ability 1/2/3/4/5/6/7/8/9/10 times per long rest, the value increasing by one on even numbered levels (2/4/6/8/10/12/14/16/18/20). Nullify magic regains half of its uses upon the completion of a short rest. No spells may be cast in this sphere, including other Hospitaller abilities. Spells entering the sphere are instantly dispelled, except in the following circumstances: If the mage is five levels or more above the hospitaller, they may make a wisdom or intelligence saving throw (Depending on the nature of their spells) to determine if their spell survives. Heretical spells always make this saving throw. Constructs make a CON save each turn or they are destroyed. Heretical constructs have advantage on this save. Nullify Magic’s DC is 10+CHA+proficiency bonus. At level 12, Nullify Magic is cast instantly, extending its duration to four turns in combat.";
		Hospitaller[5] = "Conviction: Against heretics, magical creatures, and constructs, you deal +1 damage with all weapons. You also have advantage on willpower rolls involving these opponents. When other Hospitallers use Nullify Magic, your abilities are not dispelled. You cannot cast new spells while in a nullify sphere, but you are otherwise unaffected";
		Hospitaller[7] = "Lay on Hands: This ability now removes temporary status effects (on fire, freeze, poison, slow, etc\nPrayer of Haste: You pray to Baal-Hammon for one minute, and he grants you a boon of + 20 speed for one hour. This ability may be used once per long rest.";
		Hospitaller[9] = "Nullify Magic: The sphere moves with you, should you desire it.";

		Protector[3] = "Meditation: Once per long rest, you may choose to meditate for half an hour, focusing on one of three subjects: Magical Items, Runes or Battle Rhythm.\nEndure: As a bonus action, you gain resistance to the next attack made against you. This ability may be used twice per long rest.";
		Protector[7] = "Divine Glare: You use your shield to blast everyone in front of you with divine light. Anyone in a 60-foot cone in front of you must make a CON save to avoid being blinded for 10 minutes. ";
		Protector[10] = "Aura of Protection: You take an action to pray, and divine light surrounds each member of your party, restoring 2d6 hp and absorbing the next three ranged attacks made against your party (Note that this says party, not person). This ability may be used once per long rest.";
		Protector[12] = "Sanctuary: You consecrate the ground around you, forcing back anyone who you consider to be an enemy. The ring of consecrated ground has a diameter of 30 feet, and centers on your position. Anyone you consider to be an enemy is pushed back to the edge of the ring. The ring lasts for one minute and does not move, even if you do. If anyone forced out of ring attempts to enter, they must make a DC 13 STR check or be repelled. Passing the check will allow them to enter the ring, but they take 1d6 arcane damage every turn. This ability may be used once per long rest.";
		Protector[13] = "Divine Influence: You become very resistant to arcane damage, and you may reroll a non-combat check or save once per long rest.";
		Protector[15] = "Divine Mandate: You shout to a target in range. If you use a language they can understand, you may speak a sentence with divine power behind it, forcing them to obey if they fail a DC 17 willpower check. This ability may be used once per long rest.";
		Protector[18] = "Divine Shield: With a shield equipped, you are immune to arcane attacks. In addition, you may throw your shield, dealing 5d8 damage before it returns to you. This ability may be used once per long rest.";
		Protector[20] = "Divine Intervention: Once per long rest, you may pray for Baal-Hammon to intervene in battle. Should he do so, you or a party member will be invincible for three turns. The affected person will possess twice as much hp, twice as many actions, and twice as much movement speed as they normally do.";

		Exemplar[3] = "Herblore: You gain proficiency in Herblore.\nMeditation: Once per long rest, you may choose to meditate for half an hour, focusing on one of three subjects: Magical Creatures, Restoration, Fortitude./nCure Wounds: You reach out, using your arcane magic to heal a target within 15 feet for 1d8 hp. Every 3rd level after this (6, 9, 12, 15, 18) adds another 1d8 to the roll, another 5 feet to the range, and another use per long rest. At level 3, this ability has one use.";
		Exemplar[7] = "Radiance: You emit brilliant light from your weapon. Anyone within 100 feet who possesses darkvision of any kind must make a DC 12 CON save or be blinded for an hour. Anyone with any other kind of vision must make a DC 10 CON save or attack with disadvantage for 2 turns while their vision recovers. This radiance dims to a simple bright light that illuminates an area 500 feet in diameter around you. This ability may be used once per long rest.";
		Exemplar[10] = "Blessed Swing: Your weapon’s damage converts to arcane, and deals an extra 2d8+CHA arcane damage for the next three attacks. This ability may be used once per long rest.";
		Exemplar[12] = "Salvete: You send a surge of arcane magic through your party, healing them all for 2d10+CHA hp. This ability may be used three times per long rest.";
		Exemplar[13] = "Blessed Ground: You consecrate the ground around you, creating a 60-foot diameter ring in which all allies heal 5+2d6 hp per turn for 3 turns. Enemies in the field heal for 5 hp per turn. This ability may be used once per long rest.";
		Exemplar[15] = "Martyr: You shield an ally within 60 feet of you with divine grace. For the next three attacks made against them, they suffer no damage, but you take it yourself. The effect wears off after one minute or after three attacks have been made. This ability may be used once per long rest.";
		Exemplar[18] = "Unwavering Faith: Your prayers to Baal-Hammon are answered. Every member of your party is restored to full health, and any unconscious party members are revived. This ability may be used once per long rest.";
		Exemplar[20] = "Savior: You make an ally or yourself invulnerable for one minute. In addition, their weapon deals an extra 3d10 arcane damage per attack they make. This ability may be used once per long rest.";

		Stalwart[3] = "Meditate: Once per long rest, you may choose to meditate for half an hour, focusing on one of three subjects: Detect Heresy, Detect Constructs, Purity. Note that the range for meditation benefits increases by a mile every level.\nSmite: You throw your weapon at a target within 15 feet. If it hits, it deals normal damage + 1d10 arcane damage. The weapon then returns to your hand. ";
		Stalwart[7] = "Pillar of Faith: You raise your weapon skyward, and a pillar of divine light descends from the sky, hitting an enemy for 3d10 arcane damage. This ability does half damage to all non-magical and non-magic-using enemies. This ability may be used 1+CHA times per long rest.";
		Stalwart[10] = "Level 10: Cone Dispel: You nullify all magic in a 30 foot cone in front of you. Mages hit by this spell are unable to cast spells for two turns. Heretical constructs and summoned objects can resist the effects of this ability; they must make a DC 12 CON save to remain in existence. This ability may be used twice per long rest.";
		Stalwart[12] = "Tempered: You have resistance to all non-physical damage.";
		Stalwart[13] = "Dauntless: As a free action, you may cast nullify magic if a mage has attacked you in their last turn. This ability may be used three times per long rest, and costs a use of nullify magic each time.";
		Stalwart[15] = "Divine Fury:  All magic users, constructs, and non-hospitallers within 30 feet of you take damage. Magic users take 4d10 arcane damage, constructs take 8d8 arcane, and any non-hospitallers who do not fit into either of the above categories take 3d8 fire damage. This ability can be used twice per long rest.";
		Stalwart[18] = "Atonement: You pray, healing yourself for 3d10 hp, and the party for 6d10 hp apiece. This ability may be used once per long rest. This ability does not affect constructs.";
		Stalwart[20] = "Redemption: You revive a fallen ally to max health, and grant them immunity to all damage for five turns. This ability may be used once per long rest. This ability can also restore those who have died within the last ten minutes, provided their body has not been destroyed.";

		//
		BladeDancer[0] = "Confidence: Parrying a blow allows you to make an extra attack your next turn.";
		BladeDancer[1] = "Parry: Every time an enemy successfully attacks you with a melee attack, roll a d10. If you roll a 10, you parry the blow, taking no damage. This ability has no effect on other abilities, spells, ranged attacks, or melee attacks made without weapons.";
		BladeDancer[2] = "Riposte: Every time you successfully parry a melee attack, you may add 1d8 to your next attack roll. ";
		BladeDancer[5] = "Centauran Waltz: You are no longer vulnerable to melee attacks of opportunity.";
		BladeDancer[7] = "Parry: The d10 becomes a d8";
		BladeDancer[9] = "Riposte: Add 1d8 to both attack and damage.";

		Duelist[3] = "Watchful: When facing only one humanoid opponent in melee combat, you have +2 AC. Note that you must be both facing and aware of them to receive this bonus.\nRecovery: Three times per long rest, you may reroll your Parry.";
		Duelist[7] = "Narrow Profile: Twice per long rest you may dodge a ranged attack or aimed spell, taking no damage.";
		Duelist[10] = "Disarm: Your next successful attack disarms your opponent, causing them to drop their weapon. If unarmed, you deal a bonus 1d10 damage instead. Enemies who possess weapons as integral parts of their forms or their armor (ie wrist-mounted blades, Wraith baneblades) are considered unarmed with regards to this ability.";
		Duelist[12] = "Counter: You block an opponent’s blow and use their momentum to your advantage. This ability, which always hits, deals an extra 3d8 pierce damage. This ability may be used twice per long rest.";
		Duelist[13] = "Proper Guard: Once per long rest, you may block and dodge every attack after the first one made against you for three turns. For example, if three opponents attack you in one turn, only one of their melee attacks can hit. This ability has no effect on ranged weapons or magic. ";
		Duelist[15] = "Dancing Master: You flow around your opponents, attacking them wherever you find gaps in their armor. You may attack up to four times in one turn, on up to four opponents. You deal normal damage, but you gain +2, +4, and +6 to your attack rolls for the second, third, and fourth opponents, respectively.";
		Duelist[18] = "Tango: Every consecutive turn in which you fight the same opponent in melee, you gain +3 to your attack roll and your DEX bonus to your damage. (eg after six turns against the opponent, you have +15 ATK and +5*DEX bonus to damage)";
		Duelist[20] = "Unkillable: For five turns, you cannot be hit by melee attacks, and you attack with advantage. This ability may be used once per long rest.";

		MasterAtArms[3] = "Superiority: You attack an opponent three times in one turn, twice with your melee weapon, once with your secondary weapon. This ability may be used twice per long rest.\nDevious: You receive proficiency in hand crossbows, which take quickfire darts as ammunition.";
		MasterAtArms[7] = "Skewer: You drive your melee weapon into an enemy with surprising force. If your enemy is not wearing armor, they take 1d10 pierce damage for every point over their AC your roll. If your enemy is wearing armor, they take 1d6 for every point over their AC you roll. This ability may be used once per long rest.";
		MasterAtArms[10] = "Touche: You shoot an already wounded enemy with your crossbow in the same spot they were already hit. They make a CON save to avoid passing out. If their HP is currently greater than half of their maximum, they merely take double damage. This ability may be used once per long rest.";
		MasterAtArms[12] = "Fan: You fire three bolts from your crossbow in quick succession, each dealing normal damage. This ability may be used once per long rest.";
		MasterAtArms[13] = "True Mastery: You gain mastery of your rapier, granting you advantage on attack rolls. More than that, you gain a permanent +1 to damage every time you kill an enemy, up to a total of +20.";
		MasterAtArms[15] = "Simple Solution: You shoot an enemy who has full health with your crossbow. They make a DC 15 CON save. If they fail, they die. If they succeed, they take normal damage. This ability may be used once per long rest.";
		MasterAtArms[18] = "Fast Hands: You can reload your crossbow and fire it in the same turn.";
		MasterAtArms[20] = "Seriously?!: You shoot an enemy in an extremely vulnerable location, and then stab them. This attack is fatal unless the enemy is resistant to pierce damage, in which case it does the normal damage for both weapons. This ability may be used once per long rest.";

		Dervish[3] = "Cross Parry: You successfully parry attacks when you roll a 9 or a 10.\nDual Wield: You may wield two one-handed melee weapons at the same time, without penalty. Add all modifiers to the weapon in your dominant hand, and your DEX modifier to the weapon in your non-dominant hand.";
		Dervish[7] = "Whirligig: You spin like a top, cutting through any enemy within a ten-foot diameter sphere. You deal 4d6 blade damage to all enemies in that sphere. This ability may be used once per long rest.";
		Dervish[10] = "Arrow Grinder: You may parry ranged attacks as well; this requires rolling a d20 and getting a 20.";
		Dervish[12] = "Superiority Complex: You no longer make willpower checks against enemies with less than 100 max hp.";
		Dervish[13] = "Untouchable: You parry all melee attacks for three turns. Ranged attack parries take a 10 on a d10 during this period. This ability may be used once per long rest.";
		Dervish[15] = "Wheel of Death: You surge forwards, dancing between enemies and cutting into them. You attack each enemy within a 30-foot cone, dealing normal damage but with +5 to ATK. This ability may be used once per long rest.";
		Dervish[18] = "March of Death: You attack the three enemies nearest you (up to 30 feet away) three times each.  This ability may be used once per long rest.";
		Dervish[20] = "Twin Furies: Your blades accelerate beyond reasonable speed, and you land a series of blows on a single opponent. Roll 2 d10s. The difference between those numbers is the number of attacks you make in a single turn on your target. The attacks deal normal damage. This ability may be used once per long rest.";

		//
		Justicar[0] = "Favored Enemy: Select 2 alignments. When fighting enemies with those alignments, you receive +2 willpower and ATK. At level 7, this bonus increases to +3, and you may select a third alignment at level 9. ";
		Justicar[1] = "Melquart’s Blessing: Tapping your amulet of Melquart will highlight any person or creature within a hundred feet of you that possesses your favored alignments. This effect lasts for ten seconds. At level 8, it also reveals the trails of those favored enemies, if they have passed that way in the last day.";
		Justicar[2] = "Level 2: Enterprises: Select 3 enterprises in which you are proficient. These enterprises will allow you to make money even when you are not out adventuring, although you will not necessarily sustain yourself in this manner.";
		Justicar[10] = "Level 10: Imperative: You no longer need to make persuasion checks against non-party members; your word as a Justicar is accepted as law.";

		Sentinel[3] = "Code: Sentinels are expected to hunt down, fight, kill, and otherwise deal with sentient beings who do not obey the laws of the land. They may choose how exactly to go about doing this, primarily by deciding which laws to enforce, and which lawbreakers to pursue. Sentinels can choose to enforce the laws of their nation of origin, the laws of the nation in which they reside, or certain crimes, such as murder or robbery. Breaking this code, by taking a contract from a criminal or allowing certain types of criminal to get away, may result in loss of all of your Sentinel abilities except Justice and Dread Pursuer. \nLong Arm: You have advantage when tracking sentient beings. If their alignment is one of your favored enemies, you can track them regardless of how well they hid their trail. ";
		Sentinel[4] = "Seeker: You have advantage on Investigation and Insight rolls.";
		Sentinel[5] = "Prosecution: When wielding a specialized weapon, add double your proficiency bonus to both your attack and damage rolls.";
		Sentinel[7] = "Justice: You may take an enemy prisoner, holding them captive until you decide what to do with them. ";
		Sentinel[10] = "Thief-taker: You are not susceptible to sneak attacks made by sentient opponents. ";
		Sentinel[12] = "License to Kill: Critical hits can now occur when you roll a natural 19, but only against your favored opponents.";
		Sentinel[13] = "Pursuit: No sentient can escape you. Even mages who teleport cannot get away from your uncanny tracking abilities.";
		Sentinel[15] = "Melquart’s Due: You may “execute” a sentient opponent right there on the battlefield, if they possess less than 5*your level HP. This ability is treated as a normal attack and may be used twice per long rest.";
		Sentinel[18] = "Dread Pursuer: All sentient enemies must make a willpower save to avoid fleeing from your presence. Favored enemies have disadvantage.";

		Warden[3] = "Code: Wardens are dedicated to the eradication of creatures that pose a threat to sentient beings. They range all over Aruwen, hunting either one particular type of creature, or unpleasant beasts in general. Wardens often have tunnel vision regarding one species, as detailed below. This nemesis is often what drives a warden to range all over the continent. The only way to break the Warden oath is to refuse to protect sentients from creatures, or to place a creature’s life over that of a sentient. When the oath is broken, the warden runs the risk of losing all abilities except Sentient Guardian and Distraction.\nDistraction: You may attempt to distract creatures by making noise or otherwise appealing to their base instincts. The creature must pass a Wisdom save or it will proceed to focus solely on you, either attacking or simply licking your hand, depending on its normal disposition. This effect lasts for up to a minute, but only one creature is affected at a time. At level 10, you will be able to instantly kill the creature if it comes into melee range and is your size or smaller.";
		Warden[5] = "Sentient Guardian: When fighting creatures that are favored enemies, you possess advantage on your initiative roll.";
		Warden[6] = "Nemesis: Select a species of creature. This species becomes your nemesis; you hate them and the feeling is mutual. When encountering the creature in the wild, you must make a willpower save if you wish to avoid attacking it. You know everything about this species, and thus have advantage on all rolls involving them. However, your loathing makes you more susceptible to tunnel vision, and as such, they deal double damage to you when they attack.";
		Warden[7] = "Colossus Slayer: You specialize in taking down a particularly large and unpleasant enemy, because you’ve done it before. Select an enemy of size huge or larger. This can include, but is not limited to the following: Stone Phasmids, Fire Giants, Titanoboas, Deinosuchus, Kronosaurus, Tytonides, San’Trell Maulers, Blackfangs, Meganeura, or Cumolossi. Against this particular foe, you have advantage on saving throws against the creature, and advantage on attacks against them as well. The enemy must be considered a creature, not a construct or a sentient being. \n Slayer: At levels 7, 10, 13, 16, and 19, you may select one of the following abilities:\n- Nature’s Foe: You possess advantage on STR saves when grappled by a creature.\n- Experienced Hunter: Select a favored terrain. While in this terrain, you cannot get lost, you have advantage on tracking anything, and you can track favored enemies effortlessly.\n- Nightstalker: You see normally when outside at night. This benefit is not applicable when indoors, underground, or near light sources.\n- Master of the Depths: Against creatures in the Depths, you have +4 ATK and DMG.\n- Water Warrior: You can attack submerged enemies without disadvantage.\n- Grounder: You know exactly where to aim a ranged weapon in order to hit a flying enemy, and thus gain +3 against flying creatures.\n- Day Hunter: +4 Perception in daylight when outside.";

		Reaver[3] = "Code: The reaver’s code is simple: Take a contract, keep your word. Breaking a contract may result in a loss of abilities.\nContacts: Reavers are mercenaries, and as such, they have several contacts in various locales. These contacts can be shady or not, and they know how to contact you in the field and vice versa. They may offer you jobs from time to time.\nBar Fighter: You’ve been in enough taverns to know when a fight is brewing, and when it breaks out, you are very, very good at holding your own. Any simple weapon you wield uses the next highest die for damage rolls (1d6 becomes 1d8, etc). ";
		Reaver[5] = "Money Makes the World Go ‘Round: You have +2 willpower when fighting anything you’ve been paid to fight. This bonus also applies when you are relatively sure that you will find loot after defeating this enemy. ";
		Reaver[7] = "I Like Living: You receive a +2 to persuasion rolls against people who wish to kill or injure you. You may also bribe these people more effectively than normal. ";
		Reaver[8] = "Balance: Fighting in unusual situations and contending with bizarre demands has given you a sense for when things are amiss. You gain advantage on Insight and Perception rolls. ";
		Reaver[10] = "Diverse Specialties: You gain proficiency in a second specialized weapon.";
		Reaver[12] = "Flexibility: You’ve seen a lot of combat, and a lot of it has involved people slinging fireballs, arrows, and axes at you. After a while, you start to realize that it’s not that difficult. You may select any level one, two, or three ability from any archetype or class, or you may select a tier one spell to learn. You may select another ability or spell at levels 16 and 20. ";
		Reaver[13] = "Discipline: You gain mastery in your preferred weapon.";
		Reaver[17] = "Veteran: You gain advantage on attack rolls against favored enemies, and anyone with less AC than you.";

		//
		Woodrover[0] = "Favored Enemy: Select three animal species/genera that are your favored enemies. Against these creatures, you receive +4 to tracking, perception, and damage rolls. These species must be from your home territory. In addition, you know how to properly harvest every useful part of these creatures.";
		Woodrover[1] = "Animal Speak: You speak the language and dialects of your animal’s scientific order (Carnivora, Artiodactyla, etc).";
		Woodrover[2] = "Enterprises: Select 3 enterprises in which you are proficient. These enterprises will allow you to make money even when you are not out adventuring, although you will not necessarily sustain yourself in this manner.";
		Woodrover[5] = "Scrapper’s Luck: Twice per long rest, you may reroll a damage roll";

		Hunter[3] = "Pinpoint: You take aim at a vulnerable section of your enemy, usually a joint or a gap in their armor or chitin. Add +2 to your hit roll and 1d6 to the damage roll, this value increasing by an additional 1d6 every second level. This ability may be used twice per long rest. \nHunting Blind: You have advantage on stealth rolls against creatures. Stealth attacks against creatures deal an additional 1d10, adding another d10 every third level. ";
		Hunter[5] = "Hunter’s Wit: You have advantage on tracking any creature, and you do not need to roll to track your favored enemies.";
		Hunter[6] = "Quickdraw: If a creature attacks from stealth, you get a reaction before they can attack.";
		Hunter[7] = "Culling: You attack up to three enemies in one turn, dealing normal damage. This ability may be used twice per long rest. ";
		Hunter[10] = "Natural Lore: You gain mastery in herblore and trapping.";
		Hunter[13] = "Aim for the Eyes: You try to slay a creature size huge or larger in one shot. If you hit, the creature makes a CON save. If they fail, they take five times your damage roll as damage. If they pass the save, they take half of that damage. This ability may be used twice per long rest. ";
		Hunter[15] = "Beast Feller: You slay any creature in one shot, provided your attack hits. Sentients and constructs take half their maximum HP as damage. This may be used once per long rest.";
		Hunter[20] = "Woodrunner: You climb a tall tree and attack from above, leaping onto your opponent. For every ten feet you jump and every twenty pounds you weigh, add a d6 to your melee weapon’s damage. This ability may be used once per long rest. You have advantage to hit, and if you miss, you take normal fall damage.";

		Sage[3] = "Nature Friendship: You are perfectly at home in nature, and you gain the following abilities:\nNo animal handling checks for companion animals.\nKeen Eyes, Keen Ears: You may add your proficiency bonus to perception rolls when sensing creatures (add it again if already proficient).\nKeen Eyes, Keen Ears: You may add your proficiency bonus to perception rolls when sensing creatures (add it again if already proficient). ";
		Sage[7] = "You have advantage on all animal handling checks, and you speak all languages and dialects used by your animal companion’s class (Mammalia).";
		Sage[11] = "You gain a second animal companion, and you speak all languages and dialects used by your companion’s phylum (Chordata).";
		Sage[15] = "You can speak to all animals, and you receive a third animal companion.\nPrimal Magic: You have lived in harmony with the natural world long enough that you have learned some truly hidden secrets. You develop the power to use “primal magic,” allowing you to bend nature to your will. You may cause plants, bodies of water, and animals to obey your will. 5 uses of this power are available per long rest.";
		Sage[10] = "Call of the Wild: You may roar, causing 1d6 local animals to rush to your aid. Their strength and disposition may vary, so be cautious. This ability may be used once per short rest.";
		Sage[13] = "Natural Remedy: You gain mastery in medicine and Herblore.";
		Sage[20] = "Wrath of Aruwen: You can call upon the ambient magic of nature to aid you. Plants surround your limbs, enemies within 100 feet are restrained for 2 turns unless they pass a DC 17 STR save, and you become a construct of nature for 8 turns. You can use all the abilities of a wose shaman, and you possess their resistances as well (very resistant to pierce, resistant to impact and blade, very vulnerable to fire, vulnerable to arcane and cold, normal damage to poison and electric). This ability may be used once per long rest.";

		Bandit[3] = "Stand and Deliver: You gain proficiency in Intimidation and Persuasion.\nBruiser: You slug an enemy in melee range, dealing 1d6 + half of your AC as impact damage. This ability does half damage against armored opponents, and may be used three times per long rest.";
		Bandit[5] = "Highway Robbery: You add double your proficiency bonus to attacks against unarmored, sentient opponents.";
		Bandit[7] = "Battery: You attack a single opponent with tremendous force, dealing an additional 2d6 damage. This ability gains another d6 every second level and may be used once per long rest. Killing an enemy with this attack forces all other enemies within 25 feet to make a morale check or flee. ";
		Bandit[8] = "Bodyguard: You may again add your proficiency bonus to any attack against an enemy that just attacked your ally, both to damage and attack rolls. ";
		Bandit[9] = "Level 9: Dread Ambusher: You gain advantage when making stealth attacks, and if you kill your first opponent in one hit, you can take another combat turn.";
		Bandit[10] = "Dread Marauder: You gain advantage on Intimidation rolls, and proficiency in Athletics.";
		Bandit[12] = "Dread Outlaw/Dread Jenny: You receive +5 attack against either Justicars, or the nobility of Aruwen (and their retinues). You must select one or the other, not both. In addition, you learn to recognize the signs of when either Justicars or nobles have passed by within the last day. ";
		Bandit[15] = "Dread Bandit: All non-military sentients of your species must make a morale check when they enter into combat with you. This check is made at disadvantage. Other sentient species must also make morale checks, this time without disadvantage. Soldiers do not.";
		Bandit[20] = "Dread Pillager: Every time you kill a sentient enemy all other sentient enemies within 100 feet of you must make a morale check. If they fail, they flee. ";

		//
		Ranger[0] = "Favored Enemies: Select 2 of the playable classes, or one of the sentient races to be favored enemies. Against these opponents, you deal an additional 1d6 damage, and have +2 to hit. ";
		Ranger[2] = "Precision: Three times per long rest, you may make a ranged attack against an opponent within your weapon’s primary range, gaining a +4 to hit. At level 9, this ability grants a critical hit on a natural 19 or 20, in addition to the bonus.";
		Ranger[7] = "Hold: You may regenerate 1d8 hp after killing an enemy. This ability may be used twice per long rest.";
		Ranger[10] = "Thin Gray Line: You have advantage to hit charging enemies.";


		Sharpshooter[3] = "Second Wind: Once per long rest, you may regenerate 1d10+your level hp. This may be used in combat, and at levels 6, 9, 12, 15, and 18, you add another 1d10.\nResilient: +2 hp per level";
		Sharpshooter[7] = "Thick Skin, Thicker Scars: You gain +2 AC against all non-magical attacks.";
		Sharpshooter[10] = "Unbowed: When reduced to zero hp by a magical attack, roll a d20. If above 10, you remain conscious and regain 1d6 hp. This ability may be used once per long rest, but activates automatically.";
		Sharpshooter[12] = "Scarred Strength: You become resistant to either pierce, blade, or impact damage.";
		Sharpshooter[13] = "Unbent: When reduced to zero hp, roll a d20. If above 10, you remain conscious and regain 1d8 hp. This ability may be used once per long rest, but activates automatically.";
		Sharpshooter[15] = "Deterrent: Enemies in front of you must make a morale check. If they fail, they do not attack or move that turn. Enemies above your level are unaffected.";
		Sharpshooter[18] = "Unbroken: When reduced to zero hp, roll a d20. Any roll higher than 5 and you remain conscious, and regain 4d6 hp. This ability may be used once per long rest, but activates automatically.";
		Sharpshooter[20] = "Titan of the Ages: For five turns, you take half damage from magical attacks, and none from physical attacks. This ability may be used once per long rest.";

		Vollier[3] = "Volley gains one extra attack per turn.";
		Vollier[5] = "Close In: You may draw a melee weapon, attack with it, and sheathe it in a single action.\nVolley gains an additional 1d6 pierce damage per shot.";
		Vollier[7] = "Rapid Fire: You gain an extra attack.";
		Vollier[8] = "Patterns of Attack: Against your favored enemies, you do not suffer disadvantage when using your Volley ability.";
		Vollier[10] = "Volley gains an additional 1d10 pierce damage per shot, replacing 1d6.\nMultishot: You fire twice your maximum number of attacks at your level in one turn, each shot deals half damage but can be directed at any target in range. This ability may be used once per long rest.";
		Vollier[13] = "Volley gains the first attack made each turn does not have disadvantage.";
		Vollier[16] = "No attacks in the volley are made with disadvantage using Volley.\nRapid Reload: You no longer need to take any actions reloading weapons.";
		Vollier[12] = "Expanded Quiver: You may carry twice the normal amount of ammunition in each quiver. Tis bigger on the inside, apparently.";
		Vollier[20] = "Your maximum range increases by 100*DEX feet while using Volley.";

		Skirmisher[3] = "Formation Breaker: You may hurl a throwing weapon that staggers your opponent, knocking them back 5 feet and dealing an additional 1d6 pierce damage + your modifiers. This ability may be used once per long rest, and the number of uses increase by 1 every third level.\nFleet of Foot: You gain +10 speed at level 3 and 13.\nFrank: You gain the ability to use a shield when wielding a one handed throwing weapon (javelin, knife, or hatchet)";
		Skirmisher[5] = "Piercing Throw: Three times per long rest, you throw a weapon with more force than normal. Javelins will pierce their target and hit another target up to 10 feet behind the first, axes will permanently reduce the target’s AC by 2, and knives will cause an additional 2d6 blade damage as they tear through flesh. All thrown weapons do an additional 1d10 piercing damage.";
		Skirmisher[7] = "Twinshot: You throw two javelins, knives, or axes at once; both hit the same target. This ability may be used once per long rest.";
		Skirmisher[8] = "Long Arm: Your maximum and effective range with throwing weapons increases by 30 feet.";
		Skirmisher[10] = "Adept Disengage: You may disengage and make a ranged attack in the same turn. This ability may be used twice per long rest.";
		Skirmisher[12] = "Nimble of Foot: You avoid attacks of opportunity when moving to attack.";
		Skirmisher[15] = "Bring It Down: You gain +5 ATK and 2d8 bonus damage against creatures size huge or larger when using thrown weapons.";
		Skirmisher[20] = "Olympian: Your maximum and effective thrown weapon ranges increase by 100 feet, and you now do an additional 2d10 pierce damage with thrown weapons.";

		//
		Thief[0] = "Favored Enemy: Select a sentient race. Against that race, you possess +2 to stealth, persuasion, and deception rolls. You also understand their financial, political, and social systems as a result of studying them for quite some time.";
		Thief[1] = "Twin Fang: When you attack an opponent who is unaware or not facing you, you deal an additional 1d8 damage. This amount increases by 1d8 every other level, and replaces the normal sneak attack damage.";
		Thief[2] = "Devious: You hurl a fistful of sand, dirt, dust, or snow into an opponent’s face. While the attack does no damage, they must make a DEX saving throw or become blinded for two turns. This ability may be used 1*DEX times per long rest.";
		Thief[7] = "Evasion: You do not take half damage from attacks that require a DEX save, you take none instead.";

		Spy[3] = "You gain the following proficiencies: Investigation, Tracking, and Insight. At level 13, you gain mastery in these proficiencies.\nDowntime Proficiency: You gain the Writing proficiency, and as such, you learn to write Common. In addition, every third level, you may learn to write and read another language you can speak.";
		Spy[5] = "Specialty: You select an espionage specialty. This takes one of several forms: Military, Nobility or Guild.\nBlackmail: You gain advantage on persuasion and intimidation rolls regarding your favored enemies.";
		Spy[6] = "Intuition: In battle, you can make an insight check on all opponents up to sixty feet in front of you as a free action. Depending on your specialty, you can determine new information about your foes that gives you an edge in combat. Regardless, your AC and weapon damage both increase by 1d6 for five turns. This ability may be used three times per long rest, but only once per fight.";
		Spy[10] = "Codemaster: You gain the ability to create impeccable ciphers that cannot be cracked without either the code, or expertise in the skill.";
		Spy[7] = "Scarred Strength: You become resistant to either pierce, blade, or impact damage.";
		Spy[13] = "Unbent: When reduced to zero hp, roll a d20. If above 10, you remain conscious and regain 1d8 hp. This ability may be used once per long rest, but activates automatically.";
		Spy[15] = "Lie Detector: You can always tell when someone is lying. ";

		Assassin[3] = "Air Assassination: You learn the most entertaining means of assassination; doing so from above the target. If there is a tall object to climb, you do so easily, and leap from it onto your target. This ability may be used twice per long rest, and adds an additional 2d8 pierce damage to your attack. If you miss, you take normal fall damage.\nExploration Proficiencies: You gain proficiency in poisonmaking, medicine, and Herblore. At level 13, you gain mastery in these proficiencies.\nYou gain proficiency in Construction, which allows you to determine the best vantage points and points of ingress and egress for a building.\nWeakening poison unlocks at level 3.";
		Assassin[5] = "Phantom Blades: You strike from the shadows, dealing an additional 3d8 damage on your next attack. This ability and may be used twice per long rest";
		Assassin[6] = "Paralysis poison unlocks at level 6.";
		Assassin[7] = "Agent of Fate: Against your favored enemies, you possess an advantage on willpower checks. ";
		Assassin[9] = "Lethal poison unlocks at level 9.";
		Assassin[10] = "Brutalize: You stab an enemy multiple times in quick succession, with such fury in your eyes that any enemy who witnesses the act must make a morale check or flee, provided you kill your target. This ability deals 8d8 pierce damage, and may be used once per long rest.";
		Assassin[11] = "Independent Thinker: You make willpower and wisdom saves with advantage.";
		Assassin[15] = "Invisible: You never need to make Stealth checks. In addition, you can choose to enter stealth while in combat, though this does require a roll.";
		Assassin[18] = "Murderer: You may instantly slay up to three unaware enemies, provided they are within 10 feet of each other. The enemies must be sentient and alive. This ability may be used once per long rest.";
		Assassin[20] = "Legendary Assassin: Only a handful of extremely perceptive people will ever be able to spot-and therefore stop-your deadly blades and abilities. Simply put, you are deadly.";
		
		Burglar[3] = "You gain the following proficiencies: Appraisal, Arcana, and Sleight of Hand. At level 13, you gain mastery in these skills.\nYou gain proficiency in gemcutting and driving.\nYou begin to develop a “sense” of when there is a trap, magical or mundane, nearby. You get a bad feeling when you are within 30 feet of a trap. At level 8, this translates into the ability to recognize the process for disarming the trap, no matter what kind.";
		Burglar[5] = "Fast Hands: You may take a free action to snatch a small item, such as a key or a purse, from someone. You must still make a sleight of hand check against their passive or active perception to determine if they notice. At level 10, you may use this same check to unlock objects and disable traps without someone noticing.";
		Burglar[7] = "Experienced: You’ve seen enough traps that you receive advantage on perception rolls involving them. At level 12, you are able to disarm them whenever possible.";
		Burglar[13] = "Blindsense: Sneaking around in the dark has rendered you capable of fighting blind. As long as you can hear, no invisible or hidden sentient, construct, or creature can be within 10 feet of you without being detected, and you do not suffer disadvantage while in combat if in complete darkness.";
		Burglar[15] = "Amazing Reflexes: You may take three turns at the start of any combat. The first turn is taken at the beginning of the combat round, the second at your normal initiative, and the third is taken at the end of the round.";
		Burglar[18] = "Elusive: No roll against you has advantage unless you are incapacitated. ";
		Burglar[20] = "Trapmaster: You never take damage from traps. ";

		//One unlocks at level 1, Tier Two at level 3, Tier Three at level 8, Tier Four at level 13, and Tier Five at level 18.
		Warlock[0] = "Overload: Once per long rest, you may add 1d10 to a spell’s damage, and another d10 per spell tier past the first.";
		Warlock[5] = "Spellsword: You may cast a cantrip and make a melee attack in the same turn";
		WarlockSpells[0] = "Cantrip - Firebolt: An aimed bolt of fire is loosed at the target; it deals 1d6 fire damage. At level 2 this is improved to 1d8.";
		WarlockSpells[1] = "Cantrip - Frost:  An aimed blast of ice is loosed at the target; it deals 1d6 cold damage. At level 2 this is improved to 1d8.";
		WarlockSpells[2] = "Cantrip - Arcane Surge: You open yourself to the ambient magic around you, and use it to power your next two spells or cantrips, adding +2 to both attack and damage rolls. At level 2 this is increased to 3 spells.";
		WarlockSpells[3] = "Magelight: You emit light from your hand or focus, this light lasts as long as you wish and can be transferred to the other hand without costing another spell slot. This light is twice as bright as a torch.";
		WarlockSpells[4] = "Arcane Beam: By itself, this spell heals the living and damages constructs for 2d6 arcane damage. If using a focus, you have advantage on the attack roll with this spell. The beam travels in a straight line 60 feet long, and anything in the beam’s path is hit by it. The beam is not stopped when it hits a target, it is only stopped when it reaches the end of its path. Arcane beam can be infused with fire, cold, or lightning. Instead of dealing the 2d6 damage as arcane, it instead uses the elemental type you prefer. Note that an additional d6 is added every third level, and electrical damage can only be added after level 8, and then only if you are a pyromancer or cryomancer. ";
		WarlockSpells[5] = "Additional Arcanist Spells: Other spells at this tier may include using arcane magic to heal allies (see: Lay On Hands and Cure Wounds) or using it to repel constructs. ";
		WarlockSpells[6] = "Fireball: An aimed spell, you fling a sphere of fire at an enemy up to 60 feet away, and if it hits, it deals 2d8 fire damage to the primary target, and 1d8 fire damage to anyone within five feet. ";
		WarlockSpells[7] = "Flare: You shoot a small spark of bright fire into the sky, up to 500 feet above you. The spark burns for ten minutes, illuminating a half-mile sphere in dim light.";
		WarlockSpells[8] = "Additional Pyromancer Spells: Other spells at this tier may include creating and controlling a small amount of fire, up to roughly the size of a campfire. This extends to setting anything made of wood on fire, provided it is not wet. ";
		WarlockSpells[9] = "Ice Spike: You pierce an enemy with a series of icicles, dealing 3d6 pierce damage. ";
		WarlockSpells[10] = "Sap Heat: You drain a target’s heat from them, freezing them solid if they fail a CON save at disadvantage. This ability deals 2d6 cold damage.";
		WarlockSpells[11] = "Additional Cryomancer Spells: Other spells at this tier may include freezing small amounts of water solid, freezing metal so that it shatters when struck, or putting out a fire.";
		
		Arcanister[3] = "Arcane Surge Improvement";
		Arcanister[6] = "Arcane Resistance: You become resistant to arcane damage, very resistant at level 11, and immune at level 16.";
		Arcanister[7] = "Postlude: Whenever an enemy is defeated within 30 feet, you gain 1d6 hp. At level 10, this increases to 1d8, and at level 14, this increases to 1d10.";
		ArcanisterSpells[0] = "Holy Zum: You heal an ally for 2d8+INT hp.";
		ArcanisterSpells[1] = "Bless: You infuse an ally with arcane power. On every roll they make for the next minute, they may add a d6.";
		ArcanisterSpells[2] = "Additional Tier Two Spells: Other spells may include area of effect heals, imbuing a weapon with arcane damage for a turn or two, and causing a single construct to make a CON save or collapse.";
		ArcanisterSpells[3] = "Arcane Might: You change your armor with arcane energy, allowing you to ignore all damage for the next two rounds. ";
		ArcanisterSpells[4] = "Interference: All constructs in a cone 60 feet in front of you make a CON save or collapse. Heretical constructs have advantage on this save. ";
		ArcanisterSpells[5] = "Additional Tier Three Spells: Other spells at this tier include modifications on the interference spell; a heretical construct would not have advantage against a concentrated burst of interference. In addition, the spell could be made to create a ring of interference around you, with the same effects to any construct that enters the ring. You may also convey elemental or physical resistance to an ally for two rounds, much like arcane might.";
		ArcanisterSpells[6] = "Arcane Shield: You bring forth an arcane aura that protects your allies. All constructs in a 30 foot sphere roll at disadvantage, and your allies receive resistance to elemental damage. This spell lasts for one minute.";
		ArcanisterSpells[7] = "Blind: You bring forth enough arcane magic that everyone within 60 feet must make a DEX save or they will be blinded for ten minutes. You are unaffected. This blast deals 6d10 arcane damage to constructs and half of that to everyone else. Allies are not damaged, but may still be blinded.";
		ArcanisterSpells[8] = "Additional Tier Four Spells: By this tier, demonstrations of an arcanister’s power reach their apex. You can call down searing blasts of light or arcane energy from the heavens, dealing massive damage in an area. You may also use your knowledge of the arcane to sense constructs up to a mile away. Finally, tier 4 and tier 5 spells cannot be dispelled by Hospitallers, due to the amount of arcane power involved.";
		ArcanisterSpells[9] = "Grace: You heal the entire party for 5d10 hp.";
		ArcanisterSpells[10] = "Spare the Dying: You send a tremendous surge of arcane power through your hands, and touch someone who has died in the last 5 minutes. If their bodies can still function, they are revived and sent into a coma for three days, after which they will awaken if their injuries are properly treated.";
		ArcanisterSpells[11] = "Additional Spells: By this point, pretty much anything arcane-related goes.";
		
		Pyromancer[3] = "Firebolt Improvement\nControl Flame: You can move and control any existing fire for up to one minute.\nFlaming Weapon: You may expend a spell slot to set your weapon alight for three turns. Each tier of spell slot adds another 2d6 fire damage. ";
		Pyromancer[6] = "Fire Resistance: You become resistant to fire damage, very resistant at level 11, and immune at level 16.";
		Pyromancer[8] = "Lightning: You may now use electrical spells.";
		PyromancerSpells[0] = "Ignite: You snap your fingers and an enemy bursts into flames, taking 3d6 fire damage. This also sets the target on fire for 1d6 turns. ";
		PyromancerSpells[1] = "Searing Palm: You hit an enemy in melee range with a flaming fist. This attack deals 3d8 fire damage, and the attack roll uses your strength modifier.";
		PyromancerSpells[2] = "Additional Tier Two Spells: At this level, you can conjure enough fire to set a cone 15 feet in front of you on fire, you can also make a ring or wall of fire that comes up to about knee level.";
		PyromancerSpells[3] = "Electric Judgement: Lightning pours from your hands, electrocuting anyone in a 15-foot cone in front of you. Deals 4d10 electric damage, and a DEX save will halve that damage.";
		PyromancerSpells[4] = "Firestorm: You push yourself off the ground and hover on pillars of fire that extend 40 feet beneath you. This ability can be sustained or reactivated for up to one minute. Enemies hit by the pillars take 4d8 fire damage.";
		PyromancerSpells[5] = "Additional Tier Three Spells: With the addition of electricity, the Pyromancer now has a versatile combat arsenal. Walls of fire can now reach about five feet in height, and a ring can extend to a sixty-foot diameter.";
		PyromancerSpells[6] = "Pillar of Fire: A column of fire some thirty feet tall is deposited on the enemy. This column follows the enemy for three turns, dealing 5d8 fire damage per turn.";
		PyromancerSpells[7] = "Lightning Bolt: A single target within 120 feet is struck by a bolt of lightning. This bolt deals 6d10 electric damage.";
		PyromancerSpells[8] = "Additional Tier Four Spells: By this point, you are a master of fire. You can conjure and control enough fire to burn an entire city block at once, and electricity, though random, obeys your whims as well. Walls of fire can now become 20 feet tall, and you can generate fire hot enough to melt metal. Not just bend it, but truly melt it.";
		PyromancerSpells[9] = "Electrical Storm: You conjure lightning and lightning bolts strike every enemy in a 200-foot diameter sphere around you, dealing 8d10 electric damage or half of that on a DEX save.";
		PyromancerSpells[10] = "Spare the Dying: You send a tremendous surge of arcane power through your hands, and touch someone who has died in the last 5 minutes. If their bodies can still function, they are revived and sent into a coma for three days, after which they will awaken if their injuries are properly treated.";
		PyromancerSpells[11] = "Additional Tier Five Spells: Once again, pretty much anything goes.";
		
		Cryomancer[3] = "Frost Improvement\nSure-footed: You no longer lose your balance when on slippery terrain.";
		Cryomancer[6] = "Ice Resistance: You become resistant to cold damage, very resistant at level 11, and immune to cold damage at level 16.";
		Cryomancer[8] = "Control Water: You may conjure, control, and freeze or melt water.";
		CryomancerSpells[0] = "Frostbite: You emit sheer cold from your fingertips, blasting a cone 15 feet in front of you for 3d6 cold damage.";
		CryomancerSpells[1] = "Icy Grip: You touch an opponent or a weapon within melee range. If the opponent fails a CON check, they take 3d8 cold damage, if they pass the check, they take half damage. A weapon touched by Icy Grip is rendered brittle, and will shatter when struck.";
		CryomancerSpells[2] = "Additional Tier Two Spells: You may raise a thin sheet of ice which blocks missiles but nothing else, or you may aim a more precise blast of cold or icicles at targets further away.";
		CryomancerSpells[3] = "Snap Freeze: You snap your fingers and a target within 60 feet freezes solid, unless they pass a CON save. The attack deals 4d8 cold damage, or half on the save. ";
		CryomancerSpells[4] = "Deadly Ice: You fire a massive icicle at a target 30 feet away for 5d10 pierce damage.";
		CryomancerSpells[5] = "Additional Tier Three Spells: At this level, you also gain the electrical attacks listed in the pyromancer category. Other spells may include cones of cold air, freezing a target’s blood, and freezing an entire lake surface.";
		CryomancerSpells[6] = "Frozen Lands: You touch the ground, and any enemies within 120 feet who touch the ground are rooted to the spot unless they pass a STR save. Deals 3d8 cold damage.";
		CryomancerSpells[7] = "Superconductor: You supercool your weapon, or someone else’s, and send a surge of electricity through it as you either attack or touch the enemy’s weapon. The spell deals 8d8 electric damage and 3d8 cold damage.";
		CryomancerSpells[8] = "Additional Tier Four Spells: By this level, you are more than capable of freezing large numbers of foes at once. You can also conjure thick walls of ice that cannot be broken except by fire or a very large creature smashing through them. ";
		CryomancerSpells[9] = "Electrical Storm: You conjure lightning and lightning bolts strike every enemy in a 200 foot diameter sphere around you, dealing 8d10 electric damage or half of that on a DEX save.";
		

		//One unlocks at level 1, Tier Two at level 3, Tier Three at level 8, Tier Four at level 13, and Tier Five at level 18.
		Sorcerer[0] = "Pocket Universe: You possess a magical “pocket” that can hold equipment and supplies (up to 15 cubic feet) without taking up space in this world. The items cannot be living, however.";
		Sorcerer[2] = "Divination: You have spent much time peering into the Gap, and now possess the ability to search it for information. Once per long rest, you look into the infinite possibilities of the Gap, seeking answers in the past, present, or future. You may privately ask the DM a single, one sentence question. The DM must provide an honest answer, but their answer is also limited to one sentence. At levels 6, 12, and 18, you gain another use of this power per long rest.";
		SorcererSpells[0] = "Cantrip - Rock: You summon a rock to land on your foe. The rock hits for 1d8 impact damage. At level 2, it will deal 1d10.";
		SorcererSpells[1] = "Cantrip - Vector: You tap an item with your arcane chisel, infusing it with enough power to travel 50 feet and hit for 1d6, 1d8, or 1d10 damage, depending on the object. The object’s weight can be up to 30 lbs. At level 2, Vector may lift an object weighing 50 lbs.";
		SorcererSpells[2] = "Cantrip - Fear: You frighten anyone within 15 feet using a horrible illusion. The effect forces everyone in range to make a willpower check, or they will break and run. At level 2, Fear expands to 20 feet.";
		SorcererSpells[3] = "Tier One Illusionist: Illusions can be size medium or smaller. Illusions at this level cannot be manipulated. ";
		SorcererSpells[4] = "Tier One Channel: Inanimate objects can be summoned if they are size small or smaller, these objects last for one minute. Food and drink summoned at tier one is inedible. ";
		SorcererSpells[5] = "Tier One Necromancer: Constructs that are size small or smaller are powered for a day, medium sized constructs are powered for a minute. No larger constructs can be created. All constructs may have one simple sentence parameter.";
		
		Necromancer[3] = "Vector Improvement\nFloating Friend: you may animate a tiny object, such as a spellbook, permanently.";
		NecromancerSpells[0] = "See Chart For Spells";
		
		Illusionist[3] = "Fear Improvement\nDisguise: You may alter your appearance however you wish. This will be dispelled if you fall unconscious or have nullify magic cast on you, however.";
		IllusionistSpells[0] = "See Chart For Spells";
		
		Channel[3] = "Rock Improvement\n";
		ChannelSpells[0] = "See Chart For Spells";
		
		
		//One unlocks at level 1, Tier Two at level 3, Tier Three at level 8, Tier Four at level 13, and Tier Five at level 18.
		Witch[0] = "Link: You may establish a telepathic link with someone once per day. This link can be severed by either of you, and is severed if either of you fall unconscious as well.";
		Witch[2] = "At level 2, you may scan the surface thoughts of anyone within 60 feet of you. When used on an enemy in combat, this grants you +2 AC against attacks made by that enemy.";
		Witch[6] = "You gain resistance to psychic damage.";
		WitchSpells[0] = "Cantrip - Sending: You speak to a person with whom you have been in contact for 7 - WIS days. As long as you are concentrating, you may maintain this link up to half a mile away. At level 2, Sending improves to a full mile.";
		WitchSpells[1] = "Cantrip - Unfocused Push: You unleash a blast of telekinetic force in a cone 20 feet in front of you. Anyone five feet from you is knocked back 5 feet and made prone. Anyone in the rest of the cone must make a STR check or they suffer the same fate. The cantrip deals 2d6 impact damage. At level 2, Push improves to 25 feet.";
		WitchSpells[2] = "Cantrip - Jump: You teleport yourself and anything you are carrying up to 30 feet in any direction, provided you have line of sight to or memory of the location. In combat, this cantrip has a cooldown of 2 actions. You are not vulnerable to attacks of opportunity if you teleport next to an enemy. At level 2, and Jump improves to 50 feet. ";
		WitchSpells[3] = "Manipulate: You reach out with mind and hand, and grasp a solid object under 30 lbs. with telekinesis. You can then move the object 30 feet in one turn, before needing to reapply the spell. This spell’s maximum weight and distance increase by 10 per level. Attacking an enemy with an object in such a matter will deal impact or pierce damage, depending on what is lifted. Heavier objects deal more damage.";
		WitchSpells[4] = "Repulse: You unleash telekinetic force in a sphere around you. Anyone within a 30-foot diameter sphere must make a DEX save or they will take 3d6 impact damage and be knocked prone. Succeeding the save will halve the damage and protect against being knocked prone.";
		WitchSpells[5] = "Additional Maelstrom Spells: These include any minor telekinetic push or pull.";
		WitchSpells[6] = "Malicious Whispers: You force a target to endure a brief telepathic assault. The target makes a willpower save, failing puts their next attack at disadvantage. Regardless, they take 2d6 psychic damage.";
		WitchSpells[7] = "Fortified Link: You establish a link with a willing partner that lasts up to a week. The two of you will always be aware of each other’s location and mood, and you will be able to speak with them through the telepathic connection. This connection has a range up to mile. ";
		WitchSpells[8] = "Additional Mindstrom Spells: At this level, you can read surface thoughts, but you cannot disguise your presence.";
		WitchSpells[9] = "You may teleport yourself or a willing partner up to 60 feet in any direction from where you are currently standing. You may also teleport an enemy or their equipment the same distance, however this requires an attack roll. If you teleport yourself, you may attack an enemy if they are standing next to you once you finish the teleport.";
		
		Maelstrom[3] = "Manipulate Improvement\nUnfocused Push Improvement";
		Maelstrom[6] = "Arcane Resistance: You become resistant to arcane damage, very resistant at level 11, and immune at level 16.";
		Maelstrom[7] = "Postlude: Whenever an enemy is defeated within 30 feet, you gain 1d6 hp. At level 10, this increases to 1d8, and at level 14, this increases to 1d10.";
		MaelstromSpells[0] = "Torque: You lift a tremendous amount of weight, probably more than you should, and fling it at a target. You lift a maximum of 500 * level lbs. This spell puts tremendous strain on your body, and as such, you must pass a DC 11 STR save or take 2d6 damage. If this spell is used more than once in a row, the DC save increases by 2 each time.";
		MaelstromSpells[1] = "Steady Pulse: You generate waves of force from your hands for up to one minute. This can be used to hold yourself aloft or push a target back. Targets are knocked back 15 feet each turn, they make a DEX save each turn to remain on their feet.";
		MaelstromSpells[2] = "Additional Tier Two Spells: These can include increasing the damage of a ranged weapon or a telekinetic punch. Weapons can be charged with telekinetic energy to knock back opponents on the next hit.";
		MaelstromSpells[3] = "Snap: You snap your fingers and something else snaps as well. Your opponent makes a CON save, if they fail, they are debilitated as follows: ";
		MaelstromSpells[4] = "Slam: You lift a target within the manipulate range and slam them into the ground, dealing 3d8 impact damage and an additional 1d8 for every 100 lbs of weight.";
		MaelstromSpells[5] = "Additional Tier Three Spells: These can include a telekinetic chokehold, ripping an opponent’s armor apart, or manipulating liquids that you can see.";
		MaelstromSpells[6] = "Singularity: You create a point of massive telekinetic pull within 120 feet of you. Anything within 30 feet of the sphere is pulled towards it. Making a STR save will allow someone to resist the effects. The sphere lasts for one minute, or until you end the spell.";
		MaelstromSpells[7] = "Crunch: You direct telekinetic force inwards on a target, breaking bone and crushing armor. The target makes a CON, STR, and Luck save. Failing CON breaks bones, dealing 4d10 impact damage; failing STR leaves them immobilized for two turns; additional effects occur due to the luck roll, as determined by the DM.";
		MaelstromSpells[8] = "Additional Tier Four Spells: Other spells at this tier include a “gravity slam,” where targets are pulled downwards and restrained unless they pass a STR save. ";
		MaelstromSpells[9] = "Disintegrate: You rip an opponent apart at the molecular level. They make a CON save. If they fail, then they, along with any non-magical items they are carrying, are ripped into their constituent atoms in an instant.";
		MaelstromSpells[10] = "Cataclysm: You use your telekinesis to lift entire buildings into the air. If the object is larger than 2000 cubic feet, make a DC 15 CON save to avoid passing out when the spell ends.";
		MaelstromSpells[11] = "Additional Tier Five Spells: Go wild. Rip the water out of people’s bodies. Throw the bear. Hell, throw many bears.";
		
		Mindstrom[3] = "Sending Improvement";
		Mindstrom[10] = "Fortified Mind: You gain advantage against telepathic attacks, and immunity to psychic damage at level 15.";
		MindstromSpells[0] = "Terror: Choose a target, that target makes a willpower save at disadvantage. If they fail, they flee in terror for one minute, away from you. They take 3d8 psychic damage, or if they pass their saving throw.";
		MindstromSpells[1] = "Sweep: You search for all sentient minds within a mile of you. You know roughly the number, but if that number is more than 500, make a CON save or pass out.";
		MindstromSpells[2] = "Additional Tier Two Spells: These can include single target mental attacks, or links to allies in and out of battle. You may also speak telepathically with those who do not speak your language, but this, of course, costs a spell.";
		MindstromSpells[3] = "Mind Probe: You may force your way into a target’s mind, gleaning three pieces of information after they fail a willpower save. After three pieces of information have been gathered, and for every piece afterwards, they may make another save. Gathering a piece of information takes 6 seconds. You must concentrate to perform this spell, and your target must concentrate to repel you.";
		MindstromSpells[4] = "Mind Blast: Anyone you consider an enemy within 15 feet of you takes 4d10 psychic damage and is stunned for 1 turn.";
		MindstromSpells[5] = "Additional Tier Three Spells: You may now connect multiple people through a mental link, allowing invisible and unhearable conversations. In addition, your single-target telepathic spells cannot be stopped by placing a nullify magic sphere between you and your target; either you or your target must actually be in the sphere.";
		MindstromSpells[6] = "Dominate: A target makes a willpower save or you take control of their body for one hour. You may order them to do your bidding verbally or telepathically, and they must obey any command given them unless doing so would bring immediate harm to either themselves or their allies. If this happens, they make a willpower check to break your control. Failing that, they will perform the action. ";
		MindstromSpells[7] = "Mind Flay: You rip into someone’s psyche, causing extreme pain and trauma. Target makes a willpower save, if they fail, they take 8d8 psychic damage. If they succeed the save, they take half.";
		MindstromSpells[8] = "Additional Tier Four Spells: You can now link your entire party together mentally, an act which grants the entire party the highest initiative of the group. The link ends if the telepath is incapacitated.";
		MindstromSpells[9] = "Imperator: A target makes a willpower save, and if they fail, you control their mind and their body. This spell can only be broken by the caster’s death, or if the caster severs the control. If nullify magic is used, the caster makes a wisdom save to avoid losing control of the target.";
		MindstromSpells[10] = "Additional Tier Five Spells: You’re a telepath, you can do all the mind stuff.";
		
		Portalstrom[3] = "Emergency Teleport: Whenever you are struck by a critical hit, you teleport thirty feet in a direction that leaves you further from your opponent.\nJump Improvement";
		PortalstromSpells[0] = "Long Range Teleport: You draw a shape on the ground to focus upon. After thirty seconds, anything within the shape is teleported up to 5 * level miles away. You must make a wisdom check to ensure that anything within the shape arrives safely; if you fail everyone being teleported arrived violently, taking 1d10 impact damage.";
		PortalstromSpells[1] = "Phase Out: You step into the Gap for a turn, avoiding all damage. You may re-enter this universe up to thirty feet from where you left it.";
		PortalstromSpells[2] = "Additional Tier Two Spells: This can include short range teleportation around the battlefield, placing an enemy into a tree’s branches, or otherwise causing chaos.";
		PortalstromSpells[3] = "Sever: You teleport part of an enemy up to five feet away. They make a CON save, if they fail, their limb is severed, otherwise their entire body is teleported and they take 3d10 blade damage.";
		PortalstromSpells[4] = "Selective Reassembly: You teleport someone, but leave their weapons and armor behind. ";
		PortalstromSpells[5] = "Additional Tier Three Spells: These may include teleporting multiple people without doing anything fancy, or slipping into the Gap for longer periods to avoid more damage. You can also rapidly teleport around the battlefield stabbing people.";
		PortalstromSpells[6] = "Phase Slam: Moving through the Gap for twenty seconds, you reappear somewhere within a 200-foot radius in a blast of arcane damage that deals 6d10 arcane to all enemies within 20 feet of you.";
		PortalstromSpells[7] = "Pitfall: You teleport an enemy 300 feet above their current location. They take 4d20 impact damage, + 1d20 for every 50 lbs. of weight.";
		PortalstromSpells[8] = "Additional Tier Four Spells: At this point you can do a mass recall-teleporting your entire party to the last city you spent a week in. If this city is over 1000 miles away, make a wisdom check to avoid being teleported somewhere up to 20 miles from the target. If you fail, everyone also rolls for luck.";
		PortalstromSpells[9] = "Phase Through: You teleport an object into another object. If either object is alive, they make a CON save to avoid passing out. Laws of the universe being what they are, after six seconds the objects will repel each other and be blasted away from one another, both taking 10d10 blade damage. ";
		PortalstromSpells[10] = "Stable Portal: You can maintain a portal between two locations up to 500 miles apart for up to five minutes.";
		
		//One unlocks at level 1, Tier Two at level 3, Tier Three at level 8, Tier Four at level 13, and Tier Five at level 18.
		Wizard[0] = "You possess a small container of sand for use in emergencies. The container blesses its contents to be immune to the effects of nullify magic at dawn each day.";
		Wizard[5] = "Sound Mind, Sound Body: You gain advantage on saves against charms. At level 10, you gain advantage on all CON saves.";
		WizardSpells[0] = "Cantrip - Disguise: You change your facial features to appear as some other nondescript member of your species for the next hour. At level 2, the weapon can be 100 feet away.";
		WizardSpells[1] = "Cantrip - Palsy: You hurl a charm which causes the target’s legs to weaken; they collapse prone if they fail a CON save. They may use their next action to recover and stand up. At level 2, Palsy is applied for 2 turns instead of 1.";
		WizardSpells[2] = "Cantrip - Morph Weapon: You transform a weapon or piece of ammunition within 60 feet of you into something harmless for ten seconds. The object must be visible. You may transform weapons that are in flight, but this must be done as a reaction, having forgone an action that turn. At level 2, and Disguise does not wear off until you lose consciousness.";
		WizardSpells[3] = "Tier One Bonecaster: You may use charms which set someone on fire, cause them to fall asleep for one minute, cause them to drop their weapons, and other small changes. The charm can only be one word, however.";
		WizardSpells[4] = "Tier One Maleficar: You may shift a metal object into a non-metal, a solid into a liquid, and other minor transformations, none of which can be with animate objects.";
		WizardSpells[5] = "Tier One Shapeshifter: Discussed in the Shapeshifter section.";

		Bonecaster[3] = "Palsy Improvement";
		Bonecaster[7] = "You know exactly when someone within 100 feet is using, creating, or under the influence of a charm.";
		BonecasterSpells[0] = "Tier Two Spells: Charms at this level can poison, cause or cure disease (temporarily), and shift people’s opinions. They may only be two words, however.";
		BonecasterSpells[1] = "Tier Three: Charms now can grant flight, electrical shock, animal speech, diarrhea, and a lisp. They may only be three words long, however.";
		BonecasterSpells[2] = "Tier Four: Charms can now grant water breathing, farsight, perfect parrying, and send people into comas. They can now be seven words long.";
		BonecasterSpells[3] = "Tier Five: Charms can now grant invulnerability, permanent invisibility, immunity to elemental damage, and spell slots. They can now be twelve words long.";

		Maleficar[3] = "Morph Weapon Improvement";
		MaleficarSpells[0] = "Tier Two Spells: At tier two, you can shift metal objects into other metal objects, changing the type of metal as well. You cannot shift animate objects yet, but you can shift wood into metal. Note that the Nullify Magic spell still functions on almost anything you shift. ";
		MaleficarSpells[1] = "Tier Three: At this level, you can shift animals into other objects, and vice versa. You cannot shift sentient beings. Animals shifted into objects enter a state of magical stasis, and do not age, nor are they aware of what is going on around them. When they are shifted back into normal form, they will be unaware of their time as an object. At this tier, you can also use your sand to reattach limbs.";
		MaleficarSpells[2] = "Tier Four: At this level, you can regrow severed limbs, which must be blessed by a high-level Hospitaller to ensure they will not be nullified in battle. In addition, the food and drink you can create is automatically un-dispellable. You can also transform sentients.";
		MaleficarSpells[3] = "Tier Five: At this level, there are few limits to the amount and type of transformations you can make, as you have reached the apex of your power.";

		Shapeshifter[3] = "Disguise Improvement";
		ShapeshifterSpells[0] = "Memory of Sight";
		ShapeshifterSpells[1] = "Memory of Form";
	}

	public static void main(String[] Args) {
		setAbilities();
		System.out.println(getAbilities("Maelstrom",20));
	}

}