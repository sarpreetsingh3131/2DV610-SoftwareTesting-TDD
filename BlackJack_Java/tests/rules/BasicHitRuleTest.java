package rules;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import model.Player;

public class BasicHitRuleTest {

	BasicHitRule sut;

	@Before
	public void setUp() throws Exception {
		sut = new BasicHitRule();
	}

	@Test
	public void shouldHitBecauseScoreIsBelowLimit() {
		Player mockPlayer = mock(Player.class);
		when(mockPlayer.calcScore()).thenReturn(11);

		assertTrue(sut.doHit(mockPlayer));
	}
}