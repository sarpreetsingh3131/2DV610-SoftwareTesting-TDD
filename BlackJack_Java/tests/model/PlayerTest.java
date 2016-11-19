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
		addThisCardTenTimesToPlayerHand(mockedCard);
		verify(mockedPlayerHand, times(10)).add(mockedCard);
	}

	@Test
	public void shouldClearPlayerHandList() {
		addThisCardTenTimesToPlayerHand(mockedCard);
		sut.clearHand();
		verify(mockedPlayerHand, times(1)).clear();
	}
	
	@Test
	public void shouldReturnAListWith10Cards() {
		addThisCardTenTimesToPlayerHand(mockedCard);
		ArrayList<Card> list = sut.getPlayerHand();
		assertEquals(10, list.size());
	}
	

	private void addThisCardTenTimesToPlayerHand(Card card) {
		for (int i = 0; i < 10; i++) {
			sut.dealCard(card);
		}
	}
}