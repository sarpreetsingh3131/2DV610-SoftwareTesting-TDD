package model;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PlayerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldCreateAndReturnANewPlayer() {
		ArrayList<Card> mockedPlayerHand = mock(ArrayList.class);
		
		Player sut = new Player();
		sut = sut.makeNewPalyer(mockedPlayerHand);
		
		assertNotNull(sut);
	}

}
