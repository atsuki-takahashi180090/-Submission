package jp.te4a.spring.boot.myapp2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TaroControllerTest {
	//@Test
	public void test() {
		TaroController tarocontroller = new TaroController();
		String expected = "Taro desu!";
		
		//expected = "missmissmissmissmissmiss";
		
		String autual = tarocontroller.taro();
		
		assertEquals(expected,autual);
		
	}
}