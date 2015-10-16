package fi.agileo.matkakeskus.domain;

public class Lippu {
	
	private int tyyppi;
	private double arvo;
	private String maaranpaa;
	
	public Lippu(int tyyppi, String maaranpaa, double arvo) {
		this.tyyppi = tyyppi;
		this.maaranpaa = maaranpaa;
		this.arvo = arvo;
	}
	
	public int getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(int tyyppi) {
		this.tyyppi = tyyppi;
	}

	public double getArvo() {
		return arvo;
	}

	public void setArvo(double arvo) {
		this.arvo = arvo;
	}

	public String getMaaranpaa() {
		return maaranpaa;
	}

	public void setMaaranpaa(String maaranpaa) {
		this.maaranpaa = maaranpaa;
	}
	
	public String toString() {
		return tyyppi + "/" + arvo + "/" + maaranpaa;
	}

	

}
