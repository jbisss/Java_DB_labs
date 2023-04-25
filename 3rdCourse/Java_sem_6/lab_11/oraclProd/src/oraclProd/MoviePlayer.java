package oraclProd.src.oraclProd;
//step 11
public class MoviePlayer extends Product implements MultimediaControl {
	public MonitorType monitorType;
	public Screen screen;
	
	public MoviePlayer(String name) {
        super(name);
        screen = new Screen("1920x1080", 40, 22);
        monitorType = MonitorType.LCD;
    }
	
	public MoviePlayer(String name, MonitorType monitorType, Screen screen) {
		super(name);
		this.monitorType=monitorType;
		this.screen=screen;
		
	}

	@Override
	public void play() {
		System.out.println("Playing movie");
		
	}

	@Override
	public void stop() {
		System.out.println("Stoping movie");
		
	}

	@Override
	public void previous() {
		System.out.println("Previous movie");
		
	}

	@Override
	public void next() {
		System.out.println("Next movie");
		
	}
	
	public String toString() {
	    return
	        super.toString() + "\n" +
	            "Screen : " + screen + "\n" +
	            "Monitor Type : " + monitorType;

	  }
}
