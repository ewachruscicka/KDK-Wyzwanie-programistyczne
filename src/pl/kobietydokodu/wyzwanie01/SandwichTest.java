package pl.kobietydokodu.wyzwanie01;

import static org.junit.Assert.*;

import org.junit.Test;

public class SandwichTest {
	String sandwichFilling;

	@Test
	public void testGetEggSandwich() {
		sandwichFilling = "ZZWWDddbreadeggbreadyy";
		System.out.println("\nTEST EGG SANDWICH() \n");
		String result = Sandwich.getSandwich(sandwichFilling);
		System.out.println(result);
		assertEquals(result, "egg");
	}

	@Test
	public void testGetBadSandwich() {
		sandwichFilling = "breadeggham";
		System.out.println("\nTEST BAD SANDWICH() \n");
		String result = Sandwich.getSandwich(sandwichFilling);
		System.out.println(result);
		assertEquals(result, "The sanwich doesn't contain 2 pieces of bread.");
	}
	
	@Test
	public void testGetDoubleSandwich() {
		sandwichFilling = "breadegghambreadtomatobread";
		System.out.println("\nTEST DOUBLE SANDWICH() \n");
		String result = Sandwich.getSandwich(sandwichFilling);
		System.out.println(result);
		assertEquals(result, "egghambreadtomato");
	}
}
