package uk.ecs.anjali;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		assertEquals("Hello Anjali", HelloWorld.greet("Anjali"));
	}

}
