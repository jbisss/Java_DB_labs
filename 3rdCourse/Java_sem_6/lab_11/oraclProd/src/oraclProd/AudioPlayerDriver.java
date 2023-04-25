package oraclProd.src.oraclProd;
//step 7
public class AudioPlayerDriver {
	public static void AudPlTest() {
		AudioPlayer a1 = new AudioPlayer("Walkman", "MP3");
	    a1.play();
	    a1.stop();
	    a1.next();
	    a1.previous();
	    System.out.println(a1.toString());

	}
}
