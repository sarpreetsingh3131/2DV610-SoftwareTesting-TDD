package rules;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.mockito.Mockito.*;
import model.Dealer;
import model.Player;

public class AmericanNewGameRuleTest {

	@Test
	public void shouldReturnTrue() {
		AmericanNewGameRule sut = new AmericanNewGameRule();
		Player mockPlayer = mock(Player.class);
		Dealer mockDealer = mock(Dealer.class);

		boolean actual = sut.newGame(mockDealer, mockPlayer);
		assertTrue(actual);

		verify(mockDealer, times(2)).hit(mockPlayer, true);
		verify(mockDealer, times(2)).hit(mockDealer, true);
	}
}
