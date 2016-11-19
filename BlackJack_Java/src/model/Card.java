package model;

public class Card {


	public enum Color {Hearts, Spades, Diamonds, Clubs, Hidden}
	public enum Value {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Knight, Queen, King, Ace, Hidden}
	
	
	
	public Card makeNewCard(Color a_color, Value a_value) {
		// TODO Auto-generated method stub
		return new Card();
	}


	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.Hidden;
	}


	public Value getValue() {
		// TODO Auto-generated method stub
		return Value.Hidden;
	}
}
