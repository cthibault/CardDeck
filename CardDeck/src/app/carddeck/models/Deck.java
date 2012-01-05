package app.carddeck.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import app.carddeck.enums.CardRank;
import app.carddeck.enums.CardSuit;

public class Deck
{
	//CONSTRUCTORS
	private Deck(boolean includeJokers)
	{
		List<Card> cards = new ArrayList<Card>();
		for (CardSuit suit : CardSuit.values())
		{
			for (CardRank rank : CardRank.values())
			{
				cards.add(new PlayingCard(rank, suit));
			}
		}
		
		if (includeJokers)
		{
			cards.add(new Joker());
			cards.add(new Joker());
		}
		
		this._cards = Collections.unmodifiableList(cards);
	}
	
	//PUBLIC PROPERTY METHODS
	public List<Card> getCards()
	{
		return this._cards;
	}
	
	//PUBLIC STATIC METHODS
	public static Deck CreateWithoutJokers()
	{
		return new Deck(false);
	}
	public static Deck CreateWithJokers()
	{
		return new Deck(true);
	}
	
	//PRIVATE FIELDS
	private List<Card> _cards;
}
