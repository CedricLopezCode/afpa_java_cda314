package tp_vehicule;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Voiture c3= new Voiture();
		
		//Moto bmw = new Moto("BMW", 50, 30, 2);
		
		Moto bmw = new Moto();
		Voiture ford = new Voiture(4, 270.5, 180, 50, "Porche", "911");
		
		Voiture polo = new Voiture(4, 27, 300, 152, "Porche", "911");
		
		
		System.out.println(ford.toString());
		
		Pompe pompe1 = new Pompe("Essence", 5000, 2000);
		Pompe pompe2 = new Pompe("Diessel", 10000, 7000);
		
		//En cas d'erreur
		//ford.faireLeplein(pompe2);
		polo.setTypeCarburant("Essence");
		polo.setContenanceReservoir(3500);
		polo.setContenuReservoir(2.5);
		System.out.println("Type de carburant \n\t" +polo.getTypeCarburant());
		
		System.out.println("Contenu \n\t" +polo.getContenuReservoir());
		
		System.out.println("Contenance \n\t" +polo.getContenanceReservoir());
		
		polo.faireLeplein(pompe1);
		//Voir le contenu reservoir et la pompe
		System.out.println(" Je viens de faire le plein:" +polo.getContenuReservoir());
		System.out.println(" Nouveau contenu de la pompe apres passage vehicule \n\t"
				+ ""+ pompe1.getContenu() +" litre(s)");
		
	}

}
