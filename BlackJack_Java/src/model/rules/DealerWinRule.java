package model.rules;

import model.Player;

public class DealerWinRule {

	public boolean isDealerWinner(Player a_player, Player a_dealer, int g_maxScore) {
		if (a_player.calcScore() > g_maxScore) {
			return true;
		} else if (a_dealer.calcScore() > g_maxScore) {
			return false;
		}
		return a_dealer.calcScore() >= a_player.calcScore();
	}

}
