package de.mako.entities;

import de.mako.main.Main;

public class Minotaurus extends Enemy
{
	static String an = "Axt schwinger";
	static String name = "Minotaurus";	
	
	public Minotaurus() 
	{
		
		super(35, calcDmg(), name, an, 25, 8, 50);
		
	}

	private static int calcDmg()
	{
		int dmg;
		
		dmg = Main.getRandom(7, 25);	
			
		return dmg;
	}
	
}

