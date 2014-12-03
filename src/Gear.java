public class Gear extends Movement{
	private int speed;
	private int duration;
	
	/**
	 * 
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * 
	 * @return
	 */
	public int getDuration() {
		return duration;
	}
	
	@Override
	public String toString() {
		return "Gear [speed=" + speed + ", duration=" + duration + "]";
	}
	/**
	 * 
	 * @param iD
	 * @param stepId
	 * @param hwAdress
	 * @param speed
	 * @param duration
	 */
	Gear(int iD, int stepId, int hwAdress, int speed, int duration){
		super(iD, stepId, hwAdress);
		this.speed=speed;
		this.duration=duration;
	}
	
}
