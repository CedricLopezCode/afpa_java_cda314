package Les_Simpsons;

public class GrandParent {
	private String GrandPere;
	private String GrandMere;
	
	public GrandParent() {
		super();
		this.GrandPere = "Abram";
	}
	
	public GrandParent(String grandPere, String grandMere) {
		super();
		GrandPere = grandPere;
		GrandMere = grandMere;
	}

	@Override
	public String toString() {
		return "GrandParent [GrandPere=" + GrandPere + ", GrandMere=" + GrandMere + "]";
	}
}
