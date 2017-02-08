public class CardsGeneration {
	public static String cardPicker() {
		int randomCard = (int)(Math.random() * 10);
		int otherThanOne = 0;
		String showCard = "";
		
		
		if(randomCard >= 0 && randomCard <= 5) {
			showCard = "1";
		}
		else if(randomCard > 5){
			otherThanOne = (int)(Math.random() * 10);
			switch (otherThanOne) {
			case 1: showCard = "2"; break;
			case 2: showCard = "3"; break;
			case 3: showCard = "4"; break;
			case 4: showCard = "5"; break;
			case 5: showCard = "7"; break;
			case 6: showCard = "8"; break;
			case 7: showCard = "10"; break;
			case 8: showCard = "11"; break;
			case 9: showCard = "12"; break;
			case 10: showCard = "Sorry!"; break;
			}
		}
		return showCard;
		
		/* 5/45 chance that we draw a 1
		 * 4/45 chance that we draw a 2
		 * 4/45 chance that we draw a 3
		 * 4/45 chance that we draw a 4
		 * 4/45 chance that we draw a 5
		 * 4/45 chance that we draw a 7
		 * 4/45 chance that we draw a 8
		 * 4/45 chance that we draw a 10
		 * 4/45 chance that we draw a 11
		 * 4/45 chance that we draw a 12
		 * 4/45 chance that we draw a sorry!
		 */
	}
}
