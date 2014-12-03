public abstract class Command {

	private String name;
	private int iD;
	private int stepID;
	
	/**
	 * 
	 * @return
	 */
	public String getName(){
		return name;
	}
	/**
	 * 
	 * @param namex
	 */
	public void setName(String namex){
		name = namex;
	}
	/**
	 * 
	 * @return
	 */
	public int getID() {
		return iD;
	}
	/**
	 * 
	 * @param iDx
	 */
	public void setID(int iDx) {
		iD = iDx;
	}
	/**
	 * 
	 * @return
	 */
	public int getstepID() {
		return stepID;
	}
	/**
	 * 
	 * @param stepIDx
	 */
	public void setStepID(int stepIDx) {
		stepID = stepIDx;
	}
	/**
	 * 
	 * @param name
	 * @param iD
	 * @param stepId
	 */
	public Command(String name, int iD, int stepId) {
		super();
		this.name = name;
		this.iD = iD;
		this.stepID = stepId;
	}
	@Override
	public String toString() {
		return "Command [name=" + name + ", iD=" + iD + ", stepID=" + stepID
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + stepID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Command other = (Command) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stepID != other.stepID)
			return false;
		return true;
	}
	
		
	
}
