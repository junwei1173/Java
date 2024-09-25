import java.util.*;

public class IntCollection {
	private int[] a;
	
	public IntCollection(int[] keys) {
		a = Arrays.copyOf(keys, keys.length); // defensive copy
		Arrays.sort(a);
	}
	
	public boolean contains(int key) {
		return indexOf(key) != -1;
	}
	private int indexOf(int key) {
		int lo = 0;
		int hi = a.length -1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid -1;
			else if (key > a[mid]) lo = mid +1;
			else return mid;
		}
		return -1;
	}
}
