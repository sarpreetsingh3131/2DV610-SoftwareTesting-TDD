package view;

import java.io.PrintStream;

public class SimpleView {

	private PrintStream printer;

	public SimpleView(PrintStream printer) {
		this.printer = printer;
	}

	public PrintStream getPrinter() {
		return printer;
	}

	public void displayWelcomeMessage() {
		// TODO Auto-generated method stub
		printer.println("Hello Black Jack World\nType 'p' to Play, 'h' to Hit, 's' to Stand, 'q' to Quit");
	}
}
