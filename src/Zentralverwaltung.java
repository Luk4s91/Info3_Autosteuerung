
public class Zentralverwaltung {
	private static Vector<Prototyp> prototypen = null;
	private static Vector<Prototyp> controllprocess = null;
	
	private Zentralverwaltung(){}
	
	public void createPrototypen()
	{
		//INHALT
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
