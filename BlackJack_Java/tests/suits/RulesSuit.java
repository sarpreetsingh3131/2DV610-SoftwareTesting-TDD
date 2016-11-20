package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import rules.BasicHitRuleTest;
import rules.DealerWinRuleTest;
import rules.RulesFactoryTest;

@RunWith(Suite.class)
@SuiteClasses({RulesFactoryTest.class, DealerWinRuleTest.class, BasicHitRuleTest.class})
public class RulesSuit {

}
