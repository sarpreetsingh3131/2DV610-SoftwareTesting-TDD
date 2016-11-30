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
	SimpleView spy;

	@Before
	public void setUp() throws Exception {
		sut = new SimpleView(mockPrinter);
		spy = spy(sut);
	}

	@Test
	public void shouldReturnPrinter() {
		assertNotNull(sut.getPrinter());
	}

	@Test
	public void shouldDisplayWelcomeMessage() {
		sut.displayWelcomeMessage();
		
		verify(mockPrinter, times(1)).println(WELCOME_MESSAGE);
	}
	
	@Test
	public void shouldDisplayCardColorAndValue() {
		Card mockCard = mock(Card.class);
		when(mockCard.getColor()).thenReturn(Color.Clubs);
		when(mockCard.getValue()).thenReturn(Value.Ace);
	
		sut.displayCard(mockCard);	
		verify(mockPrinter, times(1)).println("Ace of Clubs");
	}
}