package model;

import model.Card.Color;
import model.Card.Value;

public class Deck {

	public Deck makeNewDeck(Card card) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 52; i++){
			card.makeNewCard(Color.Clubs, Value.Ace);
		}
		return new Deck();
	}

}
