package com.small.Cards;

import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class Deck {
	private Card[] deck = new Card[52];
	static Random random = new Random(Double.doubleToLongBits(Math.random()));

	Deck() {
		int ctr = 0;

		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				Card card = new Card(suit, rank);
				deck[ctr] = card;
				ctr++;
			}	
		}
	}
	void Shuffle() {
		List<Card> cardList = Arrays.asList(deck);
		Collections.shuffle(cardList, random);
	}
	
	public void Show()  {
		for (Card card : deck) {
			System.out.print(card.getShortName() + "-");
			System.out.println(card);
		}
	}
}
