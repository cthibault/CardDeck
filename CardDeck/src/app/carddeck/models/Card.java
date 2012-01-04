package app.carddeck.models;

public abstract class Card
{
	protected Card()
	{
		this.setIsFaceUp(true);
	}
	
	//PUBLIC PROPERTY METHODS
	public boolean getIsFaceUp()
	{
		return this._isFaceUp;
	}
	public void setIsFaceUp(boolean value)
	{
		this._isFaceUp = value;
	}
	
	//PUBLIC METHODS
	public String Display()
	{
		return this.getIsFaceUp() ? "[Front of Card]" : "[Back of Card]";
	}
	
	
	//PRIVATE FIELDS
	private boolean _isFaceUp = false;
}
