package Serie_exercices;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//Version 1
		Specialite [] specialite = new Specialite[5];
		
		specialite[0] = new Specialite("JAVA/JEE");
		specialite[1] = new Specialite("HTML/CSS");
		specialite[2] = new Specialite("Gestion projet");
		specialite[3] = new Specialite("JS");
		specialite[4] = new Specialite("PHP");
		
		
		Enseignant [] en = new Enseignant[4];
		
		en[0] = new Enseignant("Kass", "Zack", "test@test",specialite[0]);
		en[1] = new Enseignant("Afpa", "Test", "test@test",specialite[0]);
		en[2] = new Enseignant("test", "Vanessa", "test@test",specialite[4]);
		en[3] = new Enseignant("lol", "pfff", "test@test",specialite[3]);
		
		for (Specialite spec : specialite) {//0 --- 1----2---3---4
			//System.out.println(spec);
			int compter =0;
			for (Enseignant enseignant : en) {//0
				//System.out.println("\t "+enseignant);
				
				if (enseignant.getSpecialite().getId() == spec.getId()) {
					System.out.println("La spécialité "+ spec+ " a pour enseignant "+enseignant.getNom() + " "+enseignant.getPrenom());
					System.out.println("-------------------------------------------");
					compter = 1;
				}
				
			}
			if(compter == 0) {				
				System.out.println("Aucun enseignant pour la spécialité "+spec);
			}
		}
		
		System.out.println("=============== tableau semaine  ==================");
		
		System.out.println("===============  Option avec les collections  ==================");

		ArrayList<String> semaine2 = new ArrayList<>(Arrays.asList("Lundi", "mar", "mercredi", "Jeudi","vendredi", "samedi", "dimac"));
		
		
		//Retirer la dernière valeur du tableau
		System.out.println("La taille du tableau\t");
		System.out.println(semaine2.size()-1);
		semaine2.remove(semaine2.size() -1);
		
		//Afficher les valeurs du tableau
		System.out.println("" +semaine2);
		
		//Ajouter la valeur la valeur ‘dimanche’ à la fin du tableau
		semaine2.add("Dimanche");
		System.out.println("Ajouter la valeur la valeur ‘dimanche’ à la fin du tableau\n \t" +semaine2+ "\n");
		
		//Remplacer le mar par mardi
		//Positiion de mar
		int index = semaine2.indexOf("mar");
		semaine2.set(index, "mardi");
		System.out.println("Remplacer le mar par mardi \t"+semaine2);
		
		//Afficher le nombre de valeurs du tableau
		//size
		System.out.println("Afficher le nombre de valeurs du tableau \n\t"+semaine2.size());
		
		//Afficher la 5éme valeur
		System.out.println("Afficher la 5éme valeur: \n\t" +semaine2.get(4));
		
		//Affiche le nombre
		System.out.println("Afficher le nouveau: \n\t" +semaine2);
	}
}
