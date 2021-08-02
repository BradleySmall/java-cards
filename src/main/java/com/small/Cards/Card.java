package com.small.Cards;

public class Card {
	private final Suit suit;
	private final Rank rank;

	Card (Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String getShortName () {
		return this.rank.getShortName() + this.suit.getShortName();
	}

	@Override
	public String toString() {
		return this.rank.toString() + " of " + this.suit.toString();
	}
}

