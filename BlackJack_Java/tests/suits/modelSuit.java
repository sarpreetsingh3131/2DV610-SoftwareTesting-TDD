package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import model.CardTest;
import model.DeckTest;
import model.PlayerTest;

@RunWith(Suite.class)
@SuiteClasses({ CardTest.class, DeckTest.class, PlayerTest.class })
public class modelSuit {

}
