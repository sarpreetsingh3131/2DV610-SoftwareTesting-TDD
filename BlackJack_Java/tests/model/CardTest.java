package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Card.Color;
import model.Card.Value;

public class CardTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldCreateANewCardAndReturnItWithHiddenColorAndValue() {
		Card sut = new Card();
		sut = sut.makeNewCard(Color.Hearts, Value.Two);
		
		assertEquals(Color.Hidden, sut.getColor());
		assertEquals(Value.Hidden, sut.getValue());
	}

}
