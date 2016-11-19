package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.Card.Color;
import model.Card.Value;

public class DeckTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldCreateAndReturnANewDeck() {
		Card mockCard = mock(Card.class);
		when(mockCard.makeNewCard(any(Card.Color.class), any(Card.Value.class))).
		thenReturn(new Card().makeNewCard(any(Card.Color.class), any(Card.Value.class)));
		
		Deck sut = new Deck();
		sut = sut.makeNewDeck(mockCard);
		
		assertNotNull(sut);
		
		verify(mockCard, times(52)).makeNewCard(any(Color.class), any(Value.class));
		verify(mockCard, never()).makeNewCard(Color.Hidden, Value.Hidden);
	}
	
	@Test
	public void shouldReturnAListWith52Cards() {
		Card mockCard = mock(Card.class);
		when(mockCard.makeNewCard(any(Card.Color.class), any(Card.Value.class))).
		thenReturn(new Card().makeNewCard(any(Card.Color.class), any(Card.Value.class)));
		
		Deck sut = new Deck();
		sut = sut.makeNewDeck(mockCard);
	
		ArrayList<Card> list = sut.getCards();
		
		assertEquals(52, list.size());
	}
}