package com.shalini.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shalini.source.AddNumbers;

public class AddNumbersTest {

	@Test
	public void testAddNumbers() throws Exception {
		
		AddNumbers addNumbers = new AddNumbers();
		assertEquals(0,addNumbers.add(""));
		assertEquals(1,addNumbers.add("1,"));
	}

}
