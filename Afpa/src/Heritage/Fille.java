package Heritage;

public class Fille extends Parent{

	public String Fille() {
		return " Je suis la classe fille et je peux h�riter de mes parent";
	}
	public String MereFille() {
		return "Ma m�re s'appelle" +Mere();
	}
	
	public String PereFille() {
		return "Mon p�re s'appelle" +Pere();
	}
}
