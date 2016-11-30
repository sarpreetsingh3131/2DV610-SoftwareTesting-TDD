package model;

public class Game {

	private Dealer m_dealer;
	private Player m_player;
	
	public Game() {
		
	}

	private Game(Player player, Dealer dealer) {
		m_dealer = dealer;
		m_player = player;	
	}

	public Game makeNewGame(Player player, Dealer dealer) {
		return new Game(player, dealer);
	}

	public Dealer getDealer() {
		return m_dealer;
	}

	public Player getPlayer() {
		return m_player;
	}

	public boolean isGameOver() {
		return getDealer().isGameOver();
	}

	public boolean isDealerWinner() {
		return getDealer().isDealerWinner(getPlayer());
	}

	public boolean newGame() {
		return getDealer().newGame(getPlayer());
	}

	public boolean hit() {
		return getDealer().hit(getPlayer(), true);
	}

	public boolean stand() {
		return getDealer().stand(getPlayer());
	}

	public int getDealerScore() {
		return getDealer().calcScore();
	}
}
