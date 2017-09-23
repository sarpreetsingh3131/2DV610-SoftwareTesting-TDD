package rules;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.rules.AmericanNewGameRule;
import model.rules.BasicHitRule;
import model.rules.DealerWinRule;
import model.rules.RulesFactory;

public class RulesFactoryTest {

	RulesFactory sut;

	@Before
	public void setUp() throws Exception {
		sut = new RulesFactory();
	}

	@Test
	public void shouldReturnAHitRule() {
		BasicHitRule hitRule = sut.getHitRule(); 
		assertNotNull(hitRule);
	}

	@Test
	public void shouldReturnAWinRule() {
		DealerWinRule winRule = sut.getWinRule();
		assertNotNull(winRule);
	}
	
	@Test
	public void shouldReturnANewGameRule() {
		AmericanNewGameRule newGameRule = sut.getNewGameRule();
		assertNotNull(newGameRule);
	}
}