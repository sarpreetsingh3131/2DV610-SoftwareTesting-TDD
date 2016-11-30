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
	}
}
