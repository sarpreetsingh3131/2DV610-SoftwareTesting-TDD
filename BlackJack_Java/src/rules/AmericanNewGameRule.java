package rules;

import model.Dealer;
import model.Player;

public class AmericanNewGameRule {

	public boolean newGame(Dealer dealer, Player player) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			dealer.hit(player, true);
			dealer.hit(dealer, true);
		}
		return true;
	}

}
