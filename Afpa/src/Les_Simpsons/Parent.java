package Les_Simpsons;

public class Parent extends GrandParent {
	private String Pere;
	private String Mere;
	
	public Parent() {
		super();
		this.Pere = "Homer";
		this.Mere = "Marge";
		
	}

	public Parent(String pere, String mere) {
		super();
		Pere = pere;
		Mere = mere;
	}
	
	

	@Override
	public String toString() {
		return "p�re est " + Pere + ", m�re est " + Mere;
	}

	public String Pere() {
		return "Homer";
	}
	
	public String Mere() {
		return "Marge";
	}
}
