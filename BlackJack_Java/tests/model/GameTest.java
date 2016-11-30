package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

	Game sut;
	Player mockPlayer = mock(Player.class);
	Dealer mockDealer = mock(Dealer.class);
	Game spy;

	@Before
	public void setUp() throws Exception {
		sut = new Game();
		sut = sut.makeNewGame(mockPlayer, mockDealer);
		
		spy = spy(sut);
		when(spy.getDealer()).thenReturn(mockDealer);
	}

	@Test
	public void shouldCreateNewGameObject() {
		assertNotNull(sut);
	}

	@Test
	public void shouldReturnDealer() {
		assertNotNull(sut.getDealer());
	}

	@Test
	public void shouldReturnPlayer() {
		assertNotNull(sut.getPlayer());
	}
	
	@Test
	public void shouldReturnFalseBecauseGameIsOver() {
		Game spy = spy(sut);
		when(spy.getDealer()).thenReturn(mockDealer);
		when(mockDealer.isGameOver()).thenReturn(false);
		
		assertFalse(sut.isGameOver());
		verify(mockDealer, times(1)).isGameOver();
	}
	
	@Test
	public void shouldReturnTrueBecauseDealerIsWinner() {
		when(mockDealer.isDealerWinner(mockPlayer)).thenReturn(true);
		
		assertTrue(sut.isDealerWinner());
		verify(mockDealer, times(1)).isDealerWinner(mockPlayer);
	}
	
	@Test
	public void shouldReturnTrueBecauseNewGameHasStarted() {
		when(mockDealer.newGame(mockPlayer)).thenReturn(true);
		
		assertTrue(sut.newGame());
		verify(mockDealer, times(1)).newGame(mockPlayer);
	}
	
	@Test
	public void shouldReturnTrueBecauseDealerCanHit() {
		when(mockDealer.hit(mockPlayer, true)).thenReturn(true);
		
		assertTrue(sut.hit());
		verify(mockDealer, times(1)).hit(mockPlayer, true);
	}
}