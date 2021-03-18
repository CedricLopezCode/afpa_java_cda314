package Les_Simpsons;

public class Enfant extends Parent {
	private String nom;
	
	
	public Enfant() {
		super();
		this.nom = "Bart";
	}

	public Enfant(String nom) {
		super();
		this.nom = nom;
	}

	public Enfant(String pere, String mere) {
		super(pere, mere);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mon nom est " + nom + ", ";
	}


	/*public String Fils() {
		return "Bart,";
	}*/
}
