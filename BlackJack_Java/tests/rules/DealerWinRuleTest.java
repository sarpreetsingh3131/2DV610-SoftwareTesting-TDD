package rules;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import model.Player;

public class DealerWinRuleTest {

	DealerWinRule sut;
	Player mockPlayer;
	Player mockDealer;
	final int maxScore = 21;

	@Before
	public void setUp() throws Exception {
		sut = new DealerWinRule();
		mockPlayer = mock(Player.class);
		mockDealer = mock(Player.class);
	}

	@Test
	public void dealerShouldBeWinnerWhenScoresAreSame() {
		when(mockPlayer.calcScore()).thenReturn(21);
		when(mockDealer.calcScore()).thenReturn(21);
		assertTrue(sut.isDealerWinner(mockPlayer, mockDealer, maxScore));
	}

	@Test
	public void dealerShouldLooseWhenScoreIsAboveMax() {
		when(mockDealer.calcScore()).thenReturn(22);
		assertFalse(sut.isDealerWinner(mockPlayer, mockDealer, maxScore));
	}
	
	@Test
	public void dealerShouldWinWhenPlayerScoreIsAboveMax() {
		when(mockPlayer.calcScore()).thenReturn(22);
		assertTrue(sut.isDealerWinner(mockPlayer, mockDealer, maxScore));
	}
}