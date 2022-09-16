package poker;

public class Poker {
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isFullHouse(String cards[], int n) {
		
		if(cards == null) {
			return false;
		}
		
		if(isThreeOfaKind(cards, n, 0, 3)) {
			if(isOnePairs(cards, n, 3, n)) {
				return true;
			}
		}
		
		if(isOnePairs(cards, n,0, 2)) {
			if(isThreeOfaKind(cards, n, 2, n)) {
				return true;
			}
		}
		
		
		
		return false;
		
		
//		if(isThreeOfaKind(cards, n, 0, 3) && isOnePairs(cards, n, 3, n)) {
//			return true;
//		}
//		if(isOnePairs(cards, n, 0, 2) && isThreeOfaKind(cards, n, 2, n)) {
//			return true;
//		}
//		return false;
	}

	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isThreeOfaKind(String cards[], int n, int start, int stop) {
		
	
		for (int i=start; i<stop-2; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1) &&
					cards[i+1].charAt(1) == cards[i+2].charAt(1))
					return true;
		}

		return false;
	}

	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isTwoPairs(String cards[], int n) {
		int count = 0;
		for (int i=0; i<n-1; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1)) {
				count++;
				i++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;
	}
	public boolean isOnePairs(String cards[], int n, int start, int stop) {
		int count = 0;
		for (int i=start; i<stop-1; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1)) {
				count++;
				i++;
			}
		}
		if (count == 1)
			return true;
		else
			return false;
	}
	
	
	
	
	public static void main(String args[]) {
		System.out.println(new Poker().isFullHouse(
			new String[] {"C3", "D3", "S3", "HX", "SX"}, 5));
	}
}
// end of Poker.java
