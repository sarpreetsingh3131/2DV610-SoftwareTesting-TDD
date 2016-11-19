package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Card.Color;
import model.Card.Value;

public class CardTest {

	Card sut;

	@Before
	public void setUp() throws Exception {
		sut = new Card();
		sut = sut.makeNewCard(Color.Hearts, Value.Two);
	}

	@Test
	public void shouldCreateANewCardAndReturnItWithHiddenColorAndValue() {
		assertEquals(Color.Hidden, sut.getColor());
		assertEquals(Value.Hidden, sut.getValue());
	}

	@Test
	public void shouldShowCardColorAndValueWhenShowIsTrue() {
		sut.show(true);

		assertEquals(Color.Hearts, sut.getColor());
		assertEquals(Value.Two, sut.getValue());
	}
}