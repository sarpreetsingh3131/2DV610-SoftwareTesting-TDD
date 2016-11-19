package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Card.Color;
import model.Card.Value;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class DeckTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldCreateAndReturnANewDeck() {
		Card mockCard = mock(Card.class);
		
		doReturn(mockCard.makeNewCard(any(Card.Color.class), any(Card.Value.class))).
		when(mockCard).makeNewCard(any(Card.Color.class), any(Card.Value.class));
		
		Deck sut = new Deck();
		sut = sut.makeNewDeck(mockCard);
		
		assertNotNull(sut);
	
		verify(mockCard, atLeast(52)).makeNewCard(any(Color.class), any(Value.class));
		verify(mockCard, never()).makeNewCard(Color.Hidden, Value.Hidden);
	}
}