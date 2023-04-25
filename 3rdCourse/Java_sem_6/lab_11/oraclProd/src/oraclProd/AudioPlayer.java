package oraclProd.src.oraclProd;
//step 5
public class AudioPlayer extends Product implements MultimediaControl {
	String audioSpecification; 
	ItemType mediaType; 
	
	public AudioPlayer(String name,String audioSpecification) {
		super(name);
		this.audioSpecification=audioSpecification;
		this.mediaType=ItemType.AUDIO;
	}

	@Override
	public void play() {
		System.out.println("Playing");
		
	}

	@Override
	public void stop() {
		System.out.println("Stopping");
		
	}

	@Override
	public void previous() {
		System.out.println("Previous");
		
	}

	@Override
	public void next() {
		System.out.println("Next");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nAudio Specification: "+audioSpecification+"\nType "+mediaType;
	}
}
