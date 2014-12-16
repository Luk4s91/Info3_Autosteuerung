import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
	    JFrame f= new JFrame( "Controll-Developer" );
	    f.setLayout( new BorderLayout() );
	    
	    JPanel northPanel = new JPanel();
	    JPanel southPanel = new JPanel();
	    JPanel westPanel = new JPanel();
	    JPanel eastPanel = new JPanel();
	    JPanel centerPanel = new JPanel();
	  
	    f.add( northPanel, BorderLayout.NORTH );    
	    f.add( new JPanel(), BorderLayout.SOUTH );    
	    f.add( new JPanel(), BorderLayout.WEST );    
	    f.add( new JPanel(), BorderLayout.EAST );    
	    f.add( new JPanel(), BorderLayout.CENTER );  
	    
	    
	    
	    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    f.pack();
	    f.setVisible( true );
	}
}