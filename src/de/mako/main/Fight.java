package de.mako.main;

import de.mako.entities.Enemy;
import de.mako.entities.Golem;
import de.mako.entities.Minotaurus;
import de.mako.entities.Player;
import de.mako.entities.Zombie;

public class Fight {

	Difficulty d;
	Player p;
	Enemy e;
	

	public Fight (Difficulty ud, Player up)	
	{
		this.d = ud;
		this.p = up;
		this.calcEnemy();
	}
	
	private Difficulty getDiff ()
	{
		return this.d;
	}
	
	public Player getPlayer ()
	{
		return this.p;
	}
	
	public Enemy getEnemy ()
	{
		return this.e;
	}
	
	private void calcEnemy()
	{
			
		if (p.getPoints() == 100) {  //First Stage Boss | für weitere Bosse -> kopieren nur mit anderer Punktzahl
			this.e = new Golem();
		}
		
		else {
			
			if (this.d == Difficulty.EASY)
			{
				int w = Main.getRandom(1, 10);
			
				
				if (w < 10)
				{
					this.e = new Zombie();
				}
		
				else
				{
					this.e = new Minotaurus();
				}
				
				return;
			}	
		
			if (this.d == Difficulty.MEDIUM)
			{
				int w = Main.getRandom(1, 10);
		
				
				if (w < 7)
				{
					this.e = new Zombie();
				}
			
				else
				{
					this.e = new Minotaurus();
				}
				return;
			}
		
			if (this.d == Difficulty.HARD)
			{
				int w = Main.getRandom(1, 10);
				
				
				if (w < 4)
				{
					this.e = new Zombie();
				}
				
				else
				{
					this.e = new Minotaurus();
				}
				return;
			}
		}
		
	}
	
	
	public void start () 
	{
		System.out.println("Du kämpfst gegen: " +  e.getName() + " mit seiner besonderen Fähigkeit: " + e.getAttName());
				
		int s = Main.getRandom(1,2);
		if (s == 1)
		{
			while (true)
			{
				e.setLeben(e.getLeben() - p.getDmg());
				
				if (e.isDead())
				{
					System.out.println("\nDu hast " + e.getName() + " getötet\n");
					break;
				}
			
				pAttack(p.getDmg());  
			
				Main.sleep(2000);
			
				p.setLeben(p.getLeben() - e.getSchaden());
			
				if (p.isDead())
				{
					break;
				}
			
				eAttack(e.getSchaden());
				Main.sleep(2000);
			}
						
		}
		else
		{
			while (true)
			{
				
				p.setLeben(p.getLeben() - e.getSchaden());
				
				if (p.isDead())
				{
					break;
				}
				
				eAttack(e.getSchaden());
				Main.sleep(2000);
				
				e.setLeben(e.getLeben() - p.getDmg());
				
				if (e.isDead())
				{
					System.out.println("\nDu wurdest von " + e.getName() + " getötet\n");
					break;
				}
				
				pAttack(p.getDmg());  
				Main.sleep(2000);
				
				
			}
			
		}
		
		
		
	}
	
	public void pAttack (int dmg)
	{
		System.out.println("\nDu hast " + e.getName() + " " + dmg + " Schaden gemacht" + "\n\nVerbleibendes Leben von " + e.getName() + " " + e.getLeben());
	}
	
	public void eAttack (int dmg)
	{
		System.out.println("\n" + e.getName() + " hat dir " + dmg + " Schaden ausgeteilt" + "\n\nVerbleibendes Leben von: " + p.getName() + " " + p.getLeben());
	}
	
	

	
	
	
	
}
