package com.amalw.factory;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public final class FakerFactory {

	private static final ThreadLocal<Faker> TL_FAKER = ThreadLocal.withInitial(() -> new Faker(new Locale("en-US")));

	private FakerFactory() {
	}

	public static Faker getFaker() {
		return TL_FAKER.get();
	}

	// deterministic mode for debugging / CI replay
	public static Faker getSeededFaker(long seed) {
		return new Faker(new java.util.Random(seed));
	}

	public static boolean randomBoolean(double probability) {
		return ThreadLocalRandom.current().nextDouble() < probability;
	}
}