public class If extends Goto{
	private Assignment threshold;
	private int reference;
	
	/**
	 * 
	 * @param iD
	 * @param stepId
	 * @param jumpAdress
	 * @param threshold
	 * @param reference
	 */
	If(int iD, int stepId, int jumpAdress, Assignment threshold, int reference){
		super(iD,stepId,jumpAdress);
		this.threshold=threshold;
		this.reference=reference;
	}
	/**
	 * 
	 * @return
	 */
	public Assignment getThreshold() {
		return threshold;
	}
	/**
	 * 
	 * @return
	 */
	public int getReference() {
		return reference;
	}

	@Override
	public String toString() {
		return "If [threshold=" + threshold + ", reference=" + reference + "]";
	}
	

}
