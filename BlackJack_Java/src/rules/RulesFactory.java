package rules;

public class RulesFactory {

	public BasicHitRule getHitRule() {
		return new BasicHitRule();
	}

	public DealerWinRule getWinRule() {
		return new DealerWinRule();
	}

	public Object getNewGameRule() {
		// TODO Auto-generated method stub
		return new AmericanNewGameRule();
	}
}
