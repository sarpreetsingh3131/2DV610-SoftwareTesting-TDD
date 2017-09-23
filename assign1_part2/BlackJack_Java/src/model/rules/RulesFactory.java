package model.rules;

public class RulesFactory {

	public BasicHitRule getHitRule() {
		return new BasicHitRule();
	}

	public DealerWinRule getWinRule() {
		return new DealerWinRule();
	}

	public AmericanNewGameRule getNewGameRule() {
		return new AmericanNewGameRule();
	}
}
