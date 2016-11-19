package model;

public class Card {


	public enum Color {Hearts, Spades, Diamonds, Clubs, Hidden}
	public enum Value {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Knight, Queen, King, Ace, Hidden}
	
	private Color m_color;
	private Value m_value;
	private boolean m_isHidden = true;
	
	
	public Card() {
		
	}
	
	public Card makeNewCard(Color a_color, Value a_value) {
		return new Card(a_color, a_value);
	}

	public Color getColor() {
		if(m_isHidden){
		return Color.Hidden;
		}
		return m_color;
	}

	public Value getValue() {
		if(m_isHidden){
		return Value.Hidden;
		}
		return m_value;
	}
	
	public void show(boolean a_show) {
		// TODO Auto-generated method stub
		m_isHidden = false;
	}
	
	private Card(Color a_color, Value a_value){
		m_color = a_color;
		m_value = a_value;
	}
}