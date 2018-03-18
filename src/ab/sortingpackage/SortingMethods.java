package ab.sortingpackage;

public class SortingMethods {

	public static int[] selectionSort(int[] input) {		
		for(int i = 0; i < input.length; i++) {
			swap(i, findMinimum(input, i),input);
		}
		
		return input;
	}
	
	/**
	 * find minimum returns the index we need to swap
	 * @param input
	 * @param startIndex
	 * @return
	 */
	public static int findMinimum(int[] input, int startIndex) {
		int min = input[startIndex];
		int minIndex = startIndex;
		for(int i = startIndex; i < input.length; i++) {
			if(input[i]<min) {
				min = input[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	/**
	 * swap two positions in an array
	 * @param startIndex
	 * @param indexToSwap
	 * @param input
	 */
	public static void swap(int startIndex, int indexToSwap, int[] input){
		int temp = input[startIndex];
		input[startIndex] = input[indexToSwap];
		input[indexToSwap] = temp;
	}

}

