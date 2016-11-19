package model;

import java.util.ArrayList;

import model.Card.Value;

public class Player {

	private ArrayList<Card> m_hand;

	public Player() {

	}

	public Player makeNewPalyer(ArrayList<Card> a_hand) {
		return new Player(a_hand);
	}

	private Player(ArrayList<Card> a_hand) {
		m_hand = a_hand;
	}

	public void dealCard(Card card) {
		m_hand.add(card);
	}

	public void clearHand() {
		m_hand.clear();
	}

	public ArrayList<Card> getHand() {
		return m_hand;
	}

	public void showHand() {
		for (int i = 0; i < m_hand.size(); i++) {
			Card c = m_hand.get(i);
			if (c.getValue() == Value.Hidden) {
				c.show(true);
			}
		}
	}
}