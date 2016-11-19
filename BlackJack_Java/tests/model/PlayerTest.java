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
		when(mockedPlayerHand.size()).thenReturn(10);
		
		sut = new Player();
		sut = sut.makeNewPalyer(mockedPlayerHand);
		
		addThisCardTenTimesToPlayerHand(mockedCard);
	}

	@Test
	public void shouldCreateAndReturnANewPlayer() {
		assertNotNull(sut);
	}

	@Test
	public void shouldAddCardInPlayerHandList() {
		verify(mockedPlayerHand, times(10)).add(mockedCard);
	}

	@Test
	public void shouldClearPlayerHandList() {
		sut.clearHand();
		verify(mockedPlayerHand, times(1)).clear();
	}
	
	@Test
	public void shouldReturnAListWith10Cards() {
		assertEquals(10, sut.getPlayerHand().size());
	}
	
	private void addThisCardTenTimesToPlayerHand(Card card) {
		for (int i = 0; i < 10; i++) {
			sut.dealCard(card);
		}
	}
}