package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import model.Card.Color;
import model.Card.Value;

public class DeckTest {

	Card mockCard = mock(Card.class);
	Deck sut;

	@Before
	public void setUp() throws Exception {
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
		assertEquals(52, sut.getCards().size());
	}

	@Test
	public void shouldReturnAndRemoveFirstCardFromTheList() {
		assertNotNull(sut.getCard());
		assertEquals(51, sut.getCards().size());
	}
}