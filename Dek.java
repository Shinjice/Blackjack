import java.util.ArrayList;
import java.util.Random;

public class Dek {
	private ArrayList<Kaart> dek;
	private String[] Suits = {"H", "S", "K", "R"}; 
	private String[] Ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private int aantal;

	public Dek() {
		dek = new ArrayList<Kaart>();
		for (String suit : Suits) {
			for (String rank : Ranks) {
				dek.add(new Kaart(suit,rank));
			}		
		}
		aantal = dek.size();
	}

	public void deal(Hand player) {
		Kaart tempKaart = dek.get(0);
		dek.remove(0);
		player.neem(tempKaart);
		aantal = dek.size();
	}

	public void shuffle() {
		ArrayList<Kaart> nieuwDek = new ArrayList<Kaart>();
		Random rand = new Random();
		int aantal = dek.size();
		int temp = 0;
		for (int i=0; i < aantal; i++){
			temp = aantal - i;
			int index = rand.nextInt(temp);
			Kaart a = dek.get(index);
			dek.remove(index);
			nieuwDek.add(i, a);
		}
		dek = nieuwDek;
	}

	


}