package oraclProd.src.oraclProd;
//step 2
public enum ItemType {
	AUDIO("AU"),
	VISUAL("VI"),
	AUDIO_MOBILE("AM"),
	VISUAL_MOBILE("VM");
	public String code;
	
	ItemType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}			
}
