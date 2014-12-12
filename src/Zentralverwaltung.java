import java.util.Vector;

public class Zentralverwaltung {
	private static Vector prototypen = new Vector(); //Was macht die von uns erstelle Klasse Vektor??? Daher diese Unterkringelung bei der importierten??
	private static Vector controllprocess = new Vector();
	
	private Zentralverwaltung(){}
	
	public void createPrototypen()
	{
		prototypen.add(); //woher Prototyp-objekte???
	}
	public void addStep(Prototyp iwas)
	{
	//INHALT	
	}
	public void removeStep(int iD)
	{
	//INHALT
	}
	public void incOrder(int iD)
	{
	//INHALT
	}
	public void decOrder(int iD)
	{
	//INHALT
	}
	//f)

	public static void setControllprocess(Vector<Prototyp> controllprocess) {
		Zentralverwaltung.controllprocess = controllprocess;
	}

	public static Vector<Prototyp> getControllprocess() {
		return controllprocess;
	}

	public static void setPrototypen(Vector<Prototyp> prototypen) {
		Zentralverwaltung.prototypen = prototypen;
	}

	public static Vector<Prototyp> getPrototypen() {
		return prototypen;
	}

}
