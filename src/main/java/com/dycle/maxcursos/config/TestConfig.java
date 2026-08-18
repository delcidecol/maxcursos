package com.dycle.maxcursos.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dycle.maxcursos.entities.Order;
import com.dycle.maxcursos.entities.User;
import com.dycle.maxcursos.entities.enums.OrderStatus;
import com.dycle.maxcursos.repositories.OrderRepository;
import com.dycle.maxcursos.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	private final UserRepository userRepository;

	private final OrderRepository orderRepository;

	TestConfig(UserRepository userRepository, OrderRepository orderRepository) {
		this.userRepository = userRepository;
		this.orderRepository = orderRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Marina de Col", "marinadecol@gmail.com", "99122-1281", "123456");
		User u2 = new User(null, "Kleverson Ricardo", "ricador@gmail.com", "99124-6978", "321654");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED, u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}
}
