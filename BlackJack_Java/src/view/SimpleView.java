package view;

import java.io.PrintStream;

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
		getPrinter().println("Hello Black Jack World\nType " + "\'" + play + "\' to Play, " + "\'" + hit + "\' to Hit, " + "\'" + stand
				+ "\' to Stand, " + "\'" + quit + "\' to Quit");
	}
}
