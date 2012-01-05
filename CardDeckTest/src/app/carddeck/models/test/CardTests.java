package app.carddeck.models.test;

import app.carddeck.enums.CardRank;
import app.carddeck.enums.CardSuit;
import app.carddeck.models.Card;
import app.carddeck.models.Joker;
import app.carddeck.models.PlayingCard;
import android.test.AndroidTestCase;

public class CardTests extends AndroidTestCase
{
	public void testJoker_FaceDown_DisplaysBackOfCard()
	{
		//Arrange
		Card card = new Joker();
		card.setIsFaceUp(false);
		
		String expected = "[Back of Card]";
		
		//Act
		//nothing to do
		
		//Assert
		assertEquals(expected, card.Display());
	}
	
	public void testJoker_FaceUp_DisplaysFrontOfCardWithoutValue()
	{
		//Arrange
		Card card = new Joker();
		card.setIsFaceUp(true);
		
		String expected = "[Front of Card]";

		//Act
		//nothing to do
		
		//Assert
		assertEquals(expected, card.Display());
	}
	
	public void testJoker_AllJokersAreEqual()
	{
		//Arrange
		Card card1 = new Joker();
		Card card2 = new Joker();		
		
		//Act
		//nothing to do
		
		//Assert
		assertEquals(card1, card2);
	}
	
	public void testPlayingCard_FaceDown_DisplaysFrontOfCardWithoutValue()
	{
		//Arrange
		Card card = new PlayingCard(CardRank.Two, CardSuit.Hearts);
		card.setIsFaceUp(false);
		
		String expected = "[Back of Card]";

		//Act
		//nothing to do
		
		//Assert
		assertEquals(expected, card.Display());
	}
	
	public void testPlayingCard_FaceUp_DisplaysFrontOfCardWithoutValue()
	{
		//Arrange
		Card card = new PlayingCard(CardRank.Two, CardSuit.Hearts);
		card.setIsFaceUp(true);
		
		String expected = "Two of Hearts";

		//Act
		//nothing to do
		
		//Assert
		assertEquals(expected, card.Display());
	}

	public void testPlayingCard_EqualityBasedOnRankAndSuit()
	{
		//Arrange
		Card card1 = new PlayingCard(CardRank.Two, CardSuit.Hearts);
		Card card2 = new PlayingCard(CardRank.Two, CardSuit.Hearts);
		Card card3 = new PlayingCard(CardRank.Three, CardSuit.Hearts);
		
		//Act
		//nothing to do
		
		//Assert
		assertEquals(card1, card2);
		assertFalse(card1.equals(card3));
	}
}
