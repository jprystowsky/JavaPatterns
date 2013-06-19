package io.mapping.javapatterns.creational.abstractfactory;

/**
 * Provides a factory for constructing C# developers.
 */
public class CSharpDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer newDeveloper() {
		return new CSharpDeveloper();
	}
}
