package Les_Simpsons;

public class Main {

	public static void main(String[] args) {
		Enfant fils = new Enfant();
		Parent parent = new Parent();
		
		/*System.out.print(fils.Fils()+" mon p�re est " +fils.Pere());
		System.out.print(", ma mere est " +fils.Mere());
		System.out.println(", mon grand-p�re est " +fils.GrandPere());
		System.out.println(", ma grand-m�re est " +fils.GrandMere());*/
		
		Enfant fille = new Enfant("Lisa");
		Enfant fille2 = new Enfant("Maggie");
		
		System.out.println(parent);
		System.out.println(fils+" mon p�re est "+fils.Pere());
		System.out.println(fille);
		System.out.println(fille2+" ma m�re est "+fils.Mere());
	}

}
