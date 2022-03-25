package de.mako.entities;

import de.mako.main.Main;

public class Golem extends Enemy
{
	static String an = "Erdbeben";
	static String name = "Golem";
	
	public Golem() 
	{
		
		super(100, calcDmg(), name, an, 100, 100, 1000);
		
	}
	
	private static int calcDmg()
	{
		int dmg;
		
		dmg = Main.getRandom(30,50);	
			
		return dmg;
	}
	
}
