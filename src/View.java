import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.SplitPaneUI;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;


public class View extends JFrame {

	private Zentralverwaltung zentral;
	
	public View(Zentralverwaltung zentral) {
		super("Zentralverwaltung");                  
		this.zentral = zentral;
		
//WINDOW
		setTitle("Control-Developer");
	    setLayout( new BorderLayout() );
	    
//MENUBAR
	    JMenuBar menu = new JMenuBar( );
	    setJMenuBar(menu);	    
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
        
//FRAME	    
	    JPanel southPanel = new JPanel();
	    JPanel westPanel = new JPanel();
	    JPanel eastPanel = new JPanel();
	    JPanel centerPanel = new JPanel();
	   
	    add( southPanel, BorderLayout.SOUTH );    
	    add( westPanel, BorderLayout.WEST );    
	    add( eastPanel, BorderLayout.EAST );    
	    add( centerPanel, BorderLayout.CENTER );  
	    
	    southPanel.setBorder(BorderFactory.createLoweredBevelBorder());
	    westPanel.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	    eastPanel.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	    centerPanel.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	    
//WEST    
	    westPanel.setLayout(new BorderLayout());
	    JLabel prototypLabel = new JLabel("Prototypes");
	    westPanel.add(prototypLabel, BorderLayout.NORTH);
	    
	    JList<Prototyp> prototypList = new JList<Prototyp>(zentral.getPrototypen());   //prototypList
	    westPanel.add(prototypList, BorderLayout.CENTER);
	    
	    JButton addButton = new JButton("Add");
	    westPanel.add(addButton, BorderLayout.SOUTH);
	    	   	    
//CENTER	    
	    centerPanel.setLayout(new BorderLayout());
	    
	    JLabel commandLabel = new JLabel("Commands");
	    centerPanel.add(commandLabel, BorderLayout.NORTH);
	    
	    JList<Command> commandList = new JList<Command>(zentral.getCommand());   //commandList
	    JScrollBar scrollbar = new JScrollBar(JScrollBar.VERTICAL);              //SCROLLEN GEHT NOCH NICHT
        centerPanel.add(scrollbar, BorderLayout.EAST);
        	    
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
	   
	    JPanel configPanel = new JPanel();
	    configPanel.setLayout(new GridLayout(2,5));
	    eastPanel.add(configPanel);
	    
	    JTextArea speed = new JTextArea("Speed");
	    speed.setEditable(false);
	    JTextArea duration = new JTextArea("Duration");
	    duration.setEditable(false);	  
	    JTextArea degree = new JTextArea("Degree");
	    speed.setEditable(false);
	    
	    
	    
//SOUTH
	     JTextField output = new JTextField("Ausgabefenster"); 
	    southPanel.add(output);	    	    	    
	    
//ACTIONLISTENER	    
        addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (prototypList.isSelectionEmpty()){
					output.setText("Fehler: Kein Prototyp ausgewaehlt.");
				}else{
					commandList.updateUI();
					zentral.addStep(prototypList.getSelectedValue());
				}

			}
		});

        upButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (commandList.isSelectionEmpty()){
					output.setText("Fehler: Kein Command ausgewaehlt.");
				}else{
					commandList.updateUI();
					zentral.incOrder(commandList.getSelectedIndex());
				}

			}
		});
        
        downButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (commandList.isSelectionEmpty()){
					output.setText("Fehler: Kein Command ausgewaehlt.");
				}else{
					commandList.updateUI();
					zentral.decOrder(commandList.getSelectedIndex());
				}

			}
		});
        
        removeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (commandList.isSelectionEmpty()){
					output.setText("Fehler: Kein Command ausgewaehlt.");
				}else{
					commandList.updateUI();
					zentral.removeStep(commandList.getSelectedIndex());
				}

			}
		});
	    
        commandList.addListSelectionListener(new SelectionListener(){
        	public void valueChanged(ListSelectionEvent e) {
        		
        		//MOMENTAN NOCH EIN TEST
        		configPanel.updateUI();
        		configPanel.add(speed);
        		configPanel.add(duration);
        		configPanel.add(degree);
        	}
        		
        });
        
                
	}

	
	public static void main(String[] args) {	

	Zentralverwaltung zentral = Zentralverwaltung.createInstance();
	zentral.createPrototypes();	
	
	View view = new View(zentral);
	view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	view.pack();
	view.setVisible(true);
	
	}
			

}
