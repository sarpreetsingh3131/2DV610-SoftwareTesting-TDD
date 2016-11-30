package view;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.Card;
import model.Card.Color;
import model.Card.Value;

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
	
	@Test
	public void shouldDisplayPlayerHand() {
		Card mockCard = mock(Card.class);
		when(mockCard.getColor()).thenReturn(Color.Clubs);
		when(mockCard.getValue()).thenReturn(Value.Ace);
		
		ArrayList<Card> spyList = spy(new ArrayList<>());
		when(spyList.size()).thenReturn(5);
		doReturn(mockCard).when(spyList).get(any(Integer.class));
		int score = 19;
		sut.displayPlayerHand(spyList, score);

		verify(mockPrinter, times(1)).println("Player has: ");
		verify(mockPrinter, times(5)).println("Ace of Clubs");
		verify(mockPrinter, times(1)).println("Score: " + score + "\n");
	}

}