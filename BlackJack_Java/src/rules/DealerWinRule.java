package rules;

import model.Player;

public class DealerWinRule {

	public boolean isDealerWinner(Player player, Player dealer) {
		return dealer.calcScore() >= player.calcScore();
	}

}
