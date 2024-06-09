package com.shalini.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shalini.source.AddNumbers;

public class AddNumbersTest {

	@Test(expected = IllegalArgumentException.class)
	public void testAddNumbers() throws Exception {
		
		AddNumbers addNumbers = new AddNumbers();
		assertEquals(0,addNumbers.add(""));
		assertEquals(1,addNumbers.add("1,"));
		assertEquals(6,addNumbers.add("1\n2,3"));
		assertEquals(3,addNumbers.add("//;\n1;2"));
		assertEquals(-3,addNumbers.add("//;\n-1;-2"));
	}

}
