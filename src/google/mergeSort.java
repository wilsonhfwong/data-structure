package google;

import java.util.Arrays;

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
		while(leftIndex<resultLeft.length || rightIndex < resultRight.length) {
			int leftValue = leftIndex < resultLeft.length? resultLeft[leftIndex] : 999999;
			int rightValue = rightIndex < resultRight.length? resultRight[rightIndex] : 999999;
			
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

		
		System.out.println("Merging result... "+ Arrays.toString(result));
		

		
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayA = {9, 8, 7, 6, 5, 4, 3};
		int[] result = sort(arrayA);
		for(int k: result) {
			System.out.print(k+",");
		}

	}

}
