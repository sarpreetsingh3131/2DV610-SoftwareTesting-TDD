package model;

import java.util.ArrayList;

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
		// TODO Auto-generated method stub
	}
}