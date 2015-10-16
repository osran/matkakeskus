package fi.agileo.matkakeskus.domain;

public class Automaatti {
	
	public Lippu TulostaLippu(int tyyppi, String maaranpaa, boolean opiskelija) {	
		
		if (maaranpaa == null) {
			maaranpaa = "";
		}
		
		if (tyyppi != 2) {
			tyyppi = 1;
		}
		
		double arvo = LaskeArvo(tyyppi, maaranpaa, opiskelija);
		return new Lippu(tyyppi, maaranpaa, arvo);
	}
	
	public double LaskeArvo(int tyyppi, String maaranpaa, boolean opiskelija) {
		
		double arvo;
		
		if (maaranpaa == null) {
			maaranpaa = "";
		}
		
		// Etäisyys määränpäähän
		
		arvo = LaskeEtaisyys(maaranpaa) / 3;
		
		// Juna-alennus
		
		if (tyyppi == 2) {
			arvo = arvo * 0.75;
		}
		
		// Opiskelija-alennus
		
		if (opiskelija == true) {
			arvo = arvo * 0.66;
		}
		
		return arvo;
		
	}
	
	public int LaskeEtaisyys(String maaranpaa) {
		
		int etaisyys;
		
		if (maaranpaa == null) {
			maaranpaa = "";
		}
		
		// Testitietoa
		
		switch (maaranpaa) {
		
		case "Helsinki":
			etaisyys = 300;
			break;
		case "Turku":
			etaisyys = 400;
			break;
		case "Tampere":
			etaisyys = 125;
			break;
		case "Petäjävesi":
			etaisyys = 32;
			break;
		case "Vaasa":
			etaisyys = 300;
			break;
		default:
			etaisyys = 0;
			break;
		}
		
		return etaisyys;
	}

}
