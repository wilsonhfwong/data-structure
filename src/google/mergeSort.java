package google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class mergeSort {

	public static int[] sort(int[] arr) {
		
		int[] result = new int[arr.length];
		
		System.out.println("Sorting... "+ Arrays.toString(arr));

		
		if(arr.length > 1)
		{
			int middle = arr.length / 2;
			
			int[] left = Arrays.copyOfRange(arr, 0, middle);
			int[] right = Arrays.copyOfRange(arr, middle, arr.length);
			
			int[] resultLeft = sort(left);
			int[] resultRight = sort(right);
			
			result = merge(resultLeft, resultRight);
				
		}
		else
		{
			result = arr;
		}
		
		return result;

	}
	
	private static int[] merge(int[] resultLeft, int[] resultRight) {
		System.out.println("Merging..."+ Arrays.toString(resultLeft) + " | " + Arrays.toString(resultRight));
		
		int[] result = new int[resultLeft.length + resultRight.length];

		int resultIndex = 0;
		int leftIndex = 0;
		int rightIndex = 0;
		
		while(leftIndex<resultLeft.length && rightIndex < resultRight.length) {
			int leftValue = resultLeft[leftIndex];
			int rightValue = resultRight[rightIndex];
			
			
			System.out.println("comparing..."+leftValue+" <> "+ rightValue);
			if(rightValue < leftValue) {
				result[resultIndex++] = rightValue;
				rightIndex++;
			}
			else {
				result[resultIndex++] = leftValue;
				leftIndex++;
			}
		}
		
		while(leftIndex < resultLeft.length)
		{
			result[resultIndex++] = resultLeft[leftIndex++];
		
		}
		
		while(rightIndex<resultRight.length)
		{
			result[resultIndex++] = resultRight[rightIndex++];
		
		}		
		
		System.out.println("Merging result... "+ Arrays.toString(result));
		

		
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayA = {9, 8, 0, 0, 0, 1, 2, 4};
		int[] result = sort(arrayA);
		System.out.println("Final result..."+ Arrays.toString(result));


	}

}
