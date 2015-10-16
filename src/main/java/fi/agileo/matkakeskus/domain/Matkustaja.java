package fi.agileo.matkakeskus.domain;

import java.util.ArrayList;

public class Matkustaja {
	
	private ArrayList<Lippu> liput;
	
	public ArrayList<Lippu> getLiput() {
		return liput;
	}

	public void setLiput(ArrayList liput) {
		this.liput = liput;
	}

	private boolean opiskelija;
	
	public Matkustaja() {
		liput = new ArrayList();
		opiskelija = false;
	}
	
	public Matkustaja(boolean opiskelija) {
		liput = new ArrayList();
		this.opiskelija = opiskelija;
	}
	
	public void TilaaLippu(Automaatti a, int tyyppi, String maaranpaa) {
		liput.add(a.TulostaLippu(tyyppi, maaranpaa, this.opiskelija));
	}

}
