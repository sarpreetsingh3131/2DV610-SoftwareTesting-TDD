package model;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PlayerTest {

	ArrayList<Card> mockedPlayerHand;
	Player sut;
	Card mockedCard;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		mockedPlayerHand = mock(ArrayList.class);

		sut = new Player();
		sut = sut.makeNewPalyer(mockedPlayerHand);

	}

	@Test
	public void shouldCreateAndReturnANewPlayer() {
		assertNotNull(sut);
	}

	@Test
	public void shouldAddCardInPlayerHandList() {
		sut.dealCard(mockedCard);
		
		verify(mockedPlayerHand, times(1)).add(mockedCard);
	}
}