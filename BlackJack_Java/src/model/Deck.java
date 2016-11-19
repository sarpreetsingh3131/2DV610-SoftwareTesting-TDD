package model;

import java.util.ArrayList;

public class Deck {

	public Deck() {

	}

	public Deck makeNewDeck(Card card) {
		return new Deck(card);
	}

	private Deck(Card card) {
		for (int i = 0; i < Card.Color.Hidden.ordinal(); i++) {
			for (int j = 0; j < Card.Value.Hidden.ordinal(); j++) {
				card.makeNewCard(Card.Color.values()[i], Card.Value.values()[j]);
			}
		}
	}

	public ArrayList<Card> getCards() {
		// TODO Auto-generated method stub
		ArrayList<Card> m_cards = new ArrayList<Card>();
		
		for(int i = 0; i< 52; i++){
			m_cards.add(null);
		}
		return m_cards;
	}
}
