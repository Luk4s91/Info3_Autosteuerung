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
		String v;
		Command c = new Gear(111,222,333,444,555);
		Command c1 = new Direction(1, 2, 2222, 90);
		
		c.equals(c1);
		
//		Gear myGear = new Gear(111,222,333,444,555);
//		System.out.println(myGear);
		
		Zentralverwaltung zentral = Zentralverwaltung.createInstance();
		zentral.createPrototypes();
		
		System.out.println(zentral.vPrototypenObject(0));
		
		/*
		v= zentral.vPrototypenToString();
		System.out.println(v);
		
		zentral.addStep(zentral.vPrototypenObject(1));
		zentral.addStep(zentral.vPrototypenObject(2));
		zentral.addStep(zentral.vPrototypenObject(3));
		v= zentral.vControllProcessToString();
		System.out.println(v);
		
		zentral.incOrder(1);
		zentral.incOrder(1);
		zentral.incOrder(1);
		zentral.incOrder(1);
		zentral.incOrder(1);
		zentral.incOrder(1);
		v= zentral.vControllProcessToString();
		System.out.println(v);
	
		zentral.decOrder(1);
		zentral.decOrder(1);
		zentral.decOrder(1);
		zentral.decOrder(1);
		zentral.decOrder(1);
		v= zentral.vControllProcessToString();
		System.out.println(v);
		
		zentral.removeStep(2);
		zentral.removeStep(1);
		System.out.println("1"+ zentral.vControllProcessToString());
		zentral.removeStep(3);
		
		zentral.removeStep(2);
		v= zentral.vControllProcessToString();
		System.out.println(v);
		
		zentral.addStep(zentral.vPrototypenObject(0));
		v= zentral.vControllProcessToString();
		System.out.println(v);
		

		zentral.removeStep(0);
		zentral.removeStep(0);
		zentral.removeStep(0);
		zentral.removeStep(0);
		zentral.removeStep(0);
		zentral.addStep(zentral.vPrototypenObject(3));
		String verzeichnis = "E:\\Mechatronik\\3_Semester\\Informatik_3\\otto";	
		zentral.speichern(null, verzeichnis);
		zentral.removeStep(0);
		zentral.removeStep(0);
		zentral.removeStep(0);
		zentral.removeStep(0);
		zentral.removeStep(0);
		System.out.println("1"+ zentral.vControllProcessToString());
		zentral.laden(verzeichnis);
		System.out.println("1"+ zentral.vControllProcessToString());
		
		*/
	}

}