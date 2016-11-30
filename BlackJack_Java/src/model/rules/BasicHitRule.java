package model.rules;

import model.Player;

public class BasicHitRule {

	private final int g_hitLimit = 17;

	public boolean doHit(Player a_dealer) {
		return a_dealer.calcScore() < g_hitLimit;
	}

}
