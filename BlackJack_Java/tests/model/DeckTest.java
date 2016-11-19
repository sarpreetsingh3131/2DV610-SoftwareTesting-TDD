package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;


import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.Card.Color;
import model.Card.Value;

public class DeckTest {

	Card mockCard;
	Deck sut;

	@Before
	public void setUp() throws Exception {
		mockCard = mock(Card.class);

		when(mockCard.makeNewCard(any(Card.Color.class), any(Card.Value.class)))
				.thenReturn(new Card().makeNewCard(any(Card.Color.class), any(Card.Value.class)));

		sut = new Deck();
		sut = sut.makeNewDeck(mockCard);
	}

	@Test
	public void shouldCreateAndReturnANewDeck() {
		assertNotNull(sut);

		verify(mockCard, times(52)).makeNewCard(any(Color.class), any(Value.class));
		verify(mockCard, never()).makeNewCard(Color.Hidden, Value.Hidden);
	}

	@Test
	public void shouldReturnAListWith52Cards() {
		ArrayList<Card> list = sut.getCards();

		assertEquals(52, list.size());
	}
	
	@Test
	public void shouldReturnAndRemoveFirstCardFromTheList() {
		Card c = sut.getCard();
		
		assertNotNull(c);
		assertEquals(51, sut.getCards().size());
	}
}