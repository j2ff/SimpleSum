package com.example.demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	
		Sum sum =new Sum();
		assertEquals(sum.add(2, 3),5);
		assertEquals(sum.add(Integer.MAX_VALUE-1, 1),Integer.MAX_VALUE);
		assertEquals(sum.add(Integer.MIN_VALUE-1, 1),Integer.MIN_VALUE);
		assertNotEquals(sum.add(Integer.MIN_VALUE-1, 1),111);

		
	}
	

}
