package view;

import java.io.PrintStream;
import java.util.ArrayList;

import model.Card;

public class SimpleView {

	private PrintStream printer;
	private final char play = 'p';
	private final char hit = 'h';
	private final char stand = 's';
	private final char quit = 'q';

	public SimpleView(PrintStream printer) {
		this.printer = printer;
	}

	public PrintStream getPrinter() {
		return printer;
	}

	public void displayWelcomeMessage() {
		getPrinter().println("Hello Black Jack World\nType " + "\'" + play + "\' to Play, " + "\'" + hit + "\' to Hit, "
				+ "\'" + stand + "\' to Stand, " + "\'" + quit + "\' to Quit");
	}

	public void displayCard(Card card) {
		printer.println(card.getValue() + " of " + card.getColor());
	}

	public void displayPlayerHand(ArrayList<Card> spyList, int score) {
		printer.println("Player has: ");
		for (int i = 0; i < spyList.size(); i++) {
			displayCard(spyList.get(i));
		}
		printer.println("Score: " + score + "\n");
	}

	public void displayDealerHand(ArrayList<Card> spyList, int score) {
		// TODO Auto-generated method stub
		
	}
}
