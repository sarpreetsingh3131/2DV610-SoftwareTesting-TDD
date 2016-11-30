package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldCreateNewGameObject() {
		Game sut = new Game();
		Player mockPlayer = mock(Player.class);
		Dealer mockDealer = mock(Dealer.class);
		sut = sut.makeNewGame(mockPlayer, mockDealer);
	
		assertNotNull(sut);
	}

}
