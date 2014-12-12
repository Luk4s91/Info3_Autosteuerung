
public class Prototyp {
	
	private String nameCommand;
	
	public void setNameCommand(String nameCommand) {
		this.nameCommand = nameCommand;
	}
	public String getNameCommand() {
		return nameCommand;
	}
	
	public Command createInstance() //Soll über den Namen gucken, welcher Command es ist und davon ein neues Objekt erzeugen!? Prüfen obs so geht!!!
	{
		if (this.nameCommand=="Gear")
		{
			Gear g = new Gear(0, 0, 0, 0, 0);
			return g;
		}
		else if (this.nameCommand=="Direction")
		{
			Direction d = new Direction(0, 0, 0, 0);
			return d;
		}
		return null; //Gibt nur zwei Kommandos, oder??
	}
	//Standardkonstruktor?!?!
	public Prototyp(String nameCommand) {
		super();
		this.nameCommand = nameCommand;
	}

}
