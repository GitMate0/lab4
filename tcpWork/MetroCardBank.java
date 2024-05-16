package tcpWork;

import java.util.ArrayList;

public class MetroCardBank
{
	ArrayList<MetroCard> store;

	public MetroCardBank()
	{
		this.store = new ArrayList<>();
	}

	public MetroCard getCard(int index)
	{
		return store.get(index);
	}

	public void setCard(int index, MetroCard card)
	{
		store.set(index, card);
	}

	public void addCard(MetroCard newCard)
	{
		this.store.add(newCard);
	}

	public boolean removeCard(String serNum)
	{
		int index = findMetroCard(serNum);
		if (index != -1)
		{
			store.remove(index);
			return true;
		}
		return false;
	}

	public int findMetroCard(String serNum)
	{
		int index = -1;
		int len = numCards();
		MetroCard mc;

		for (int i = 0; i < len; i++)
		{
			mc = getCard(i);
			if (mc.getSerNum().equals(serNum))
			{
				index = i;
				break;
			}
		}
		return index;
	}

	public int numCards()
	{
		return this.store.size();
	}

	public boolean addMoney(String serNum, double money)
	{
		int index = findMetroCard(serNum);
		MetroCard mc;

		if (index != -1)
		{
			mc = getCard(index);
			mc.setMoney(mc.getMoney() + money);
			return true;
		}
		return false;
	}

	public boolean getMoney(String serNum, double money)
	{
		int index = findMetroCard(serNum);
		MetroCard mc;

		if (index != -1)
		{
			mc = getCard(index);
			mc.setMoney(mc.getMoney() - money);
			return true;
		}
		return false;
	}

	@Override
	public String toString()
	{
		StringBuilder buf = new StringBuilder("List of MetroCards:");

		for (MetroCard c : store)
		{
			buf.append("\n\n" + c);
		}
		
		return buf.toString();
	}
}