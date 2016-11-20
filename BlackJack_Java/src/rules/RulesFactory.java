package rules;

public class RulesFactory {

	public BasicHitRule getHitRule() {
		return new BasicHitRule();
	}

	public DealerWinRule getWinRule() {
		return new DealerWinRule();
	}
}
