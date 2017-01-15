import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class MainGui extends Frame implements ActionListener, WindowListener{
	private Label lblCount;    // Declare a Label component 
	private TextField tfCount; // Declare a TextField component 
	private Button btnCount;   // Declare a Button component
	 private TextArea displayWeapons; // Multi-line TextArea to taDisplay result
	
	public MainGui(){
	      setLayout(new FlowLayout());
	      
	      lblCount = new Label("Enter Number Of Weapons Desired (-1 for random)");
	      add(lblCount);                   
	 
	      tfCount = new TextField("0", 10); 
	      tfCount.setEditable(true);      
	      add(tfCount);                     
	 
	      btnCount = new Button("Generate Weapons");  
	      add(btnCount);                    
	      
	      displayWeapons = new TextArea(20,40);
	      add(displayWeapons);
	      btnCount.addActionListener(this);

	 
	      setTitle("GM Helper");  
	      setSize(1200, 600);       
	      
	      addWindowListener(this);
	      setVisible(true);   
	}

	public static void main(String[] args) {
		new MainGui();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	      displayWeapons.setText("");
	      int x = Integer.parseInt(tfCount.getText());
	      ArrayList<String> wepArray = RandomWeapon.randomWeapon(x);
	      for(String str: wepArray){
	    	  displayWeapons.append(str + "\n");
	      }
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
