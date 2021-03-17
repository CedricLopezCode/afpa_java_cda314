package calculatrice;

import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choisissez une année");
	
		//ANNEE
		int annee = scanner.nextInt();
		if(annee % 4 == 0 && annee % 100 != 0 || annee % 400 ==0) {
			System.out.println(" L'ANNEE "+ annee + " EST BISSEXTILE");
		}else {
			System.out.println("PAS BISSEXTILE");
		}
		
		// Table de multiplication
		System.out.println("Entrez une longueur "+" et une largeur");
        double longueur1 = scanner.nextDouble();
        double largeur2 = scanner.nextDouble();
        double longueur = scanner.nextDouble();
        double largeur = scanner.nextDouble();
        double surface2 = longueur1 * largeur2;
        System.out.println("la surface est de "+surface2+" metre carrée");
        
		System.out.println("Entrez un chiffre");
		 int chiffre = scanner.nextInt();
		 
		 
		 for (int i = 0; i < 11; i++) {
			System.out.println(chiffre +" * " + i+" = "+(chiffre*i));
		}

	}
}
