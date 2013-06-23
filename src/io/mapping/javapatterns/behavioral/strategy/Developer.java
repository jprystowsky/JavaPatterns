package io.mapping.javapatterns.behavioral.strategy;

/**
 * A software developer
 */
public class Developer {
	private final Algorithm mAlgorithm;

	/**
	 * Instantiate a new Developer with a given Algorithm.
	 * @param algorithm
	 */
	public Developer(Algorithm algorithm) {
		mAlgorithm = algorithm;
		mAlgorithm.execute();
	}

	public Algorithm getAlgorithm() {
		return mAlgorithm;
	}
}
