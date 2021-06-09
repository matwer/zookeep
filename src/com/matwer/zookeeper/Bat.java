/**
 * 
 */
package com.matwer.zookeeper;

/**
 * @author Matthew
 *
 */
public class Bat extends Mammal {
	
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("The bat flaps it's giant wings and takes flight, looking for it's next victim...");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("The bat eats it's human prey...");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The bat swoops down on the unsuspecting town and sets it's ablaze...");
		energyLevel -= 100;
	}

}
