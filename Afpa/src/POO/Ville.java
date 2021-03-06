package POO;

public class Ville {
	private String nom;
	private int departement;
	
	public Ville() {
		super();
		this.nom = "Paris";
		this.departement = 75;
	}

	public Ville(String nom, int departement) {
		super();
		this.nom = nom;
		this.departement = departement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDepartement() {
		return departement;
	}

	public void setDepartement(int departement) {
		this.departement = departement;
	}

	@Override
	public String toString() {
		return " La ville est " +nom+ ", son département est "+departement;
	}
	
	public void affichage() {
		System.out.println("La ville est " +nom+", son département est "+departement);
	}
}
