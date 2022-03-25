package de.mako.shop;

public class Market {

	// Hier sollen alles was es zu essen gibt, angezeigt werden und gekauft werden können
	//String Foodname | int Foodheal | int Saturation
	
	String n;	//name des Essens	
	private int heal;	//Leben, dass das Essens heilt
	private int saturation;	//Wie viel Hunger gefüllt wird
	private int cost; //kosten des Essens
	
	public Market(String un, int uheal, int usaturation, int ucost) {
		
		n = un;
		heal = uheal;
		saturation = usaturation;
		cost = ucost;
		
	}
	
	public int getHeal() {
		return heal;
	}
	
	public void setHeal(int heal) {
		this.heal = heal;
	}
	
	public int getSaturation() {
		return saturation;
	}
	
	public void setSaturation(int saturation) {
		this.saturation = saturation;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
	
}
