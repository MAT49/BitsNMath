package me.nonnon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Q5_1Test {
	
	Q5_1 solution;
	int n = 1024; // 2^10
	int m = 19; // 10011
	int i = 2;
	int j = 6;

	
	@BeforeEach
	void init() {
		solution = new Q5_1();

		
	}

	@Test
	@DisplayName("Checking bit insertion")
	void updateBitsTest() {
		// Answer should equal 10001001100 (1100 in decimal)
		assertEquals(1100, solution.updateBits(n, m, i, j));		
	}

}
