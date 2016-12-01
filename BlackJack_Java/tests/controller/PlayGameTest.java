package controller;

import org.junit.Test;
import model.Game;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import view.SimpleView;

public class PlayGameTest {

	@Test
	public void shouldReturnTrueAndDisplayWelcomeMessageDealerAndPlayerHand() {
		PlayGame sut = new PlayGame();
		SimpleView mockView = mock(SimpleView.class);
		Game mockGame = mock(Game.class);

		assertTrue(sut.play(mockView, mockGame));
		verify(mockView, times(1)).displayWelcomeMessage();
		verify(mockView, times(1)).displayDealerHand(mockGame.getDealerHand(), mockGame.getDealerScore());
		verify(mockView, times(1)).displayPlayerHand(mockGame.getPlayerHand(), mockGame.getPlayerScore());
	}
}