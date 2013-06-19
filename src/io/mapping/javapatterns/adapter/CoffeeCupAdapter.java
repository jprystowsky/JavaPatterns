package io.mapping.javapatterns.adapter;


/**
 * Provides an adapter interface to {@link CoffeeCup}s for objects expecting to be able to {@code getLiquid()}
 * instead of {@code drink()}.
 */
public interface CoffeeCupAdapter {
	public boolean freezeCup(CoffeeCup cup);
}
