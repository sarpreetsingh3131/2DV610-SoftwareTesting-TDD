package model;

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
}
