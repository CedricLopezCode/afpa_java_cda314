package POO;

public class Personne {
	private String nom;
	private String prenom;
	private String email;
	
	public Personne() {
		super();
	}
	

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}


	public Personne(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nouveau_nom) {
		this.nom = nouveau_nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne("test nom","test prenom", "test email");
		Personne p3 = new Personne("test nom","test prenom", "test email");
		Personne p4 = new Personne("moussa","test ca", "test test");
		Personne p5 = new Personne("Sonia","test prenom", "test email");
		Personne p6 = new Personne("Simon","test prenom", "test email");
		Personne p7 = new Personne("Nadia","test prenom");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p4);
		System.out.println(p7);
		
		System.out.println(p5.getNom());
		p5.setPrenom("afpa");
		System.out.println(p5.getPrenom());
		
		System.out.println(p5);
		
	}
	
	
}
