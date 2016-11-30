package rules;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.mockito.Mockito.*;
import model.Dealer;
import model.Player;

public class AmericanNewGameRuleTest {

	AmericanNewGameRule sut;

	@Test
	public void shouldReturnTrue() {
		sut = new AmericanNewGameRule();
		Player mockPlayer = mock(Player.class);
		Dealer mockDealer = mock(Dealer.class);

		assertTrue(sut.newGame(mockDealer, mockPlayer));
		verify(mockDealer, times(2)).hit(mockPlayer, true);
		verify(mockDealer, times(2)).hit(mockDealer, true);
	}
}
