package jp.te4a.spring.boot.myapp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;

public class HelloControllerTest {
	//@Test
	public void test() {
		HelloController hellocontroller = new HelloController();
		String expected = "Hello, Spring Boot!";
		
		//expected = "missmissmissmissmissmiss";
		
		
		String autual = hellocontroller.index();
		
		assertEquals(expected,autual);
		
	}
}