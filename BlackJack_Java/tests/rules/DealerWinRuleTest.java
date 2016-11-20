package rules;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import model.Player;

public class DealerWinRuleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void dealerShouldBeWinnerWhenScoresAreSame() {
		Player mockPlayer = mock(Player.class);
		Player mockDealer = mock(Player.class);
		
		when(mockPlayer.calcScore()).thenReturn(21);
		when(mockDealer.calcScore()).thenReturn(21);
	
		final int maxScore = 21;
		
		DealerWinRule sut = new DealerWinRule();
		boolean actual = sut.isDealerWinner(mockPlayer, mockDealer, maxScore);
		
		assertTrue(actual);
		
	}

}
