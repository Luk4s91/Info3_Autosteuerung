public class Assignment extends Control{
	private int operand;
 
	/**
	 * 
	 * @param iD
	 * @param stepId
	 * @param operand
	 */
	Assignment(int iD, int stepId, int operand){
		super(iD, stepId);
		this.operand=operand;
	}
 
	@Override
	public String toString() {
		return "Assignment [operand=" + operand + "]";
	}

	public int getOperand() {
		return operand;
	}

	public void increase(){
	 
	}
 
	public void decrease(){
	 
	}
}

