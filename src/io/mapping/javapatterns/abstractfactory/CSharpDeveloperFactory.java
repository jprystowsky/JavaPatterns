package io.mapping.javapatterns.abstractfactory;

/**
 * Provides a factory for constructing C# developers.
 */
public class CSharpDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer newDeveloper() {
		return new CSharpDeveloper();
	}
}
