package calculatrice;

public class Calcul {

	public static void main(String[] args) {
		
		//System.out.println(addition(5,75));
		//System.out.println(addition(55,2575));
	
		// AUTRE OPTION
		addition2(5,75);
		addition2(5,75,35,44);
		
		addition2(5,75,35,44,5,7,85,10);
		
		System.out.println("Le resultat de la sousc est de : "+sousc(55,2575));
		System.out.println("Le resultat de la multi est de : "+multi(55,2575));
		System.out.println("Le resultat du modulo est de : "+modulo(55,2575));
		System.out.println("Le resultat de la div est de : "+div(55,10));
	
	
	}
	
	//Addition
	public static int addition(int a, int b) {
		System.out.println("Le resultat de l'addion est de : ");
		return a+b;
	}
	
	public static int addition2(int ...nbre) {
		int resultat =0;
		for (int test =0; test < nbre.length; test++) {
			//System.out.print(" ---"+nbre[test]+ 	"--");
			
			resultat += nbre[test];
		}
		System.out.println(resultat);
		
		return resultat;
	}
	
	//Sousc
	public static int sousc(int a, int b) {

		return a-b;
	}
	
	//Multi
	public static int multi(int a, int b) {

		return a*b;
	}
	
	//Modulo
	public static int modulo(int a, int b) {

		return a%b;
	}
	
	//Div
	public static float div(int a, int b) {

		return a/b;
	}
	
}