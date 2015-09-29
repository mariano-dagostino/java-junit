package Cronometro;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.Cronometro.Cronometro;

public class CronometroTest {
	@Test
	public void testHellowWorld(){
		Cronometro hello = new Cronometro();
		assertEquals("A test for Hello World String", "Hello World", hello.sayHello());
	}
}
