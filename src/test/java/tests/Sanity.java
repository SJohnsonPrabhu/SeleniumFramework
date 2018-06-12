package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sanity {
	
	@Test
	public void add() {
		System.out.println("ADD");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(30, a + b);
	}

	@Test
	public void sub() {
		System.out.println("SUB");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(-10, a - b);
	}

	@Test
	public void multi() {
		System.out.println("MULTI");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(200, a * b);
	}

	@Test
	public void div() {
		System.out.println("DIV");
		int a = 30;
		int b = 10;
		AssertJUnit.assertEquals(3, a / b);
	}

}
