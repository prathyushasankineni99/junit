package com.example.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class First2ACharsTest {

	/* TO-DO list :
	 * "ABCD"=>"BCD"---Success
	 * "AACD"=>"CD"---Success
	 * "BACD"=>"BCD"---Success
	 * "BBAA"=>"BBAA"---Success
	 * "AABAA"=>"BAA"---Success
	 * "A"=>""---Success
	 * "B"=>"B"---Success
	 */
	First2AChars first2AChars;
	@BeforeEach
	void setUp()
	{
		first2AChars=new First2AChars();
	}
	@Test
	void testWith1StartAChars() {
		assertEquals("BCD", first2AChars.removeAChars("ABCD"));
	}
	@Test
	void testWith2StartAChars() {
		assertEquals("CD", first2AChars.removeAChars("AACD"));
	}
	@Test
	void testWith2ndAChars() {
		assertEquals("BCD", first2AChars.removeAChars("BACD"));
	}
	@Test
	void testWithEndAChars() {
		assertEquals("BBAA", first2AChars.removeAChars("BBAA"));
	}
	@Test
	void testWithAChars() {
		assertEquals("BAA", first2AChars.removeAChars("AABAA"));
	}
	@Test
	void testWith1Chars() {
		assertEquals("", first2AChars.removeAChars("A"));
	}
	@Test
	void testWith1NoAChars() {
		assertEquals("B", first2AChars.removeAChars("B"));
	}
	

}
