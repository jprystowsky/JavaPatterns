package io.mapping.javapatterns.factorymethod;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Tests the {@link DeveloperFactory} factory methods to ensure they return correctly.
 */
public class DeveloperFactoryTest {
	/**
	 * Instantiates a new {@link JavaDeveloper} via the {@link ConcreteDeveloper} proxy class, consumed as the
	 * {@link Developer} interface.
	 */
	@Test
	public void testNewJavaDeveloper() {
		Developer developer = DeveloperFactory.newJavaDeveloper();
		assertNotNull(developer);
	}

	/**
	 * Instantiates a new {@link SQLDeveloper} via the {@link ConcreteDeveloper} proxy class, consumed as the
	 * {@link Developer} interface.
	 */
	@Test
	public void testNewSQLDeveloper() {
		Developer developer = DeveloperFactory.newSQLDeveloper();
		assertNotNull(developer);
	}
}
