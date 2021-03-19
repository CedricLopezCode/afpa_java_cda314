package Serie_exercices;

public class Livre {
	//Les attributs
	private int id;
	private String titre;
	private String auteur;
	private double prix;
	private static int id_increment = 1;
	
	public int getId() {
		return id;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public double getPrix() {
		return prix;
	}

	public Livre(String titre, String auteur, double prix) {
		super();
		this.id = id_increment++;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", "
				+ "auteur=" + auteur + ", prix=" + prix + "]";
	}
}
