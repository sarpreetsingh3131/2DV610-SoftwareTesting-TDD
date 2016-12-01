package controller;

import java.io.InputStream;
import model.Game;
import view.SimpleView;

public class PlayGame {

	public boolean play(SimpleView view, Game game, InputStream input) {
		view.displayWelcomeMessage();

		view.displayDealerHand(game.getDealerHand(), game.getDealerScore());
		view.displayPlayerHand(game.getPlayerHand(), game.getPlayerScore());

		if (game.isGameOver()) {
			view.displayGameOver(game.isDealerWinner());
		}

		int in = view.getInput(input);

		if (in == 'p') {
			game.newGame();
		} else if (in == 'h') {
			game.hit();
		} else if (in == 's') {
			game.stand();
		}
		else if (in == 'q') {
			return false;
		}
		return true;
	}
}
