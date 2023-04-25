package oraclProd.src.oraclProd;
//step 9
public class Screen implements ScreenSpec {
	private String resolution;
	private int refreshrate; 
	private int responsetime;
	
	public Screen(String resolution, int refreshRate, int responseTime) {
		    this.resolution = resolution;
		    this.refreshrate = refreshRate;
		    this.responsetime = responseTime;
		  }
	
	@Override
	public String getResolution() {
		return resolution;
	}
	
	@Override
	public int getRefreshRate() {
		return refreshrate;
	}
	
	@Override
	public int getResponseTime() {
		return responsetime;
	} 
	
	public String toString() {
	    return "Resolution : " + getResolution() + "\n" +
	        "Refresh rate : " + getRefreshRate() + "\n" +
	        "Response time : " + getResponseTime();

	  }
}
