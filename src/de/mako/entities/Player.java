package de.mako.entities;

import de.mako.main.Difficulty;

public class Player 
{

	String n;
	private int leben;
	private int geld;
	private int hunger;
	private int maxhunger;
	private int dmg;
	Difficulty diff;
	private int points;
	
	
	public Player(int uleben, int ugeld, int uhunger,int umaxhunger, String uname, Difficulty udiff)
	{
		leben = uleben;
		geld = ugeld;
		hunger = uhunger;
		n = uname;
		maxhunger = umaxhunger;
		diff = udiff;
		this.dmg = 15;
	}
	
	public String getName()
	{
		return n;
	}
	
	public void setLeben(int newleben)
	{
		this.leben = newleben;
	}
	
	public void setGeld(int newgeld)
	{
		this.geld = newgeld;
	}
	
	public void setHunger(int newhunger)
	{
		this.hunger = newhunger;
	}
	
	public void setPoints(int newpoints)
	{
		this.points = newpoints;
	}
	
	public int getLeben()
	{
		return this.leben;
	}
	
	public int getGeld()
	{
		return this.geld;
	}
	
	public int getHunger()
	{
		return this.hunger;
	}
	
	private int getMaxHunger()
	{
		return this.maxhunger;
	}
	
	public void showStats()
	{
		String stat = "Stats von: " + this.getName() + "\n\nLeben: " + this.getLeben() + "\nGeld: " + this.getGeld() + "\nHunger: " + this.getHunger() + "/" + this.getMaxHunger() + "\nPunkte: " + this.getPoints();                  
		System.out.println(stat);
	}
	
	public Difficulty getDiff()
	{
		return this.diff;
	}
	
	public int getDmg()
	{
		return this.dmg;
	}
	
	public boolean isDead()
	{
		if (this.getLeben() <= 0)
		{
			return true;
		}
		return false;
	}
	
	public int getPoints()
	{
		return this.points;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
