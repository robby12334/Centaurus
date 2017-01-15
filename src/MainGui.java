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
	
	public MainGui(){
	      JFrame frame = new JFrame("GM Helper");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JPanel mainPanel = new JPanel(new BorderLayout());
	      
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
	        gc.gridx = 0;
	        gc.gridy = 1;
	        gc.gridwidth = 2;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.NORTHWEST;
	        gc.weightx = 1;
	        gc.weighty = 1;
	        wepPanel.add(displayWeapons, gc);

	     // STAT ROLLER   
	        JPanel statRoller = new JPanel();
	        statRoller.setLayout(new GridBagLayout());
	        gc = new GridBagConstraints();
	        
	        statButton = new JButton("Click For 6 Stats");
	        gc.gridx = 0;
	        gc.gridy = 0;
	        gc.anchor = GridBagConstraints.NORTHWEST;
	        gc.insets = new Insets(2, 0, 0, 2);
	        statButton.addActionListener(new ActionListener(){
	        	
				public void actionPerformed(ActionEvent arg0) {
					displayStats.setText("");
				    ArrayList<Integer> statArray = StatRoller.statRoller();
				    for(Integer str: statArray){
				    	displayStats.append(str + "\n");
				    }
					
				}
				
	        });
	        statRoller.add(statButton, gc);
	        
	        displayStats = new JTextArea("Stats Will Appear Here");
	        gc.gridx = 0;
	        gc.gridy = 1;
	        gc.insets = new Insets(2, 0, 0, 2);
	        gc.anchor = GridBagConstraints.NORTHWEST;
	        gc.weightx = 1;
	        gc.weighty = 1;
	        statRoller.add(displayStats, gc);
	        
	        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
	        mainPanel.add(wepPanel, BorderLayout.WEST);
	        mainPanel.add(statRoller, BorderLayout.CENTER);
	        

	        
	        
	        
	        frame.add(mainPanel);
	        frame.getContentPane().revalidate();
	      
	      

	      frame.pack();	      
	      frame.setSize(1000, 500);
	      frame.setVisible(true);   
	}

	public static void main(String[] args) {
		new MainGui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
