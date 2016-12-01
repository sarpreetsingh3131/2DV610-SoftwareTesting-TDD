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
		verify(mockPrinter, times(1))
				.println("Hello Black Jack World\nType 'p' to Play, 'h' to Hit, 's' to Stand, 'q' to Quit");
	}

	@Test
	public void shouldDisplayCardColorAndValue() {
		sut.displayCard(mockCard);
		verify(mockPrinter, times(1)).println("Ace of Clubs");
	}

	@Test
	public void shouldDisplayPlayerHand() {
		int score = 17;
		sut.displayPlayerHand(createSpyList(), score);
		shouldCallAllMethods("Player", score);
	}

	@Test
	public void shouldDisplayDealerHand() {
		int score = 21;
		sut.displayDealerHand(createSpyList(), score);
		shouldCallAllMethods("Dealer", score);
	}
	
	@Test
	public void shouldDisplayGameOverAndDealerWon() {
		sut.displayGameOver(true);
	
		verify(mockPrinter, times(1)).println("Game Over");
		verify(mockPrinter, times(1)).println("Dealer Won!");
	}
	
	@Test
	public void shouldDisplayGameOverAndPlayerWon() {
		sut.displayGameOver(false);
	
		verify(mockPrinter, times(1)).println("Game Over");
		verify(mockPrinter, times(1)).println("Player Won!");
	}

	private ArrayList<Card> createSpyList() {
		ArrayList<Card> spyList = spy(new ArrayList<>());
		when(spyList.size()).thenReturn(5);
		doReturn(mockCard).when(spyList).get(any(Integer.class));
		return spyList;
	}
	
	private void shouldCallAllMethods(String name, int score){
		verify(mockPrinter, times(1)).println(name + " has: ");
		verify(mockPrinter, times(5)).println("Ace of Clubs");
		verify(mockPrinter, times(1)).println("Score: " + score + "\n");
	}
}