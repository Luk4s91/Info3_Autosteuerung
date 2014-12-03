public class Direction extends Movement{
	private int degree;
	/**
	 * 
	 * @return
	 */
	public int getDegree() {
		return degree;
	}
	/**
	 * 
	 * @param iD
	 * @param stepId
	 * @param hwAdress
	 * @param degree
	 */
	public Direction(int iD, int stepId, int hwAdress, int degree){
		super(iD,stepId, hwAdress);
		this.degree=degree;
	}
}
