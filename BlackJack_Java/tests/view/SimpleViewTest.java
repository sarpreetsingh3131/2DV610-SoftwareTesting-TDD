package view;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.io.PrintStream;
import model.*;
import model.Card.Color;
import model.Card.Value;

import org.junit.Before;
import org.junit.Test;

public class SimpleViewTest {

	final String WELCOME_MESSAGE = "Hello Black Jack World\nType 'p' to Play, 'h' to Hit, 's' to Stand, 'q' to Quit";
	PrintStream mockPrinter = mock(PrintStream.class);
	SimpleView sut;

	@Before
	public void setUp() throws Exception {
		sut = new SimpleView(mockPrinter);
	}

	@Test
	public void shouldReturnPrinter() {
		assertNotNull(sut.getPrinter());
	}

	@Test
	public void shouldDisplayWelcomeMessage() {
		SimpleView spy = spy(sut);
		when(spy.getPrinter()).thenReturn(mockPrinter);
		sut.displayWelcomeMessage();
		
		verify(mockPrinter, times(1)).println(WELCOME_MESSAGE);
	}
	
	@Test
	public void shouldDisplayCardColorAndValue() {
		Card mockCard = mock(Card.class);
		when(mockCard.getColor()).thenReturn(Color.Clubs);
		when(mockCard.getValue()).thenReturn(Value.Ace);
		SimpleView spy = spy(sut);
		when(spy.getPrinter()).thenReturn(mockPrinter);
		
		sut.displayCard(mockCard);
		
		verify(mockPrinter, times(1)).println("Ace of Clubs");
	}
}