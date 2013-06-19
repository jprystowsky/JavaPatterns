package io.mapping.javapatterns.abstractfactory;

import org.junit.Before;

import static junit.framework.Assert.assertNotNull;

/**
 * Tests the {@link DeveloperFactory} instances.
 */
public class DeveloperFactoryTest {
	private DeveloperFactory javaDeveloperFactory, cSharpDeveloperFactory;

	@Before
	public void setUp() throws Exception {
		javaDeveloperFactory = new JavaDeveloperFactory();
		assertNotNull(javaDeveloperFactory);

		cSharpDeveloperFactory = new CSharpDeveloperFactory();
		assertNotNull(cSharpDeveloperFactory);
	}

	public void testNewDeveloper() throws Exception {
		Developer javaDeveloper = javaDeveloperFactory.newDeveloper();
		assertNotNull(javaDeveloper);

		Developer cSharpDeveloper = cSharpDeveloperFactory.newDeveloper();
		assertNotNull(cSharpDeveloper);
	}


}
