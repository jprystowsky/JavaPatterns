package io.mapping.javapatterns.adapter;

/**
 * Concretely implements {@link CoffeeCupAdapter}.
 */
public class CoffeeCupAdapterImpl implements CoffeeCupAdapter {

	@Override
	public boolean freezeCup(CoffeeCup cup) {
		Coffee coffee = cup.drink();

		Freezer freezer = new Freezer();
		return freezer.freeze(coffee);
	}
}
