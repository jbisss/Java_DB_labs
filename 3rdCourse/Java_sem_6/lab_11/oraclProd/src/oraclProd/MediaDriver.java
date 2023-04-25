package oraclProd.src.oraclProd;
//step 13
public class MediaDriver  {
	public static void MediaTest() {
		MultimediaControl mc1=new AudioPlayer("Sony","WAVE");
		MultimediaControl mc2=new MoviePlayer("Philips",MonitorType.LCD,new Screen("200x400",40,200));
		
		mc1.next();
	    mc1.play();
	    mc1.previous();
	    mc1.stop();
	    mc2.next();
	    mc2.play();
	    mc2.previous();
	    mc2.stop();
	}
}
