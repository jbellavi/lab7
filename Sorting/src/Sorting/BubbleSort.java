package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		for (int i = unsortedArray.length; i > 0; i++) {
			for (int j = 0; j < i; j++) {
				if (unsortedArray[i] > unsortedArray[j]) {
					int swap unsortedArray[i];
					unsortedArray[i] = unsortedArray[j];
					unsortedArray[j] = swap;
				}
			}
		}
		return unsortedArray;
	}
}
