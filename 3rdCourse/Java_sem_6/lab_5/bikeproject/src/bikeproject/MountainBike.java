package bikeproject.src.bikeproject;

public class MountainBike extends Bike implements MountainParts{

	private String suspension, type;
	private int frameSize;
	public void printDescription(){
		System.out.println("MountainBike!");
	}
	public MountainBike()
	{
		this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
	}//end constructor
	
	public String getSuspension() {
		return suspension;
	}
	public void setSuspension(String newValue) {
		suspension=newValue;
	}
	public String getType() {
		return type;
	}
	public void setType(String newValue) {
		type=newValue;
	}
	
	
    public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears, 
    		            String suspension, String type, int frameSize) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}//end constructor

	public String toString()
	{
		return super.toString()+
				"This mountain bike is a " + this.type +
				" bike and has a " + this.suspension +
				" suspension and a frame size of " +
				this.frameSize + "inches."+
				"\nThis bike is best for : 		"+RoadBike.terrain.toString();
	}

}//end class MountainBike
