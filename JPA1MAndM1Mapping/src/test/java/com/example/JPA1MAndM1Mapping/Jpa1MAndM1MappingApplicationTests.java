package com.example.JPA1MAndM1Mapping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jpa1MAndM1MappingApplicationTests {
	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void addCustomer() {
		Customer customer = new Customer();
		PhoneNumber phoneNumber1 = new PhoneNumber();
		PhoneNumber phoneNumber2 = new PhoneNumber();
		phoneNumber1.setNumber("9689699207");
		phoneNumber2.setNumber("7020422150");
		customer.addPhoneNumber(phoneNumber1);
		customer.addPhoneNumber(phoneNumber2);
		customer.setName("Dnayn");
		customerRepository.save(customer);
	}
}
