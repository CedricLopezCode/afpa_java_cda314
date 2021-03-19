package POO;

public class Ville {
	 private String nom;
	 private int dept;
	 
	public Ville() {
		super();
		this.nom = "Paris";
		this.dept= 75;
	}
	
	public Ville(String nom, int dept) {
		super();
		this.nom = nom;
		this.dept = dept;
	}



	public void affichage() {
		System.out.println("la ville de " +nom+ " est dans le département "+dept);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}
	 
	 
}