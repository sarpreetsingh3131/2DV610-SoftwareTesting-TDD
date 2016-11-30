package model.rules;

import model.Dealer;
import model.Player;

public class AmericanNewGameRule {

	public boolean newGame(Dealer dealer, Player player) {
		dealer.hit(player, true);
		dealer.hit(dealer, true);
		dealer.hit(player, true);
		dealer.hit(dealer, true);
		return true;
	}
}
