package Serie_exercices;

public class Livre {
	/*
	 * Exercice 1 :
		1. D�finir une classe Livre avec les attributs suivants : Id, Titre, Auteur (Nom
		complet), Prix.
		2. D�finir les accesseurs aux diff�rents attributs de la classe.
		3. D�finir un constructeur permettant d�initialiser les attributs d'un objet
		livre par des valeurs saisies par l�utilisateur. Sachant qu�Id doit �tre autoincr�ment.
		4. D�finir la m�thode toString ( ) permettant d�afficher les informations du livre
		en cours.
		5. �crire un programme testant la classe Livre.
	 */
	
	//J'apporte mon aide :)
	
	//1. D�finir une classe Livre avec les attributs suivants : 
	//ATTRIBUTES: Id, Titre, Auteur (Nom complet), Prix.
	
	private int id;
	private String titre;
	private String auteur;
	//double: on peut avoir des nombres � virgule
	private double prix;
	
	//Cr�ation du constructeurs sans param�tres
	public Livre() {
		super();
		//Je lui donne ici des valeurs par defaut
		this.titre = "Cool le java";
		this.auteur = "Afpa";
		this.prix = 99.99;
	}
	
}
