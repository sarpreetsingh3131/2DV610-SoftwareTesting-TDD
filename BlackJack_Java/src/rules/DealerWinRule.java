package rules;

import model.Player;

public class DealerWinRule {

	public boolean isDealerWinner(Player player, Player dealer) {
		return dealer.calcScore() >= player.calcScore();
	}

	public boolean isDealerWinner(Player dealer, int maxScore) {
		return dealer.calcScore() < maxScore;
	}

	public boolean isDealerWinner(Player a_player, Player a_dealer, int g_maxScore) {
		// TODO Auto-generated method stub
		return false;
	}

}
