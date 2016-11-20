package model;

import rules.DealerWinRule;
import rules.RulesFactory;

public class Dealer extends Player{

	private Deck m_deck;
	private DealerWinRule m_winRule;
	
	public Dealer(Deck deck) {
		m_deck = deck;
	}

	public Dealer(RulesFactory a_factory) {
		m_winRule = a_factory.getWinRule();
	}

	public void dealCardTo(Player player, boolean show) {
		Card c = m_deck.getCard();
		c.show(show);
		player.dealCard(c);
	}

	public boolean isDealerWinner(Player a_player) {
		return m_winRule.isDealerWinner(a_player, this, g_maxScore);
	}
}
