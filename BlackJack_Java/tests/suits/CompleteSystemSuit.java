package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import controller.PlayGameTest;
import view.SimpleViewTest;

@RunWith(Suite.class)
@SuiteClasses({ ModelSuit.class, RulesSuit.class, SimpleViewTest.class, PlayGameTest.class})
public class CompleteSystemSuit {

}
