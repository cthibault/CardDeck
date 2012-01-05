package app.carddeck.models;

public class Joker extends Card
{
	//PUBLIC METHODS
	@Override
	public boolean equals(Object obj)
	{
		if (obj != null && obj.getClass().equals(Joker.class))
			return this.equals((Joker)obj);
		
		return false;
	}
	public boolean equals(Joker card)
	{
		return card == null ? false : true;
	}
}
