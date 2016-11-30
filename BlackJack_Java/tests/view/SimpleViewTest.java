package view;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

public class SimpleViewTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void shouldReturnPrinter() {
		PrintStream mockPrinter = mock(PrintStream.class);
		SimpleView sut = new SimpleView(mockPrinter);

		assertNotNull(sut.getPrinter());
	}

	@Test
	public void shouldDisplayWelcomeMessage() {
		PrintStream mockPrinter = mock(PrintStream.class);
		SimpleView sut = new SimpleView(mockPrinter);

		SimpleView spy = spy(sut);
		when(spy.getPrinter()).thenReturn(mockPrinter);

		sut.displayWelcomeMessage();

		verify(mockPrinter, times(1)).println("Hello Black Jack World\nType 'p' to Play, 'h' to Hit, 's' to Stand, 'q' to Quit");
	}
}