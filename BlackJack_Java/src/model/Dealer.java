package model;

import rules.BasicHitRule;
import rules.DealerWinRule;
import rules.RulesFactory;

public class Dealer extends Player {

	private Deck m_deck;
	private DealerWinRule m_winRule;
	private BasicHitRule m_hitRule;

	public Dealer(Deck deck, RulesFactory a_factory) {
		m_deck = deck;
		m_winRule = a_factory.getWinRule();
		m_hitRule = a_factory.getHitRule();
	}

	public boolean isDealerWinner(Player a_player) {
		return m_winRule.isDealerWinner(a_player, this, g_maxScore);
	}

	public boolean isGameOver() {
		if (m_hitRule.doHit(this) != true) {
			return true;
		}
		return false;
	}

	public boolean hit(Player a_player, boolean show) {
		if (a_player.calcScore() < g_maxScore && !isGameOver()) {
			Card c = m_deck.getCard();
			c.show(show);
			a_player.dealCard(c);
			return true;
		}
		return false;
	}
}