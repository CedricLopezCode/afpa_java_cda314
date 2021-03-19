package Serie_exercices;

public class Livre {
	/*
	 * Exercice 1 :
		1. Définir une classe Livre avec les attributs suivants : Id, Titre, Auteur (Nom
		complet), Prix.
		2. Définir les accesseurs aux différents attributs de la classe.
		3. Définir un constructeur permettant d’initialiser les attributs d'un objet
		livre par des valeurs saisies par l’utilisateur. Sachant qu’Id doit être autoincrément.
		4. Définir la méthode toString ( ) permettant d’afficher les informations du livre
		en cours.
		5. Écrire un programme testant la classe Livre.
	 */
	
	//J'apporte mon aide :)
	
	//1. Définir une classe Livre avec les attributs suivants : 
	//ATTRIBUTES: Id, Titre, Auteur (Nom complet), Prix.
	
	private int id;
	private String titre;
	private String auteur;
	//double: on peut avoir des nombres à virgule
	private double prix;
	
	//Création du constructeurs sans paramétres
	public Livre() {
		super();
		//Je lui donne ici des valeurs par defaut
		this.titre = "Cool le java";
		this.auteur = "Afpa";
		this.prix = 99.99;
	}
	
}
