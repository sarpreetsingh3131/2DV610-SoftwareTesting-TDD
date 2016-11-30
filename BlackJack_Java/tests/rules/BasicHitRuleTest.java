package rules;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import model.Player;
import model.rules.BasicHitRule;

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