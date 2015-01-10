import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.TableColumn;

public class ControlDeveloper {

	public static void main(String[] args) {
		
		Zentralverwaltung zentral = Zentralverwaltung.createInstance();
		zentral.createPrototypes();
		
	    JFrame f = new JFrame( "Control-Developer" );
	    f.setLayout( new BorderLayout() );
	    
//MENUBAR
	    JMenuBar menu = new JMenuBar( );
	    f.setJMenuBar(menu);	    
	    JMenu dataMenu = new JMenu("Data");
        menu.add(dataMenu);
        JMenuItem openEntry = new JMenuItem("Open");
        dataMenu.add(openEntry);
        JMenuItem exitEntry = new JMenuItem("Exit");
        dataMenu.add(exitEntry);
        JMenu helpMenu = new JMenu("Help");
        menu.add(helpMenu);        
        JMenuItem infoEntry = new JMenuItem("Info");
        helpMenu.add(infoEntry);
        
//FRAME EINTEILUNG	    
	    JPanel southPanel = new JPanel();
	    JPanel westPanel = new JPanel();
	    JPanel eastPanel = new JPanel();
	    JPanel centerPanel = new JPanel();
	   
	    f.add( southPanel, BorderLayout.SOUTH );    
	    f.add( westPanel, BorderLayout.WEST );    
	    f.add( eastPanel, BorderLayout.EAST );    
	    f.add( centerPanel, BorderLayout.CENTER );  
	    
	    southPanel.setBorder(BorderFactory.createLoweredBevelBorder());
	    westPanel.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	    eastPanel.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	    centerPanel.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	    
//WEST    
	    westPanel.setLayout(new BorderLayout());
	    JLabel prototypLabel = new JLabel("Prototypes");
	    westPanel.add(prototypLabel, BorderLayout.NORTH);
	    
	    JList prototypList = new JList(zentral.getPrototypen()); 
	    westPanel.add(prototypList, BorderLayout.CENTER);
	    
	    JButton addButton = new JButton("Add");
	    westPanel.add(addButton, BorderLayout.SOUTH);
	    addButton.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		//das passiert wenn geklickt
	    	}
	    });
	    
	    
//CENTER	    
	    centerPanel.setLayout(new BorderLayout());
	    
	    JLabel commandLabel = new JLabel("Commands");
	    centerPanel.add(commandLabel, BorderLayout.NORTH);
	    
	    JList commandList = new JList(zentral.getCommand());
	    centerPanel.add(commandList, BorderLayout.CENTER);
	    
	    JButton removeButton = new JButton("Remove");
	    JButton upButton = new JButton("Up");
	    JButton downButton = new JButton("Down");
	    JButton startButton = new JButton("Start");
	    JLabel clearLabel0 = new JLabel("");
	    JLabel clearLabel1 = new JLabel("");
	    
	    JPanel centerButtomPanel = new JPanel();
	    centerButtomPanel.setLayout(new GridLayout());
	    centerButtomPanel.add(removeButton);
	    centerButtomPanel.add(clearLabel0);
	    centerButtomPanel.add(clearLabel1);
	    centerButtomPanel.add(upButton);
	    centerButtomPanel.add(downButton);
	    centerButtomPanel.add(startButton);
	    
	    centerPanel.add(centerButtomPanel, BorderLayout.SOUTH);
	    
//EAST
	    eastPanel.setLayout(new BorderLayout());
	    
	    JLabel configLabel = new JLabel ("Configuration");
	    eastPanel.add(configLabel, BorderLayout.NORTH);
	    	    	    
	    JButton saveButton = new JButton("Save");
	    eastPanel.add(saveButton, BorderLayout.SOUTH);
	    	    
//END	    
	    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    f.pack();
	    f.setVisible( true );
	    
//ACTION
	    
	}
}
