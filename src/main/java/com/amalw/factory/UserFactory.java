package com.amalw.factory;

import com.amalw.model.User;
import com.github.javafaker.Faker;

import java.util.UUID;

public class UserFactory {

	private UserFactory() {
	}

	public static User buildUser(String firstName, String lastName, String company, String password,
			String confirmPassword, boolean useFaker) {

		Faker faker = FakerFactory.getFaker();

		User user = new User();

		user.setFirstName(useFaker || firstName == null ? faker.name().firstName() : firstName);
		user.setLastName(useFaker || lastName == null ? faker.name().lastName() : lastName);

		user.setEmail(useFaker ? faker.name().username().toLowerCase() + "@testmail.local"
				: UUID.randomUUID() + "@example.com");

		user.setCompany(useFaker || company == null ? faker.company().name() : company);

		// ✅ IMPORTANT: generate password ONCE
		String finalPassword = (useFaker || password == null) ? faker.internet().password(10, 16, true, true)
				: password;

		user.setPassword(finalPassword);

		// 🔥 ALWAYS mirror password unless explicitly testing mismatch scenario
		user.setConfirmPassword(finalPassword);

		return user;
	}

	private static String generateEmail(boolean useFaker) {
		if (useFaker) {
			Faker faker = FakerFactory.getFaker();
			return faker.internet().emailAddress();
		}
		return UUID.randomUUID() + "@example.com";
	}
}