package exercices;

public class exercice1 {

	public static void main(String[] args) {
		int annee = 2000;
		
		if(annee % 4 == 0 && annee % 100 != 0 || annee % 400 ==0) {
			System.out.println(" L'ANNEE "+ annee + " BISSEXTILE");
		}else {
			System.out.println("PAS BISSEXTILE");
		}
		
		System.out.println("EXERCICE 2");
		
		int nombreP = 42;
		int divisible =0;	
		for (int test = 2; test < nombreP; test++) {
			if(nombreP % test == 0) {
				System.out.println("pas nombre premier");
				divisible =1;
				break;
			}
		}
		
		if(divisible == 0) {
			System.out.println("est premier");
		}
		moussa1();
		
		moussa2();
	}

	// fonction ou methode
	public void moussa() {
		System.out.println("Bonjour");
	}
	
	public static int moussa1() {
		System.out.println("Bonjour");
		
		return 52;
	}
	
	public static String moussa2() {
		System.out.println("Bonjour");
		
		return "";
	}	
}
