package de.mako.main;

import java.util.Random;

import java.util.Scanner;


import de.mako.entities.Enemy;
import de.mako.entities.Player;
//import de.mako.shop.Market;


public class Main {

	public static void main(String[] args) {
		
		Player p;
		//Market m;
		System.out.println("Herzlich Wilkommen, gib deinen Namen ein:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		while (true)
		{
			System.out.println("Wählen Sie ihre Schwierigkeit aus (anfangs Buchstabe eintippen)! (e)asy, (m)edium, (h)ard");
			String s = sc.nextLine();
		
			if (s.equalsIgnoreCase("e"))
			{
				p = new Player (100, 20, 0, 100, n, Difficulty.EASY);
				break;
			}
			else if (s.equalsIgnoreCase("m"))
			{
				p = new Player (75, 15, 0, 90, n, Difficulty.MEDIUM);	
				break;
			}
			else if (s.equalsIgnoreCase("h"))
			{
				p = new Player (50, 10, 0, 60, n, Difficulty.HARD);
				break;
			}
			
			System.out.println("Schwierigkeit nicht erkannt, bitte versuch es erneut!");
			continue;
		
		
		
		}
		
		System.out.println("\nMögen die Spiele beginnen!\n");
		p.showStats();
		
		while (true)
		{
			System.out.println("\nWas willst du als nächstes tun?\n(k)ämpfen oder (s)hop besuchen\n");
			String w = sc.nextLine();
		
			if (w.equalsIgnoreCase("k"))
			{
				Fight k = new Fight(p.getDiff(), p);
				k.start();
				
				
				
				
				
				if (p.isDead())
				{
				
					System.out.println("Du bist gestorben!\n");
					break;
				}
				getRewards(k.getEnemy(), k.getPlayer());
				p.showStats();
				continue;
			}
			
			else if (w.equalsIgnoreCase("s"))
			{
			
				continue;
			}
			
			else
			{
				System.out.println("Auswahl nicht erkannt, bitte versuche es erneut!");
				continue;
			}
		
		}

	}
	
	public static int getRandom (int min, int max)
	{
		if (min >= max)
		{
			throw new IllegalArgumentException("max must be greater than min");
		}
		
		Random r = new Random();
		return r.nextInt((max-min)+1) + min;
	}
	
	public static void sleep(int ms)
	{
		try 
		{
			Thread.sleep(ms);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static void getRewards(Enemy e, Player p)
	{
		p.setGeld(p.getGeld() + e.getMoney());
		
		p.setHunger(p.getHunger() - e.getLoosh());
		
		if (p.getHunger() < 0)
		{
			p.setHunger(0); 
		}
		
		p.setPoints(p.getPoints() + e.getPoints());
	}
		

}






