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
		
		Ville v1 = new Ville();
		Ville v2 = new Ville("Lyon", 69);
		Ville v3 = new Ville("Marseille", 13);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		v1.setNom("Lyon");
		v1.setDepartement(69);
		System.out.println(v1);
		
		v1.affichage();
	}

}
