/* 
 * Aufgabenblatt 2
 * Aufgabe Autosteuerung
 * Bearbeitungsdauer: xxx min 
 * Bemerkungen: 
 * keine 
 * 
 * @author Lukas Beppler & Jaques Dordel
 * @version 1.0 
 */ 

public class Main {
	
	public static void main(String[] args) {
		Command c = new Gear(111,222,333,444,555);
		Command c1 = new Direction(1, 2, 2222, 90);
		
		c.equals(c1);
		
		Gear myGear = new Gear(111,222,333,444,555);
		System.out.println(myGear);
	
	}

}