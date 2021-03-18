package Heritage;

public class Fille extends Parent{

	public String Fille() {
		return " Je suis la classe fille et je peux hériter de mes parent";
	}
	public String MereFille() {
		return "Ma mére s'appelle" +Mere();
	}
	
	public String PereFille() {
		return "Mon pére s'appelle" +Pere();
	}
}

