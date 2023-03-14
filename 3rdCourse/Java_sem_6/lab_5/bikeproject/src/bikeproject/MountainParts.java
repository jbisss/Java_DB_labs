package bikeproject.src.bikeproject;

	public interface MountainParts {
	//public final String TERRAIN = "off_road";
	public final BikeUses terrain = BikeUses.off_road;


	public String getSuspension();
	public String getType();
	public void setSuspension(String newValue);
	public void setType(String newValue);
}
