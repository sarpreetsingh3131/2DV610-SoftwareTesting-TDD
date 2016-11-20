package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class DealerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldDealANewCardToPlayer() {
		Card mockCard = mock(Card.class);
		Player mockPlayer = mock(Player.class);
		Deck mockDeck = mock(Deck.class);
		Dealer sut = new Dealer(mockDeck);
		
		boolean isVisible = true;
		
		when(mockDeck.getCard()).thenReturn(mockCard);
		doNothing().when(mockCard).show(isVisible);
		doNothing().when(mockPlayer).dealCard(mockCard);
		
		sut.dealCardTo(mockPlayer, isVisible);
		
		verify(mockDeck, times(1)).getCard();
		verify(mockCard, times(1)).show(isVisible);
		verify(mockPlayer, times(1)).dealCard(mockCard);
	}
}
