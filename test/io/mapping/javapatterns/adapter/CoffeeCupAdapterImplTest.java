package io.mapping.javapatterns.adapter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Tests {@link CoffeeCupAdapterImpl}.
 */
public class CoffeeCupAdapterImplTest {
	private CoffeeCup cup;
	private CoffeeCupAdapter adapter;

	@Before
	public void setUp() throws Exception {
		cup = new CoffeeCup();
		assertNotNull(cup);

		adapter = new CoffeeCupAdapterImpl();
		assertNotNull(adapter);
	}

	@Test
	public void testAdapter() throws Exception {
		// Manually
		Coffee coffee = cup.drink();
		assertNotNull(coffee);

		Freezer freezer = new Freezer();
		assertNotNull(freezer);

		boolean freezerBoolean = freezer.freeze(coffee);

		// Adapter
		boolean adapterBoolean = adapter.freezeCup(cup);

		assertEquals(freezerBoolean, adapterBoolean);
	}


}
