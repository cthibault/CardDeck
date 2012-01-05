package app.carddeck.models.test;

import java.util.HashMap;
import java.util.Map;

import android.test.AndroidTestCase;
import app.carddeck.models.Card;
import app.carddeck.models.Deck;
import app.carddeck.models.Joker;
import app.carddeck.models.PlayingCard;

public class DeckTests extends AndroidTestCase
{
	public void testDeck_NewDeckWithoutJokers_FiftyTwoTotalAndFiftyTwoUnique()
	{
		//Arrange
		Deck deck = Deck.CreateWithoutJokers();
		int expectedTotalCount = 52;
		int expectedUniqueCount = 52;
		
		//Act
		Map<Card, Integer> cardDistribution = new HashMap<Card, Integer>();
		for (Card card : deck.getCards())
		{
			cardDistribution.put(card, cardDistribution.containsKey(card) ? cardDistribution.get(card) + 1 : 1);
		}
		
		//Assert
		assertEquals(expectedTotalCount, deck.getCards().size());
		assertEquals(expectedUniqueCount, cardDistribution.size());
	}
	
	public void testDeck_NewDeckWithJokers_FiftyFourTotalAndFiftyTwoUniqueWithTwoJokers()
	{
		//Arrange
		Deck deck = Deck.CreateWithJokers();
		Joker joker = new Joker();
		int expectedTotalCount = 54;
		int expectedUniqueCount = 52;
		int expectedJokerCount = 2;
		
		//Act
		Map<Card, Integer> cardDistribution = new HashMap<Card, Integer>();
		int jokerCount = 0;

		//TODO: The HashMap isn't recognizing the jokers as the same key.
		for (Card card : deck.getCards())
		{
			if (card.getClass().equals(Joker.class))
				jokerCount++;
			else
				cardDistribution.put(card, cardDistribution.containsKey(card) ? cardDistribution.get(card) + 1 : 1);
		}
				
		if (cardDistribution.containsKey(joker))
			jokerCount = cardDistribution.get(joker);
		
		//Assert
		assertEquals(expectedTotalCount, deck.getCards().size());
		assertEquals(expectedUniqueCount, cardDistribution.size());
		assertEquals(expectedJokerCount, jokerCount);
	}
}
