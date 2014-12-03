public class Goto extends Control{
	private int jumpAdress;
	/**
	 * 
	 * @return
	 */
	public int getJumpAdress() {
		return jumpAdress;
	}
	/**
	 * 
	 * @param iD
	 * @param stepId
	 * @param jumpAdress
	 */
	Goto(int iD, int stepId, int jumpAdress ){
		super(iD,stepId);
		this.jumpAdress=jumpAdress;
	}

	@Override
	public String toString() {
		return "Goto [jumpAdress=" + jumpAdress + "]";
	}
	
	

}
