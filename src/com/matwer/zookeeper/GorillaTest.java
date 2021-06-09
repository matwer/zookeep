/**
 * 
 */
package com.matwer.zookeeper;

/**
 * @author Matthew
 *
 */
public class GorillaTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a new gorilla
		Gorilla ivan = new Gorilla();
		Bat kree = new Bat();
		
		// throw 3 things
		ivan.throwSomething();
		ivan.throwSomething();
		ivan.throwSomething();
		ivan.displayEnergy();
		
		// eat bananas twice
		ivan.eatBananas();
		ivan.eatBananas();
		ivan.displayEnergy();
		
		// climb once
		ivan.climb();
		ivan.displayEnergy();
		
		// attack town 3 times (300 - 300)
		kree.attackTown();	
		kree.attackTown();	
		kree.attackTown();
		kree.displayEnergy();
		
		// eat 2 humans (0 + 50)
		kree.eatHumans();
		kree.eatHumans();
		kree.displayEnergy();
		
		// fly twice - (50 - 100) the bat will end up with negative energy...
		kree.fly();
		kree.fly();
		kree.displayEnergy();		
	
	}

}
