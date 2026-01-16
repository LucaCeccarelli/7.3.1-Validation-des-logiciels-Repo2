package com.imt.mines;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void depositMoney_increasesBalance() throws Exception {
		Person holder = new Person("Alex", 'M', 30, 70.0f, 175.0f, "Black", "Brown", "alex@example.com");
		BankAccount account = new BankAccount(50.0, 200.0, "2024-01-01", holder);

		account.depositMoney(100.0);

		assertEquals(150.0, account.getBalance(), 0.0001);
	}

	@Test
	void getDateCreated_returnsConstructorDate() throws Exception {
		Person holder = new Person("Taylor", 'F', 26, 58.0f, 168.0f, "Blonde", "Hazel", "taylor@example.com");
		BankAccount account = new BankAccount(50.0, 200.0, "2024-03-15", holder);

		assertEquals("2024-03-15", account.getDateCreated());
	}

	@Test
	void withdrawMoney_overBalance_isRejected() throws Exception {
		Person holder = new Person("Sam", 'F', 28, 60.0f, 165.0f, "Brown", "Green", "sam@example.com");
		BankAccount account = new BankAccount(50.0, 200.0, "2024-01-01", holder);

		boolean result = account.withdrawMoney(60.0);

		assertFalse(result);
		assertEquals(50.0, account.getBalance(), 0.0001);
	}
}
