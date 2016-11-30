package view;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import model.Card;
import model.Card.Color;
import model.Card.Value;

public class SimpleViewTest {

	PrintStream mockPrinter = mock(PrintStream.class);
	Card mockCard = mock(Card.class);
	SimpleView sut;
	SimpleView spy;


	@Before
	public void setUp() throws Exception {
		sut = new SimpleView(mockPrinter);
		spy = spy(sut);
		when(mockCard.getColor()).thenReturn(Color.Clubs);
		when(mockCard.getValue()).thenReturn(Value.Ace);
	}

	@Test
	public void shouldReturnPrinter() {
		assertNotNull(sut.getPrinter());
	}

	@Test
	public void shouldDisplayWelcomeMessage() {
		sut.displayWelcomeMessage();
		verify(mockPrinter, times(1)).println("Hello Black Jack World\nType 'p' to Play, 'h' to Hit, 's' to Stand, 'q' to Quit");
	}
	
	@Test
	public void shouldDisplayCardColorAndValue() {
		sut.displayCard(mockCard);	
		verify(mockPrinter, times(1)).println("Ace of Clubs");
	}
	
	@Test
	public void shouldDisplayPlayerHand() {
		ArrayList<Card> spyList = spy(new ArrayList<>());
		when(spyList.size()).thenReturn(5);
		doReturn(mockCard).when(spyList).get(any(Integer.class));
		int score = 19;
		sut.displayPlayerHand(spyList, score);

		verify(mockPrinter, times(1)).println("Player has: ");
		verify(mockPrinter, times(5)).println("Ace of Clubs");
		verify(mockPrinter, times(1)).println("Score: " + score + "\n");
	}
	
	@Test
	public void shouldDisplayDealerHand() {
		ArrayList<Card> spyList = spy(new ArrayList<>());
		when(spyList.size()).thenReturn(5);
		doReturn(mockCard).when(spyList).get(any(Integer.class));
		int score = 19;
		sut.displayDealerHand(spyList, score);

		verify(mockPrinter, times(1)).println("Dealer has: ");
		verify(mockPrinter, times(5)).println("Ace of Clubs");
		verify(mockPrinter, times(1)).println("Score: " + score + "\n");
	}

}