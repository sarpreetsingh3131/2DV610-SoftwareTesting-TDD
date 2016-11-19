package model;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> m_cards;

	public Deck() {

	}

	public Deck makeNewDeck(Card card) {
		return new Deck(card);
	}

	private Deck(Card card) {
		m_cards = new ArrayList<Card>();

		for (int i = 0; i < Card.Color.Hidden.ordinal(); i++) {
			for (int j = 0; j < Card.Value.Hidden.ordinal(); j++) {
				m_cards.add(card.makeNewCard(Card.Color.values()[i], Card.Value.values()[j]));
			}
		}
	}

	public ArrayList<Card> getCards() {
		return m_cards;
	}
}
