package com.emelwerx.string_compress;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CompressorTest {
	private Compressor target;
	
	@Before
	public void setup() {
		target = new Compressor();
	}
	
	@Test
	public void whenSourceIsNullReturnEmpty() {
		//setup
		String nullString = null;
		
		//execute
		String result = target.compress(nullString);
		
		//verify
		assertEquals("", result);
	}
	
	@Test
	public void whenSourceIsEmptyThenReturnEmpty() {
		//setup
		String emptyString = "";
		
		//execute
		String result = target.compress(emptyString);
		
		//verify
		assertEquals("", result);
	}
	
	@Test
	public void whenLengthLessThanThreeThenReturnOriginal() {
		//setup
		String original = "ab";
		
		//execute
		String result = target.compress(original);
		
		//verify
		assertEquals(original, result);
	}
	
	@Test
	public void when_aabbcccbaa_ThenReturn_a2b2c3b1a2_() {
		//setup
		String original = "aabbcccbaa";
		
		//execute
		String result = target.compress(original);
		
		//verify
		assertEquals("a2b2c3b1a2", result);
	}
	
	@Test
	public void whenResultIsNotLessThanOriginalThenReturnOriginal() {
		//setup
		String original = "abcdefghijklmnopqrstuvwxyz";
		
		//execute
		String result = target.compress(original);
		
		//verify
		assertEquals(original, result);
	}

}
