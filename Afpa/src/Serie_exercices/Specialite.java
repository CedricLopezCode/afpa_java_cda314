package Serie_exercices;

public class Specialite {
	private int id;
	private String nom;
	
	private static int id_increment = 1;
	
	public Specialite(String nom) {
		super();
		this.id= id_increment++;
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return  nom;
	}
}
