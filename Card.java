public class Card {
	private Suit suit;
	private Rank rank;
	Card (Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	public Suit getSuit() {return this.suit;}
	public Rank getRank() {return this.rank;}
	public String getShortName () { return this.rank.getShortName() + this.suit.getShortName(); }
	@Override public String toString() {
		return this.rank.toString() + " of " + this.suit.toString();
	}
}

