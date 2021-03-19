package Serie_exercices;

public class Main {

	public static void main(String[] args) {
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
		
		
		salut();
	}
	
	public static String salut() {
		return "Vivement le week-end";
	}

	
}
