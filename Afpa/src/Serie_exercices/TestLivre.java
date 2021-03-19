package Serie_exercices;

import java.util.Scanner;

public class TestLivre {

	public static void main(String[] args) {
		Livre [] livres = new Livre[2];
		
		Scanner saisie = null;
		
		for (int i = 0; i < livres.length; i++) {
			saisie = new Scanner(System.in);
			
			System.out.println("Saisir le titre");
			String titre = saisie.next();
			
			System.out.println("Saisir l'auteur");
			String auteur = saisie.next();
			
			System.out.println("Saisir le prix");
			double prix = saisie.nextDouble();
			
			livres[i] = new Livre(titre,auteur,prix);
			
		}
		saisie.close();
		
		for(Livre livre:livres) {
			System.out.println(livre);
		}
		
		/*Livre moussa = new Livre("Cool le Java","Afpa",5.55);
		Livre lol = new Livre("J'aime l'informatique","Cda",314);
		Livre pff = new Livre("Oups, on est reconfin�","Macron",99.51);
		Livre pff2 = new Livre("ppf2, on est reconfin�","Macron",99.51);

		System.out.println(moussa);
		System.out.println(lol);
		System.out.println(pff);
		System.out.println(pff2);*/
	}

}