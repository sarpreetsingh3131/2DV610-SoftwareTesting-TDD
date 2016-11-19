package model;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.Card.Value;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PlayerTest {

	ArrayList<Card> mockedPlayerHand;
	Card mockedCard;
	Player sut;
	

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		sut = new Player();
		mockedPlayerHand = mock(ArrayList.class);
		mockedCard = mock(Card.class);
		
		when(mockedPlayerHand.size()).thenReturn(10);
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
	
	@Test
	public void shouldUnhideTheCardsInTheList() {
		when(mockedPlayerHand.get(any(Integer.class))).thenReturn(mockedCard);
		when(mockedCard.getValue()).thenReturn(Value.Hidden);
		doNothing().when(mockedCard).show(true);
		
		sut.showHand();
		
		verify(mockedCard, times(10)).getValue();
		verify(mockedCard, times(10)).show(true);
		
	}
	
	private void addThisCardTenTimesToPlayerHand(Card card) {
		for (int i = 0; i < 10; i++) {
			sut.dealCard(card);
		}
	}
}