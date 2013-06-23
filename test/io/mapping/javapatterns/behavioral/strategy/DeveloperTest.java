package io.mapping.javapatterns.behavioral.strategy;

import org.junit.Before;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;


public class DeveloperTest {
	@Before
	public void setUp() throws Exception {
		Developer developer;

		developer = new Developer(null);
		assertNull(developer.getAlgorithm());

		developer = new Developer(new SearchAlgorithm());
		assertNotNull(developer.getAlgorithm());
		assertTrue(developer.getAlgorithm() instanceof Algorithm);

		developer = new Developer(new TranslationAlgorithm());
		assertNotNull(developer.getAlgorithm());
		assertTrue(developer.getAlgorithm() instanceof Algorithm);
	}
}
