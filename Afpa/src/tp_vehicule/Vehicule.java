package tp_vehicule;

public class Vehicule {
	
	protected  String typeCarburant;
	private int contenanceReservoir;
	private double contenuReservoir;
	
	private int vitesseMax;
	
	private int nombreRoue;

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	public int getContenanceReservoir() {
		return contenanceReservoir;
	}

	public void setContenanceReservoir(int contenanceReservoir) {
		this.contenanceReservoir = contenanceReservoir;
	}

	public double getContenuReservoir() {
		return contenuReservoir;
	}

	public void setContenuReservoir(double d) {
		this.contenuReservoir = d;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	public int getNombreRoue() {
		return nombreRoue;
	}

	public void setNombreRoue(int nombreRoue) {
		this.nombreRoue = nombreRoue;
	}
	
	
	public void faireLeplein(Pompe pompe) {
		System.out.println("J'arrive à la pompe");
		
		if(this.typeCarburant != pompe.getTypeCarburant()) {
			System.out.println("Je vais changer de pompe ...");
			
			return;
		}
		
		double besoinEnCarburant = this.contenanceReservoir - this.contenuReservoir;
		System.out.println("J'ai besoin de \n\t ==>" +besoinEnCarburant +" litre(s)");
		
		if(besoinEnCarburant > pompe.getContenu()) {
			besoinEnCarburant = pompe.getContenu();
		}
		
		System.out.println("Faire le plein en ajoutant au contenu ce que j'ai besoin pour remplir");
		this.contenuReservoir += besoinEnCarburant;
		
		double nouveauContenuPompe = pompe.getContenu() - besoinEnCarburant;
		pompe.setContenu(nouveauContenuPompe);
		 
	}
	
	
}
