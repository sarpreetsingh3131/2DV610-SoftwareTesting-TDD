package model;

public class Game {

	private Dealer m_dealer;
	private Player m_player;
	
	public Game() {
		// TODO Auto-generated constructor stub
	}

	private Game(Player player, Dealer dealer) {
		m_dealer = dealer;
		m_player = player;	
	}

	public Game makeNewGame(Player player, Dealer dealer) {
		return new Game(player, dealer);
	}

	public Object getDealer() {
		// TODO Auto-generated method stub
		return m_dealer;
	}

}
