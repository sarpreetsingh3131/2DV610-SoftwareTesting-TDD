package rules;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import model.Player;

public class BasicHitRuleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldHitBecauseScoreIsBelowLimit() {
		Player mockPlayer = mock(Player.class);
		when(mockPlayer.calcScore()).thenReturn(11);
		
		BasicHitRule sut = new BasicHitRule();
		boolean actual = sut.doHit(mockPlayer);

		assertTrue(actual);
	}
}
