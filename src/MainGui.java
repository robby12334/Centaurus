import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MainGui extends Frame implements ActionListener, WindowListener{
	private Label lblCount;    // Declare a Label component 
	private TextField tfCount; // Declare a TextField component 
	private Button btnCount;   // Declare a Button component
	private int count = 0;     // Counter's value
	
	public MainGui(){
	      setLayout(new FlowLayout());
	         // "super" Frame (a Container) sets its layout to FlowLayout, which arranges
	         // the components from left-to-right, and flow to next row from top-to-bottom.
	 
	      lblCount = new Label("Counter");  // construct the Label component
	      add(lblCount);                    // "super" Frame adds Label
	 
	      tfCount = new TextField("0", 10); // construct the TextField component
	      tfCount.setEditable(false);       // set to read-only
	      add(tfCount);                     // "super" Frame adds TextField
	 
	      btnCount = new Button("Count");   // construct the Button component
	      add(btnCount);                    // "super" Frame adds Button
	 
	      btnCount.addActionListener(this);
	         // btnCount is the source object that fires ActionEvent when clicked.
	         // The source add "this" instance as an ActionEvent listener, which provides
	         //  an ActionEvent handler called actionPerformed().
	         // Clicking btnCount invokes actionPerformed().
	 
	      setTitle("GM Helper");  // "super" Frame sets its title
	      setSize(1200, 600);        // "super" Frame sets its initial window size
	 
	      // For inspecting the components/container objects
	      // System.out.println(this);
	      // System.out.println(lblCount);
	      // System.out.println(tfCount);
	      // System.out.println(btnCount);
	      addWindowListener(this);
	      setVisible(true);         // "super" Frame shows
	 
	      // System.out.println(this);
	      // System.out.println(lblCount);
	      // System.out.println(tfCount);
	      // System.out.println(btnCount);
	}

	public static void main(String[] args) {
		new MainGui();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	      ++count; // increase the counter value
	      // Display the counter value on the TextField tfCount
	      tfCount.setText(count + ""); // convert int to String
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