public class Exercise2_7_Reverser {
	public int[] reverse(int[] nums) {
		
		int n = nums.length;

        // swap elements from both ends until the middle
        for (int i = 0; i < n / 2; i++) {
            exch(nums, i, n - 1 - i);
        }

        
        return nums;
    }

    // exchanges the elements at positions i and j in array a
    private void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

	
