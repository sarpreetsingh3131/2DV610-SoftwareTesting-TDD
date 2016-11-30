package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import model.CardTest;
import model.DealerTest;
import model.DeckTest;
import model.GameTest;
import model.PlayerTest;

@RunWith(Suite.class)
@SuiteClasses({ CardTest.class, DeckTest.class, PlayerTest.class, DealerTest.class, GameTest.class })
public class ModelSuit {

}
