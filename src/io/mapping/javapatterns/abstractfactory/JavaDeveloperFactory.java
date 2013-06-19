package io.mapping.javapatterns.abstractfactory;

/**
 * Provides a factory to return new Java developers.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer newDeveloper() {
		return new JavaDeveloper();
	}
}
