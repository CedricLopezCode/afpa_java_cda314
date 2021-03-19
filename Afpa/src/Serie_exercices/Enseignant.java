package Serie_exercices;

public class Enseignant{
	private static int id;
	private String nom;
	private String prenom;
	private String email;
	private Specialite specialite;
	
	
	public Enseignant(String nom, String prenom, String email, Specialite spec) {
		super();
		this.id ++;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.specialite = spec;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Enseignant.id = id;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getEmail() {
		return email;
	}
	
	public Specialite getSpecialite() {
		return specialite;
	}
	
	@Override
	public String toString() {
		return "Enseignant [nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}
}
