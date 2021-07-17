package com.devessentials.Assignment_1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArraySumTest {

	@Test
	void testPairs() {
		int[] array = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
        int expectedResult = 1;
        
        int actualResult = ArraySumProblem.findThePairs(array, sum);
        
        assertEquals(actualResult, expectedResult);
	}
	
	@Test
	void testNoPairs() {
		int[] array = { 5, 4, 3 , 2, 1};
        int sum = -1;
        int expectedResult = -1;
        
        int actualResult = ArraySumProblem.findThePairs(array, sum);
        
        assertEquals(actualResult, expectedResult);
	}

}
