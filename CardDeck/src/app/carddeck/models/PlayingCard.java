package app.carddeck.models;

import app.carddeck.enums.CardRank;
import app.carddeck.enums.CardSuit;

public class PlayingCard extends Card
{
	//CONSTRUCTORS
	public PlayingCard(CardRank rank, CardSuit suit)
	{
		this.setRank(rank);
		this.setSuit(suit);
	}
	
	//PUBLIC PROPERTY METHODS
	public CardRank getRank()
	{
		return this._rank;
	}
	public CardSuit getSuit()
	{
		return this._suit;
	}
	
	//PRIVATE PROPERTY METHODS
	private void setRank(CardRank value)
	{
		this._rank = value;
	}
	private void setSuit(CardSuit value)
	{
		this._suit = value;
	}
	
	//PUBLIC METHODS
	public String Display()
	{
		return this.getIsFaceUp() ? this.toString() : super.Display();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s of %s", this.getRank().toString(), this.getSuit().toString());
	}
	@Override
	public boolean equals(Object obj)
	{
		if (obj != null && obj.getClass().equals(PlayingCard.class))
			return this.equals((PlayingCard)obj);
		
		return false;
	}
	public boolean equals(PlayingCard card)
	{
		if (card == null)
			return false;
		
		return this.getRank() == card.getRank() &&
			   this.getSuit() == card.getSuit();
	}
	
	//PRIVATE FIELDS
	private CardRank _rank;
	private CardSuit _suit;
}
