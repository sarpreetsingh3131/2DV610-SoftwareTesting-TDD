package main;

import java.util.ArrayList;
import controller.PlayGame;
import model.*;
import model.rules.RulesFactory;
import view.SimpleView;

public class Main {

	public static void main(String[] args) {
		Player player = new Player().makeNewPalyer(new ArrayList<Card>());
		Deck deck = new Deck().makeNewDeck(new Card());
		Dealer dealer = new Dealer(deck, new RulesFactory());
		dealer.setDealerList(new ArrayList<Card>());
		
		Game game = new Game().makeNewGame(player, dealer);
		PlayGame ctr = new PlayGame();
		
		while(ctr.play(new SimpleView(System.out), game, System.in));
	}
}