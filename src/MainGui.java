import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainGui implements ActionListener{
	
	private JLabel wepLabel;    // Declare a Label component 
	private JTextField wepCount; // Declare a TextField component 
	private JButton wepButton;   // Declare a Button component
	private JTextArea displayWeapons; // Multi-line TextArea to taDisplay result
	
	private JTextArea displayStats;
	private JButton statButton;
	
	private JButton enchantmentButton;
	private JComboBox itemType;
	private JTextArea displayEnchantment;
	
	public MainGui(){
	      JFrame frame = new JFrame("GM Helper");
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
	        gc.gridx = 0;
	        gc.gridy = 1;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.NORTHWEST;
	        gc.weightx = 0;
	        gc.weighty = 2;
	        gc.gridwidth = 2;
	        statRoller.add(displayStats, gc);
	        
	        
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
	        gc.weightx = 0;
	        gc.weighty = 0;
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
	        
	        String[] items = {" ","Armor", "Ring", "Amulet", "Cloak", "Helm", "Boots", "Gloves", "Weapon", "Shield", "Unique Item", "Legendary Item"};
	        itemType = new JComboBox(items);
	        gc.gridx = 1;
	        gc.gridy = 0;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.NORTHWEST;
	        gc.weightx = 1;
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
