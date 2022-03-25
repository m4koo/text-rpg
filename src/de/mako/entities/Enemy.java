package de.mako.entities;

public class Enemy
{
	int leben;
	int schaden;
	String name;
	String attname;
	int deathmoney;
	int looseh; //loose hunger
	int points;
	
	public Enemy (int uleben, int uschaden, String uname, String uattname, int udeathmoney, int ulooseh, int upoints)
	{
		leben = uleben;
		schaden = uschaden;
		name = uname;
		attname = uattname;
		deathmoney = udeathmoney;
		looseh = ulooseh;
		points = upoints;
	}
	

	public void setLeben(int newleben)
	{
		this.leben = newleben;
	}
	
	public int getLeben()
	{
		return this.leben;
	}
	
	public int getSchaden()
	{
		return this.schaden;
	}
	
	public boolean isDead()
	{
		if (this.getLeben() <= 0)
		{
			return true;
		}
		return false;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAttName()
	{
		return this.attname;
	}
	
	public int getMoney()
	{
		return this.deathmoney;
	}
	
	public int getLoosh()
	{
		return this.looseh;
	}
	
	public int getPoints()
	{
		return this.points;
	}
}
	

