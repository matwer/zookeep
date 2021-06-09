/**
 * 
 */
package com.matwer.zookeeper;

/**
 * @author Matthew Werner
 *
 */
public class Mammal {
	
	public int energyLevel;
	
	public Mammal() {
		energyLevel = 100;
	}
	
	
	public int displayEnergy() {
		System.out.println("Energy level is " + energyLevel);
		return energyLevel;
	}
}
