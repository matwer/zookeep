package com.matwer.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The gorilla throws something (you don't want to kno what it was)...");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The gorilla eats bananas...");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorilla is climbing a tree...");
		energyLevel -= 10;
	}
	
}
