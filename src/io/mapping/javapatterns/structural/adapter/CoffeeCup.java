package io.mapping.javapatterns.structural.adapter;

/**
 * Provides a representation of coffee cups.
 */
public class CoffeeCup {
	public Coffee drink() {
		return new Coffee();
	}
}
