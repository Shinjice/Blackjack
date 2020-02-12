public class Kaart {
	private String suit;
	public String rank;
	public int value;

	public Kaart(String afkortingSuit, String afkortingRank){
		suit = afkortingSuit;
		rank = afkortingRank;
		if (rank.equals("A")){
			value = 1; 
		}
		else if (rank.equals("K") || rank.equals("J") || rank.equals("Q")) {
			value = 10;
		}
		else {
			value = Integer.parseInt(rank); 
		}
		
	}

	public void latenZien() {
		String benamingSuit;
		String benamingRank;
		
		if (suit.equals("H")){
			benamingSuit = "Harten";
		}
		else if (suit.equals("S")){
			benamingSuit = "Schoppen";
		}
		else if (suit.equals("R")){
			benamingSuit = "Ruiter";
		}
		else {
			benamingSuit = "Klaver";
		}
		
		if (rank.equals("A")){
			benamingRank = "Aas";
		}
		else if (rank.equals("K") ){
			benamingRank = "Koning";
		}
		else if (rank.equals("J")){
			benamingRank = "Boer";
		}
		else if (rank.equals("Q")){
			benamingRank = "Vrouw";
		}
		else {
			benamingRank = rank;
		}

		System.out.println(benamingRank + " " +  benamingSuit);
	}

}