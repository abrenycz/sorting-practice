package ab.sortingpackage;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {
	
	@Test 
	public void testSelectionSort_emptyArray() {
		int[] input = new int[0];
		Assert.assertArrayEquals(input,SortingMethods.selectionSort(input));
	}
	
	@Test
	public void testSelectionSort_fiveArray() {
		int[] input = {3,4,2,9,2};
		int[] solution = {2,2,3,4,9};
		Assert.assertArrayEquals(solution, SortingMethods.selectionSort(input));
	}
	
	@Test
	public void testSelectionSort_alreadyOrdered() {
		int[] input = {1,2,3,4,5};
		Assert.assertArrayEquals(input, SortingMethods.selectionSort(input));
	}
	
	@Test
	public void testSelectionSort_reverseOrdered() {
		int[] input = {5,4,3,2,1};
		Assert.assertArrayEquals(input, SortingMethods.selectionSort(input));
	}

}
