package Com.accenture.tetcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public abstract class testprintAllPermutations implements Permutations {

	private static void assertListContains(List<List<Integer>> perms, int ... ns) {
		for (List<Integer> perm : perms) {
			boolean eq = true;
			assertEquals(ns.length, perm.size());
			
			for (int i = 0; i < ns.length; i++) {
				if (!perm.get(i).equals(ns[i])) {
					eq = false;
					break;
				}
			}
			if (eq) return;
		}
		fail();
	}

	private Permutations solution;

	@Before
	public void setUp() throws Exception {
		final Class<? extends Permutations> klass = getClass();
		solution = klass.newInstance();
	}

	@Test(timeout=2000)
	public void empty() {
		List<List<Integer>> perms = solution.generate(new int[0]);
		assertNotNull(perms);
		assertEquals(1, perms.size());
		assertListContains(perms);
	}

	@Test(timeout=2000)
	public void three() {
		List<List<Integer>> perms = solution.generate(new int[]{1, 2, 3});
		assertNotNull(perms);
		assertEquals(6, perms.size());
 
		assertListContains(perms, 1, 2, 3);
		assertListContains(perms, 3, 2, 1);
		assertListContains(perms, 2, 3, 1);
		assertListContains(perms, 1, 3, 2);
		assertListContains(perms, 3, 1, 2);
		assertListContains(perms, 2, 1, 3);
	}
}