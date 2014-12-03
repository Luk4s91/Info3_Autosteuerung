public abstract class Movement extends Command {
	public int hwAdress;
	/**
	 * 
	 * @param iD
	 * @param stepId
	 * @param hwAdress
	 */
	Movement(int iD, int stepId, int hwAdress){
		super("Movement", iD, stepId);
		this.hwAdress=hwAdress;
	}
	/**
	 * 
	 * @return
	 */
	public int getHwAdress() {
		return hwAdress;
	}

	@Override
	public String toString() {
		return super.toString()+"Movement [hwAdress=" + hwAdress + "]";
	}

}
