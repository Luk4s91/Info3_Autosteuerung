public class If extends Goto{
	private int reference;
	
	/**
	 * 
	 * @param iD
	 * @param stepId
	 * @param jumpAdress
	 * @param reference
	 */
	If(int iD, int stepId, int jumpAdress, int reference){
		super(iD,stepId,jumpAdress);
		this.reference=reference;
	}
	/**
	 * 
	 * @return
	 */
	/**
	 * 
	 * @return
	 */
	public int getReference() {
		return reference;
	}

	@Override
	public String toString() {
		return "If [reference=" + reference + "]";
	}
	

}
