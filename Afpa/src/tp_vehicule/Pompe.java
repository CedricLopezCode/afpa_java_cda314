package tp_vehicule;

public class Pompe {

	private String typeCarburant;
	private int contenance;
	private double contenu;
	public Pompe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pompe(String typeCarburant, int contenance, int contenu) {
		super();
		this.typeCarburant = typeCarburant;
		this.contenance = contenance;
		this.contenu = contenu;
	}
	public String getTypeCarburant() {
		return typeCarburant;
	}
	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}
	public int getContenance() {
		return contenance;
	}
	public void setContenance(int contenance) {
		this.contenance = contenance;
	}
	public double getContenu() {
		return contenu;
	}
	public void setContenu(double nouveauContenuPompe) {
		this.contenu = nouveauContenuPompe;
	}
	
	
	
	
}
