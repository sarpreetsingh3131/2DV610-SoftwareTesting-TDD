package model;

import rules.RulesFactory;

public class Dealer extends Player{

	private Deck m_deck;
	
	public Dealer(Deck deck) {
		m_deck = deck;
	}

	public Dealer(RulesFactory a_factory) {
		// TODO Auto-generated constructor stub
	}

	public void dealCardTo(Player player, boolean show) {
		Card c = m_deck.getCard();
		c.show(show);
		player.dealCard(c);
	}

	public boolean isDealerWinner(Player a_player) {
		// TODO Auto-generated method stub
		return false;
	}
}
