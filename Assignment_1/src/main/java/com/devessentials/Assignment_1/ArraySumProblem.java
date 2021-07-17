package com.devessentials.Assignment_1;
import java.util.Arrays;
import java.util.Scanner;

/**
 * * Java Program to find pairs on integer array whose sum is equal to k (givenSum) *
 * * @author Shubham Chandra/ SC081699
 */
public class ArraySumProblem {
	public static void main(String args[]) {
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		int givenSum;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Sum number");
		givenSum = scn.nextInt();
		scn.close();
		
		if (findThePairs(numbers, givenSum) > 0)
            System.out.println(1 + " Integer numbers, whose sum is equal to value : " + givenSum);
        else
            System.out.println(-1 + " The given sum can not be achieved from the numbers of the array");
	}
	
/** * Utility method to find the pair of number that adds up to the given sum*/ 
	public static int findThePairs(int[] array, int givenSum){
		int firstIndex ;
		int secondIndex;
		for (firstIndex = 0; firstIndex< array.length; firstIndex++) {
			int first = array[firstIndex];
			for (secondIndex = firstIndex + 1; secondIndex < array.length; secondIndex++) {
				int second = array[secondIndex];
				if ((first + second) == givenSum) {
					System.out.printf( 1 + " (%d, %d) %n", first, second);
					return 1;
					}
				}
			 }
		return -1;
		}
	
}


