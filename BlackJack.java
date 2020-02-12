import java.util.Scanner;

public class BlackJack {

	static Dek nieuwDek = new Dek();
	static Hand dealerHand;
	static Hand spelerHand;

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		

		while (true) {
			System.out.println("Welcome to BlackJack!");
			
			
			nieuwDek = new Dek();
			nieuwDek.shuffle();

			dealerHand = new Hand("Dealer");
			spelerHand = new Hand("Speler");

			nieuwDek.deal(spelerHand);
			nieuwDek.deal(dealerHand);
			nieuwDek.deal(spelerHand);

			dealerHand.latenZien();
			spelerHand.latenZien();

			

			while (true) {	
								
				System.out.println("Druk K voor kaart, P voor passen en Q voor quit");
				String choice = input.nextLine();

				if (choice.toUpperCase().equals("K")) {

					nieuwDek.deal(spelerHand);
					

					while (true) {
						
						

						if (spelerHand.punten > 21) {
							dealerHand.latenZien();
							spelerHand.latenZien();
							System.out.println("Je hebt meer dan 21 getrokken");
							return;
							
							

						} else if (spelerHand.punten < 21) {
							System.out.println("Nieuwe Situatie: ");
							dealerHand.latenZien();
							spelerHand.latenZien();
							break;							
							}					
						
					}
				
				}
				else if (choice.toUpperCase().equals("P")) {
					nieuwDek.deal(dealerHand);
					
					if (dealerHand.punten > 21){
						
						dealerHand.latenZien();
						spelerHand.latenZien();
						System.out.println("Dealer trekt meer dan 21!");
					}
					else if (dealerHand.punten <= 16){
						nieuwDek.deal(dealerHand);
					}
					else {
						System.out.println("Dealer neemt geen kaart meer");
						if (spelerHand.punten < dealerHand.punten) {
							dealerHand.latenZien();
							spelerHand.latenZien();
							System.out.println("Dealer wint");
						}
						else if (spelerHand.punten > dealerHand.punten){
							dealerHand.latenZien();
							spelerHand.latenZien();
							System.out.println("Speler wint");
						}
						else {
							dealerHand.latenZien();
							spelerHand.latenZien();
							System.out.println("Het is gelijk");
						}
				
					}
				}
				else if (choice.toUpperCase().equals("Q")) {
					System.out.println("Bedankt voor het spelen, tot ziens.");
					return;
				}
				else {
					System.out.println("U heeft verkeerde keuze gemaakt.");
				}
			}
		}
	}
}

				 