package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import rules.BasicHitRule;
import rules.DealerWinRule;
import rules.RulesFactory;

public class DealerTest {

	Dealer sut;
	Card mockCard;
	Player mockPlayer;
	Deck mockDeck;
	final int maxScore = 21;
	RulesFactory mockFactory;
	DealerWinRule mockWinRule;
	BasicHitRule mockHitRule;

	@Before
	public void setUp() throws Exception {
		mockCard = mock(Card.class);
		mockPlayer = mock(Player.class);
		mockDeck = mock(Deck.class);
		mockFactory = mock(RulesFactory.class);
		mockWinRule = mock(DealerWinRule.class);
		mockHitRule = mock(BasicHitRule.class);

		when(mockFactory.getWinRule()).thenReturn(mockWinRule);
		when(mockFactory.getHitRule()).thenReturn(mockHitRule);

		sut = new Dealer(mockDeck, mockFactory);
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

	@Test
	public void dealerShouldBeTheWinner() {
		when(mockWinRule.isDealerWinner(mockPlayer, sut, maxScore)).thenReturn(true);

		assertTrue(sut.isDealerWinner(mockPlayer));
		verify(mockWinRule, times(1)).isDealerWinner(mockPlayer, sut, maxScore);
	}

	@Test
	public void gameShouldBeOver() {
		when(mockHitRule.doHit(sut)).thenReturn(false);

		assertTrue(sut.isGameOver());
		verify(mockHitRule, times(1)).doHit(sut);
	}
}