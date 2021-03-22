package tp_vehicule;

public class Voiture extends Vehicule {
	private String marque;
    private String model;
    
	final int nb_roues=4;

	
	//Version: Joss
	 public Voiture(int nombreRoue, double vitesseMax, double contenanceReservoir, int contenuReservoir,
	            String marque, String model) {
	        super();
	        this.marque = marque;
	        this.model = model;
	    }


	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", model=" + model + ", nb_roues=" + nb_roues + "]";
	}
	 
	 
}
