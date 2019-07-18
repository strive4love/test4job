package com.jobs.mini_test;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
	
	@Test
	public void testdivisibleBy3(){
         assertTrue("Check the logic of the business method", App.divisibleBy3(18));;
         assertFalse("Check the logic of the business method",App.divisibleBy3(5));
	}
	
	@Test
	public void testdivisibleBy5(){
         assertTrue("Check the logic of the business method", App.divisibleBy5(75));;
         assertFalse("Check the logic of the business method",App.divisibleBy5(76));
	}
	
	@Test
	public void testhas3(){
         assertTrue("Check the logic of the business method", App.has3(36));;
         assertFalse("Check the logic of the business method",App.has3(99));
	}
	
	@Test
	public void testhas5(){
         assertTrue("Check the logic of the business method", App.has5(57));;
         assertFalse("Check the logic of the business method",App.has5(100));
	}
    
	@Test
	public void testhasBoth3and5(){
		assertTrue("Check the logic of the business method", App.hasBoth3and5(53));;
        assertFalse("Check the logic of the business method",App.hasBoth3and5(34));
        assertFalse("Check the logic of the business method",App.hasBoth3and5(56));
	}
}
