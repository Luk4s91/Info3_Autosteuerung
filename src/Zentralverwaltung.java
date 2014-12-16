import java.util.Vector;

public class Zentralverwaltung {
	private static Vector <Prototyp> prototypen = new Vector <Prototyp>();    //Es soll von jedem Vektor nur einen geben.
	private static Vector <Command> controllprocess = new Vector <Command>();
	
	private Zentralverwaltung(){}  //private damit nur ein Objekt davon erstellt wird.
	
	public void createPrototypen()
	{
		prototypen.addElement(new Prototyp("Direction")); //Fuegt ein Prototyp-Objekt in die Liste ein.
		prototypen.addElement(new Prototyp("Gear"));
		prototypen.addElement(new Prototyp("Goto"));
		prototypen.addElement(new Prototyp("If"));
	}
	public void addStep(Prototyp prototyp)
	{
		controllprocess.addElement(prototyp.createInstance()); //Fuegt vom ausgewaehlten Prototyp ein Command-Objekt ein.
	}
	public void removeStep(int iD)
	{
		controllprocess.remove(iD);
	}
	public void incOrder(int iD)
	{
		if(controllprocess.firstElement().equals(controllprocess.elementAt(iD)) == false)
		{
		controllprocess.addElement(controllprocess.elementAt(iD-1)); //Temp in Vektorliste
		controllprocess.add(iD-1, controllprocess.elementAt(iD));
		controllprocess.add(iD, controllprocess.lastElement());
		}
	}
	public void decOrder(int iD)
	{
		if(controllprocess.lastElement().equals(controllprocess.elementAt(iD)) == false)
		{
		controllprocess.addElement(controllprocess.elementAt(iD+1)); //Temp in Vektorliste
		controllprocess.add(iD+1, controllprocess.elementAt(iD));
		controllprocess.add(iD, controllprocess.lastElement());
		}
	}


}
