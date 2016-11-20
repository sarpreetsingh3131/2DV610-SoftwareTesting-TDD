package rules;

import model.Player;

public class DealerWinRule {

	public boolean isDealerWinner(Player player, Player dealer) {
		return dealer.calcScore() >= player.calcScore();
	}

	public boolean isDealerWinner(Player mockDealer, int maxScore) {
		// TODO Auto-generated method stub
		return true;
	}

}
