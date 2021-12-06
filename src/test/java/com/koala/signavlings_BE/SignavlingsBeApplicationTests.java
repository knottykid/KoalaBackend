package com.koala.signavlings_BE;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SignavlingsBeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void shouldSucceed(){
		int num = 1;
		Assertions.assertEquals(num, 1);
	}
}
