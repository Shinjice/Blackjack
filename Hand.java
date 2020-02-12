import java.util.ArrayList;


public class Hand {
	private String naamSpeler;
	private ArrayList<Kaart> handKaarten;
	public int punten;

	public Hand(String player) {
		naamSpeler = player;
		handKaarten = new ArrayList<Kaart>();
		punten = 0;
	}

	public void latenZien() {
		System.out.println(naamSpeler + ":");
		for (Kaart kaart: handKaarten) {
			kaart.latenZien();
		}
		System.out.println(naamSpeler + " totaal: " + punten);
	}	
	

	public void neem(Kaart huidigeKaart) {
		handKaarten.add(huidigeKaart);
		getPunten(huidigeKaart);	
	}

	public void getPunten(Kaart huidigeKaart) {
		
		if (huidigeKaart.rank.equals("A")){
			if (punten <= 10) {
				punten += 11;
			}
			else {
				punten += 1;
			}
		}
		else {
			punten += huidigeKaart.value;
		}

	}
}

