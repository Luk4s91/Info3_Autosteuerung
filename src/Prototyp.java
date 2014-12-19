public class Prototyp {
	
	private String nameCommand;

	public void setNameCommand(String nameCommand) {
		this.nameCommand = nameCommand;
	}
	public String getNameCommand() {
		return nameCommand;
	}
	
	@Override
	public String toString() {
		return "Prototyp [nameCommand=" + nameCommand + "]";
	}
	
	public Command createInstance()
	{
		if (this.nameCommand=="Gear")
		{
			Gear myGear = new Gear(0, 0, 0, 0, 0);
			return myGear;
		}
		else if (this.nameCommand=="Direction")
		{
			Direction myDirection = new Direction(0, 0, 0, 0);
			return myDirection;
		}
		else if (this.nameCommand=="Goto")
		{
			Goto myGoto = new Goto(0, 0, 0);
			return myGoto;			
		}
		else if (this.nameCommand=="If")
		{
			If myIf = new If(0, 0, 0, 0);
			return myIf;
		}
			
		return null; 
	}
	
	//Standardkonstruktor
	public Prototyp(String nameCommand) {
		super();
		this.nameCommand = nameCommand;
//		this.createInstance();
	}

}
