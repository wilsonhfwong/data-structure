package google;

import java.util.Arrays;

public class HeapSort {
	
	private static void sort(int[] arr) {
		
		int n = arr.length;
		
		for(int parent=n/2-1; parent > -1; parent--) {
			System.out.println("for loop on parent: "+parent);

			heapify(arr, parent, n);

			System.out.println("for loop on parent: "+parent +" | "+ Arrays.toString(arr));

		}
		
		for(int i=n-1; i>=0; i--){
			swap(arr, 0, i);
			System.out.println("sort after swap: "+ Arrays.toString(arr));
			heapify(arr, 0, i);
		}
				
		
		
		
	}
	
	private static void heapify(int[] arr, int root, int end) {
		
		System.out.println("heapify on node: "+root);
			
					
		int left = root * 2 + 1;
		int right = root * 2 + 2;
		
		
		int largest = root;

		if(left<end)
			System.out.println("heapify left: "+left + "("+arr[left] +")");
		
		if(right<end)
			System.out.println("heapify right: "+right+ "("+arr[right] +")");
		
		
		if(left<end && arr[left] > arr[largest])
			largest = left;
		
		if(right<end && arr[right] > arr[largest])
			largest = right;
		
		
		if(largest != root) {

			swap(arr, root, largest);
			System.out.println("heapify, after swap: "+Arrays.toString(arr));

			heapify(arr, largest, end );
		}
			
		

		
		
	}
	
	private static void swap(int[] arr, int posFrom, int posTo) {
		int temp = arr[posFrom];
		arr[posFrom] = arr[posTo];
		arr[posTo] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4, 10, 3, 5, 1, 7, 8, 9};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
