package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.*;
 
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
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }
	
        @Test
      public void testCal() {
        Calculator testadd = new Calculator();
	assertEquals(testadd.add(),8); 	
	}     
}
