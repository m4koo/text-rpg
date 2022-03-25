package de.mako.entities;

import de.mako.main.Main;

public class Zombie extends Enemy
{
	static String an = "Gehirnfreyzer";
	static String name = "Zombie";
	
	public Zombie() 
	{
		
		super(25, calcDmg(), name, an, 10, 5, 25);
		
	}
	
	private static int calcDmg()
	{
		int dmg;
		
		dmg = Main.getRandom(1,15);	
			
		return dmg;
	}
	
}

