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
		
		// throw 3 things
		ivan.throwSomething();
		ivan.displayEnergy();
		ivan.throwSomething();
		ivan.displayEnergy();
		ivan.throwSomething();
		ivan.displayEnergy();
		
		// eat bananas twice
		ivan.eatBananas();
		ivan.displayEnergy();
		ivan.eatBananas();
		ivan.displayEnergy();
		
		// climb once
		ivan.climb();
		ivan.displayEnergy();
	}

}
