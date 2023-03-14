package bikeproject.src.bikeproject;

public class RoadBike extends Bike implements RoadParts{
	
	private int  tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	public void printDescription(){
		System.out.println("RoadBike!");
	}
	public int getTyreWidth() {
		return tyreWidth;
	}
	
	public int getPostHeight() {
		return postHeight;
	}
	
	public void setTyreWidth(int newValue) {
		tyreWidth=newValue;
	}
	public void setPostHeight(int newValue) {
		postHeight=newValue;
	}
	
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor

	public String toString()
	{
		return super.toString()+"This Roadbike bike has " + this.tyreWidth +
				"mm tyres and a post height of " + this.postHeight + "."+
				"\nThis bike is best for : 		"+RoadBike.terrain.toString();
	}

}//end class RoadBike
