package POO;

public class Main {

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
		
		//EXERCICE VILLE
		Ville ville_par_defaut = new Ville();
		Ville nouvelle_ville = new Ville("moussaCity",123);
		Ville nouvelle_ville2 = new Ville("ingridCity",971);
		
		ville_par_defaut.affichage();
		nouvelle_ville.affichage();
		nouvelle_ville2.affichage();
		
		ville_par_defaut.setNom("Lyon");
		ville_par_defaut.setDept(69);
		ville_par_defaut.affichage();
		System.out.println(ville_par_defaut.getNom());
	}

}
