package controller;

import model.Game;
import view.SimpleView;

public class PlayGame {

	public boolean play(SimpleView view, Game game) {
		// TODO Auto-generated method stub
		view.displayWelcomeMessage();
		view.displayDealerHand(game.getDealerHand(), game.getDealerScore());
		view.displayPlayerHand(game.getPlayerHand(), game.getPlayerScore());
		return true;
	}
}
