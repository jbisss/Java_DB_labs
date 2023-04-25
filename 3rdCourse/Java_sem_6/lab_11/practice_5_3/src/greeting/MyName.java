package practice_5_3.src.greeting;

public class MyName {
	private String name = "Jane";

	public String getName() {
		return name;
	}//end method getName

	public void setName(String name) {
		this.name = name;
	}//end method setName
	public void sayHello() {
		System.out.println("Hi " + this.name);
	}//end method sayHello
}
