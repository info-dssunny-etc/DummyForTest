package com.ngi.test;
import junit.framework.Assert;
import org.junit.Test;

public class clsTest1 {

	
		 
		@Test
		public void testPrintHelloWorld() {
	 
			Assert.assertEquals(Dummy.getHelloWorld(), "Hello world");
	 
		}
	 
	
}
