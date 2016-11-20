package rules;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RulesFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldReturnAHitRule() {
		RulesFactory sut = new RulesFactory();
		assertNotNull(sut.getHitRule());
	}

}
