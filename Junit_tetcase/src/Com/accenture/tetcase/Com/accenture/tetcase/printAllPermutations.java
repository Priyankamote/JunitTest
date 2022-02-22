package Com.accenture.tetcase;
import java.util.ArrayList;
import java.util.List;

public class printAllPermutations extends testprintAllPermutations{

	private static long factorial(long n) {
		long f = 1;
		for (long i = 2; i <= n; i++) f *= i;
		return f;
	}

	private static void swap(int[] items, int i, int j) {
		int t = items[i];
		items[i] = items[j];
		items[j] = t;
	}

	private static List<Integer> makeList(int[] items) {
		List<Integer> list = new ArrayList<Integer>(items.length);
		for (int k : items) list.add(k);
		return list;
	}

	public List<List<Integer>> generate(int[] items) {
		long n = factorial(items.length);
		List<List<Integer>> perms = new ArrayList<List<Integer>>((int)n);
		perms.add(makeList(items));
		
		while (perms.size() < n) {
			for (int i = items.length - 1; i >= 1; i--) {
				swap(items, 0, i);
				perms.add(makeList(items));
				if (perms.size() == n) break;
				
			}
			
		}
		return perms;
	}

}
