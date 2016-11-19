package model;

public class Card {


	public enum Color {Hearts, Spades, Diamonds, Clubs, Hidden}
	public enum Value {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Knight, Queen, King, Ace, Hidden}
	
	private Color m_color;
	private Value m_value;
	
	public Card() {
		
	}
	
	public Card makeNewCard(Color a_color, Value a_value) {
		return new Card(a_color, a_value);
	}

	public Color getColor() {
		return Color.Hidden;
	}

	public Value getValue() {
		return Value.Hidden;
	}
	
	private Card(Color a_color, Value a_value){
		m_color = a_color;
		m_value = a_value;
	}
}