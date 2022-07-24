// Java Program to find the missing elements
// from integer array using BitSet class

import java.io.*;
import java.util.*;

public class Hello {
	private static void findMissingNumbers(int arr[], int n)
	{
		int missCnt = n - arr.length;
		// create Bitset object b
		BitSet b = new BitSet(n);
 System.out.println(b);
		for (int i : arr) {
			b.set(i - 1);
                                   System.out.println(b);
		}
		int lastMissIndex = 0;
		for (int i = 0; i < missCnt; ++i) {
			lastMissIndex = b.nextClearBit(lastMissIndex);
			// print missing number
			System.out.println(++lastMissIndex);
		}
	}
	public static void main(String[] args)
	{
		int n = 10;
		// array of 10 numbers
		int[] arr = new int[] { 1, 2, 4, 6, 8, 9 };
		// call function
		findMissingNumbers(arr, n);
	}
}
