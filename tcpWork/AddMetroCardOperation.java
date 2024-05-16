package tcpWork;

public class AddMetroCardOperation extends CardOperation
{
	private MetroCard card = null;

	public AddMetroCardOperation()
	{
		card = new MetroCard();
	}

	public MetroCard getCard()
	{
		return card;
	}
}