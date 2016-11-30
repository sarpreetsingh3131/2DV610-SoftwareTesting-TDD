package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

	Game sut;
	Player mockPlayer = mock(Player.class);
	Dealer mockDealer = mock(Dealer.class);

	@Before
	public void setUp() throws Exception {
		sut = new Game();
	}

	@Test
	public void shouldCreateNewGameObject() {
		sut = sut.makeNewGame(mockPlayer, mockDealer);
		assertNotNull(sut);
	}
	
	@Test
	public void shouldReturnDealer() {
		sut = sut.makeNewGame(mockPlayer, mockDealer);
		assertNotNull(sut.getDealer());
	}
}
