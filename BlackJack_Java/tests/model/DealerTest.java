package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class DealerTest {

	Dealer sut;
	Card mockCard;
	Player mockPlayer;
	Deck mockDeck;

	@Before
	public void setUp() throws Exception {
		mockCard = mock(Card.class);
		mockPlayer = mock(Player.class);
		mockDeck = mock(Deck.class);
		
		 sut = new Dealer(mockDeck);
	}

	@Test
	public void shouldDealANewCardToPlayer() {
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