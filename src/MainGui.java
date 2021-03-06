import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainGui implements ActionListener {

	// Weapon Creation
	private JLabel wepLabel;
	private JTextField wepCount;
	private JButton wepButton;
	private JTextArea displayWeapons;

	// Stat Creation
	private JTextArea displayStats;
	private JButton statButton;
	private JTextArea charInfo;
	// Enchantment Creation
	private JButton enchantmentButton;
	private JComboBox itemType;
	private JTextArea displayEnchantment;

	// Character Creation
	private JLabel STRLabel;
	private JLabel DEXLabel;
	private JLabel CONLabel;
	private JLabel INTLabel;
	private JLabel WISLabel;
	private JLabel CHALabel;
	private JLabel LvlLabel;
	private JLabel bonusToHitLabel;
	private JLabel bonusToHPLabel;

	private JLabel STRFinalLabel;
	private JLabel DEXFinalLabel;
	private JLabel CONFinalLabel;
	private JLabel INTFinalLabel;
	private JLabel WISFinalLabel;
	private JLabel CHAFinalLabel;
	private JLabel HPFinalLabel;
	private JLabel WillpowerFinalLabel;
	private JLabel ACFinalLabel;
	private JLabel SpeedFinalLabel;
	private JLabel ToHitLabel;

	private JTextField STR;
	private JTextField DEX;
	private JTextField CON;
	private JTextField INT;
	private JTextField WIS;
	private JTextField CHA;
	private JTextField Lvl;
	private JTextField bonusToHit;
	private JTextField bonusToHP;

	private JComboBox<String> armorType;
	private JComboBox<String> Shield;
	private JComboBox<String> Classes;
	private JComboBox<String> Races;

	private JTextArea STRFinal;
	private JTextArea DEXFinal;
	private JTextArea CONFinal;
	private JTextArea INTFinal;
	private JTextArea WISFinal;
	private JTextArea CHAFinal;
	private JTextArea HP;
	private JTextArea Willpower;
	private JTextArea AC;
	private JTextArea Speed;
	private JTextArea ToHit;

	private JButton charCreateButton;

	public MainGui() {
		JFrame frame = new JFrame("DM Helper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane mainPanel = new JTabbedPane();

		// WEAPON PANEL
		JPanel wepPanel = new JPanel();

		wepPanel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		wepLabel = new JLabel("Enter Numer Of Weapons (1-20, -1 for random): ");
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.insets = new Insets(2, 0, 0, 2);
		wepPanel.add(wepLabel, gc);

		wepCount = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.NORTH;
		gc.insets = new Insets(2, 0, 0, 2);
		wepPanel.add(wepCount, gc);

		wepButton = new JButton("Click For Weapons");
		gc.gridx = 2;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.insets = new Insets(2, 0, 0, 2);
		wepButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				displayWeapons.setText("");
				int x = Integer.parseInt(wepCount.getText());
				ArrayList<String> wepArray = RandomWeapon.randomWeapon(x);
				for (String str : wepArray) {
					displayWeapons.append(str + "\n");
				}

			}

		});
		wepPanel.add(wepButton, gc);

		displayWeapons = new JTextArea("Weapons will appear here");
		displayWeapons.setRows(21);
		displayWeapons.setColumns(25);
		JScrollPane sp1 = new JScrollPane(displayWeapons);
		sp1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		gc.gridx = 0;
		gc.gridy = 1;
		gc.gridwidth = 2;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.weightx = 1;
		gc.weighty = 1;
		wepPanel.add(sp1, gc);

		// STAT ROLLER
		JPanel statRoller = new JPanel();
		statRoller.setLayout(new GridBagLayout());
		gc = new GridBagConstraints();

		statButton = new JButton("Click For 6 Stats");
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.insets = new Insets(2, 0, 0, 2);
		statButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				displayStats.setText("");
				ArrayList<Integer> statArray = StatRoller.statRoller();
				for (Integer str : statArray) {
					displayStats.append(str + " ");
				}

			}

		});
		statRoller.add(statButton, gc);

		displayStats = new JTextArea("Stats Will Appear Here");
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = 99;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(displayStats, gc);

		STRLabel = new JLabel("STR: ");
		gc.gridx = 0;
		gc.gridy = 1;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(STRLabel, gc);

		DEXLabel = new JLabel("DEX: ");
		gc.gridx = 0;
		gc.gridy = 2;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(DEXLabel, gc);

		CONLabel = new JLabel("CON: ");
		gc.gridx = 0;
		gc.gridy = 3;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(CONLabel, gc);

		INTLabel = new JLabel("INT: ");
		gc.gridx = 0;
		gc.gridy = 4;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(INTLabel, gc);

		WISLabel = new JLabel("WIS: ");
		gc.gridx = 0;
		gc.gridy = 5;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(WISLabel, gc);

		CHALabel = new JLabel("CHA: ");
		gc.gridx = 0;
		gc.gridy = 6;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(CHALabel, gc);

		bonusToHitLabel = new JLabel("Bonus to Hit: ");
		gc.gridx = 0;
		gc.gridy = 7;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(bonusToHitLabel, gc);

		LvlLabel = new JLabel("Lvl: ");
		gc.gridx = 0;
		gc.gridy = 8;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(LvlLabel, gc);

		STR = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 1;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(STR, gc);

		DEX = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 2;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(DEX, gc);

		CON = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 3;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(CON, gc);

		INT = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 4;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(INT, gc);

		WIS = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 5;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(WIS, gc);

		CHA = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 6;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(CHA, gc);

		bonusToHit = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 7;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(bonusToHit, gc);

		Lvl = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 8;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(Lvl, gc);

		bonusToHPLabel = new JLabel("Bonus to HP: ");
		gc.gridx = 0;
		gc.gridy = 9;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(bonusToHPLabel, gc);

		bonusToHP = new JTextField("0", 2);
		gc.gridx = 1;
		gc.gridy = 9;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 2;
		statRoller.add(bonusToHP, gc);

		String[] armor = { "None", "Heavy", "Medium", "Light" };
		String[] shield = { "None", "Buckler", "RoundSheild", "TowerShield" };
		String[] races = { " ", "Aleakii", "Illiarii", "River Centaur",
				"Plains Centaur", "Frost Dwarf", "Fir Dwarf", "Diktator",
				"Servitor", "Brakashi", "Durog", "Untouched", "Fae-touched",
				"Goblin", "Orc", "Surfacer", "Larys", "Ghashim", "Viper" };
		String[] classes = { " ", "Titan", "Devastator", "Bastion", "Engineer",
				"Commander", "Champion", "Protector", "Exemplar", "Stalwart",
				"Duelist", "Master at Arms", "Dervish", "Sentinel", "Warden",
				"Reaver", "Hunter", "Sage", "Bandit", "Sharpshooter",
				"Vollier", "Skirmisher", "Spy", "Assassin", "Burglar",
				"Arcanister", "Pyromancer", "Cryomancer", "Necromancer",
				"Illusionist", "Channel", "Maelstrom", "Mindstrom",
				"Portalstrom", "Bonecaster", "Maleficar", "Shapeshifter" };

		armorType = new JComboBox<String>(armor);
		gc.gridx = 0;
		gc.gridy = 10;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(armorType, gc);

		Shield = new JComboBox<String>(shield);
		gc.gridx = 0;
		gc.gridy = 11;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(Shield, gc);

		Races = new JComboBox<String>(races);
		gc.gridx = 0;
		gc.gridy = 12;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(Races, gc);

		Classes = new JComboBox<String>(classes);
		gc.gridx = 0;
		gc.gridy = 13;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(Classes, gc);

		STRFinalLabel = new JLabel("STR Final: ");
		gc.gridx = 2;
		gc.gridy = 1;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(STRFinalLabel, gc);

		STRFinal = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 1;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(STRFinal, gc);

		DEXFinalLabel = new JLabel("DEX Final: ");
		gc.gridx = 2;
		gc.gridy = 2;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(DEXFinalLabel, gc);

		DEXFinal = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 2;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(DEXFinal, gc);

		CONFinalLabel = new JLabel("CON Final: ");
		gc.gridx = 2;
		gc.gridy = 3;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(CONFinalLabel, gc);

		CONFinal = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 3;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(CONFinal, gc);

		INTFinalLabel = new JLabel("INT Final: ");
		gc.gridx = 2;
		gc.gridy = 4;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(INTFinalLabel, gc);

		INTFinal = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 4;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(INTFinal, gc);

		WISFinalLabel = new JLabel("WIS Final: ");
		gc.gridx = 2;
		gc.gridy = 5;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(WISFinalLabel, gc);

		WISFinal = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 5;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(WISFinal, gc);

		CHAFinalLabel = new JLabel("CHA Final: ");
		gc.gridx = 2;
		gc.gridy = 6;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(CHAFinalLabel, gc);

		CHAFinal = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 6;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(CHAFinal, gc);

		HPFinalLabel = new JLabel("HP Final: ");
		gc.gridx = 2;
		gc.gridy = 7;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(HPFinalLabel, gc);

		HP = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 7;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(HP, gc);

		WillpowerFinalLabel = new JLabel("Willpower Final: ");
		gc.gridx = 2;
		gc.gridy = 8;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(WillpowerFinalLabel, gc);

		Willpower = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 8;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(Willpower, gc);

		ACFinalLabel = new JLabel("AC Final: ");
		gc.gridx = 2;
		gc.gridy = 9;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(ACFinalLabel, gc);

		AC = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 9;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(AC, gc);

		SpeedFinalLabel = new JLabel("Speed Final: ");
		gc.gridx = 2;
		gc.gridy = 10;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(SpeedFinalLabel, gc);

		Speed = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 10;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(Speed, gc);

		ToHitLabel = new JLabel("To Hit Final: ");
		gc.gridx = 2;
		gc.gridy = 11;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.EAST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(ToHitLabel, gc);

		ToHit = new JTextArea("00");
		gc.gridx = 3;
		gc.gridy = 11;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.WEST;
		gc.weightx = .5;
		gc.weighty = 0;
		gc.gridwidth = 1;
		statRoller.add(ToHit, gc);

		charCreateButton = new JButton("Click for Character Create");
		gc.gridx = 0;
		gc.gridy = 14;
		gc.weightx = 1;
		gc.weighty = 0;
		gc.gridwidth = 2;
		gc.gridheight = 1;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(2, 0, 0, 2);
		
		charInfo = new JTextArea("Char Info Will Be Here");

		
		charCreateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((String) Classes.getSelectedItem() == " ") {
					return;
				}else if ((String) Races.getSelectedItem() == " "){
					return;
				}
				int newStr = CharacterCreate.getSTR(Integer.parseInt(STR.getText()),(String)Races.getSelectedItem());
				int newDex = CharacterCreate.getDEX(Integer.parseInt(DEX.getText()),(String)Races.getSelectedItem());
				int newCon = CharacterCreate.getCON(Integer.parseInt(CON.getText()),(String)Races.getSelectedItem());
				int newInt = CharacterCreate.getINT(Integer.parseInt(INT.getText()),(String)Races.getSelectedItem());
				int newWis = CharacterCreate.getWIS(Integer.parseInt(WIS.getText()),(String)Races.getSelectedItem());
				int newCha = CharacterCreate.getCHA(Integer.parseInt(CHA.getText()),(String)Races.getSelectedItem());
				int lvl = Integer.parseInt(Lvl.getText());
				int bonusHp = Integer.parseInt(bonusToHP.getText());
				int hp = CharacterCreate.getHP((newCon-10)/2, lvl, (String)Classes.getSelectedItem(), bonusHp, (String)Races.getSelectedItem());
				int willpower = CharacterCreate.getWillpower(newStr + newDex + newCon + newInt + newWis + newCha);
				int ac = CharacterCreate.getAC(newDex, (String)Shield.getSelectedItem(), (String)armorType.getSelectedItem() , lvl);
				String speed = CharacterCreate.getSpeed((String)Races.getSelectedItem());
				String toHit = CharacterCreate.getToHit(newDex, newInt, newStr, lvl, Integer.parseInt(bonusToHit.getText()));
				
				STRFinal.setText(newStr + "");
				DEXFinal.setText(newDex + "");
				CONFinal.setText(newCon + "");
				INTFinal.setText(newInt + "");
				WISFinal.setText(newWis + "");
				CHAFinal.setText(newCha + "");
				HP.setText(hp + "");
				Willpower.setText(willpower + "");
				AC.setText(ac + "");
				Speed.setText(speed + "");
				ToHit.setText(toHit + "");
				
				charInfo.setText("");
				charInfo.setText("Race Abilities:\n" +RacialStats.Race((String)Races.getSelectedItem()) + "\nSkills:\n" + ArchtypeAbilities.getAbilities((String) Classes.getSelectedItem(), lvl));
			}

		});
		statRoller.add(charCreateButton, gc);
		
		charInfo.setRows(21);
		charInfo.setColumns(47);
		JScrollPane sp2 = new JScrollPane(charInfo);
		sp2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		gc.gridx = 0;
		gc.gridy = 15;
		gc.gridwidth = 4;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.weightx = 0;
		gc.weighty = 1;
		statRoller.add(sp2, gc);
		
		// Enchantment Creator
		JPanel enchantments = new JPanel();
		enchantments.setLayout(new GridBagLayout());
		gc = new GridBagConstraints();

		displayEnchantment = new JTextArea("Stats Will Appear Here");
		gc.gridx = 0;
		gc.gridy = 1;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.weightx = 0;
		gc.weighty = 1;
		gc.gridwidth = 1;
		enchantments.add(displayEnchantment, gc);

		enchantmentButton = new JButton("Click for Enchantment");
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0;
		gc.gridwidth = 1;
		gc.gridheight = 1;
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.insets = new Insets(2, 0, 0, 2);
		enchantmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((String) itemType.getSelectedItem() == " ") {
					return;
				}
				displayEnchantment.setText("");
				displayEnchantment.append(EnchantmentCreator
						.getEnchantment((String) itemType.getSelectedItem()));
			}

		});
		enchantments.add(enchantmentButton, gc);

		String[] items = { " ", "Armor", "Ring", "Amulet", "Cloak", "Helm",
				"Boots", "Gloves", "Weapon", "Shield", "Foci", "Unique Item",
				"Legendary Item" };
		itemType = new JComboBox<String>(items);
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridwidth = 1;
		enchantments.add(itemType, gc);

		// mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		mainPanel.addTab("Wep Creator", wepPanel);
		mainPanel.addTab("Stat Roller / Character Create", statRoller);
		mainPanel.addTab("Enchantment Create", enchantments);

		frame.add(mainPanel);
		frame.getContentPane().revalidate();

		frame.pack();
		frame.setSize(600, 1050);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MainGui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
