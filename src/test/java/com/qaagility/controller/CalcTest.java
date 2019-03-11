package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class CalcTest {

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated-2");
      }

	@Test	
      public void testCalc() {
        assertEquals("Result", testcaladd.add(), 9);
      }

	@Test	
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }
	
        @Test
      public void testCaladd = new Calculator() {
		assertEquals(testCalAdd.add(),8); 	
     }     
}
