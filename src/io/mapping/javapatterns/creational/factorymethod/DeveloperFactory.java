package io.mapping.javapatterns.creational.factorymethod;


/**
 * A class providing a factory for instantiating {@link Developer}s. The factory will return instances as
 * {@link ConcreteDeveloper} to wrap and mask the underlying {@link JavaDeveloper} and {@link SQLDeveloper}
 * classes to promote flexibility and extensibility.
 */
public class DeveloperFactory {
	/**
	 * Prevents instantiation.
	 */
	private DeveloperFactory() {
	}

	/**
	 * Instantiates a new {@link Developer} specializing in Java.
	 *
	 * @return a new {@link Developer}
	 */
	public static ConcreteDeveloper newJavaDeveloper() {
		return new JavaDeveloper();
	}

	/**
	 * Instantiates a new {@link Developer} specializing in SQL.
	 *
	 * @return a new {@link Developer}
	 */
	public static ConcreteDeveloper newSQLDeveloper() {
		return new SQLDeveloper();
	}
}
