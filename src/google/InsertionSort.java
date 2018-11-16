package google;

public class InsertionSort {

	public static void sort(int[] arrayA) {
				
		for(int i=1; i< arrayA.length; i++) {
			int key = arrayA[i];
			int j = i-1;
			
			while(j >=0 && key < arrayA[j]) {
				arrayA[j+1] = arrayA[j];
				j = j-1;
			}
			arrayA[j+1]= key;
			
			for(int k=0; k< arrayA.length; k++) {
				System.out.print(arrayA[k]+" ");
			}
			System.out.println();

				
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arrayA = {5, 4, 3, 2, 1};;
		int[] arrayA = {1, 2, 3, 4, 5};

		sort(arrayA);

	}

}
