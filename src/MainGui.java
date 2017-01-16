import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainGui implements ActionListener{
	
	// Weapon Creation
	private JLabel wepLabel;    
	private JTextField wepCount; 
	private JButton wepButton;   
	private JTextArea displayWeapons; 
	
	// Stat Creation
	private JTextArea displayStats;
	private JButton statButton;
	
	//Enchantment Creation
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
	
	private JTextField STR;
	private JTextField DEX;
	private JTextField CON;
	private JTextField INT;
	private JTextField WIS;
	private JTextField CHA;
	
	private JComboBox armorType;
	private JComboBox armorMat;
	private JComboBox Shield;
	
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
	
	private JButton charCreateButton;
	
	public MainGui(){
	      JFrame frame = new JFrame("DM Helper");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JTabbedPane  mainPanel = new JTabbedPane();
	      
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

	        wepCount = new JTextField("0",2);
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
	        wepButton.addActionListener(new ActionListener(){
	        	
				public void actionPerformed(ActionEvent arg0) {
					displayWeapons.setText("");
				    int x = Integer.parseInt(wepCount.getText());
				    ArrayList<String> wepArray = RandomWeapon.randomWeapon(x);
				    for(String str: wepArray){
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
	        statButton.addActionListener(new ActionListener(){
	        	
				public void actionPerformed(ActionEvent arg0) {
					displayStats.setText("");
				    ArrayList<Integer> statArray = StatRoller.statRoller();
				    for(Integer str: statArray){
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
	        gc.weightx =99;
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
	        gc.weighty = 1;
	        gc.gridwidth = 1;
	        statRoller.add(CHALabel, gc);
	        
	        STR = new JTextField("0",2);
	        gc.gridx = 1;
	        gc.gridy = 1;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.WEST;
	        gc.weightx = 1;
	        gc.weighty = 0;
	        gc.gridwidth = 2;
	        statRoller.add(STR, gc);
	        
	        DEX = new JTextField("0",2);
	        gc.gridx = 1;
	        gc.gridy = 2;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.WEST;
	        gc.weightx = 1;
	        gc.weighty = 0;
	        gc.gridwidth = 2;
	        statRoller.add(DEX, gc);
	        
	        CON = new JTextField("0",2);
	        gc.gridx = 1;
	        gc.gridy = 3;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.WEST;
	        gc.weightx = 1;
	        gc.weighty = 0;
	        gc.gridwidth = 2;
	        statRoller.add(CON, gc);
	        
	        INT = new JTextField("0",2);
	        gc.gridx = 1;
	        gc.gridy = 4;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.WEST;
	        gc.weightx = 1;
	        gc.weighty = 0;
	        gc.gridwidth = 2;
	        statRoller.add(INT, gc);
	        
	        WIS = new JTextField("0",2);
	        gc.gridx = 1;
	        gc.gridy = 5;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.WEST;
	        gc.weightx = 1;
	        gc.weighty = 0;
	        gc.gridwidth = 2;
	        statRoller.add(WIS, gc);
	        
	        CHA = new JTextField("0",2);
	        gc.gridx = 1;
	        gc.gridy = 6;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.NORTHWEST;
	        gc.weightx = 1;
	        gc.weighty = 0;
	        gc.gridwidth = 2;
	        statRoller.add(CHA, gc);
	        
	        
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
	        gc.weighty = 2;
	        gc.gridwidth = 1;
	        enchantments.add(displayEnchantment, gc);
	        
	        enchantmentButton = new JButton("Click for Enchantment");
	        gc.gridx = 0;
	        gc.gridy = 0;
	        gc.weightx = 1;
	        gc.weighty =0;
	        gc.gridwidth = 1;
	        gc.gridheight = 1;
	        gc.anchor = GridBagConstraints.NORTHWEST;
	        gc.insets = new Insets(2, 0, 0, 2);
	        enchantmentButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					if((String) itemType.getSelectedItem() == " "){
						return;
					}
					displayEnchantment.setText("");
				    displayEnchantment.append(EnchantmentCreator.getEnchantment((String) itemType.getSelectedItem()));
				}
				
	        });
	        enchantments.add(enchantmentButton, gc);
	        
	        String[] items = {" ","Armor", "Ring", "Amulet", "Cloak", "Helm", "Boots", "Gloves", "Weapon", "Shield", "Foci", "Unique Item", "Legendary Item"};
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
	        mainPanel.addTab("Wep Creator",wepPanel);
	        mainPanel.addTab("Stat Roller / Character Create", statRoller);
	        mainPanel.addTab("Enchantment Create",enchantments);

	        
	        
	        
	        frame.add(mainPanel);
	        frame.getContentPane().revalidate();
	      
	      

	      frame.pack();	      
	      frame.setSize(500, 500);
	      frame.setVisible(true);   
	}

	public static void main(String[] args) {
		new MainGui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
