package model;

public class Dealer extends Player{

	private Deck m_deck;
	
	public Dealer(Deck deck) {
		m_deck = deck;
	}

	public void dealCardTo(Player player, boolean show) {
		Card c = m_deck.getCard();
		c.show(show);
		player.dealCard(c);
	}
}
