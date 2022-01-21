import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
import com.uvg.main.StackArrayList;
/**
 * @author moises.alonso
 *
 */
class StackArrayListTests {

	/**
	 * Test method for {@link com.uvg.main.StackArrayList#push(java.lang.Object)}.
	 */
	@Test
	void testPush() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		assertEquals(5, miStack.peek());
	}

	/**
	 * Test method for {@link com.uvg.main.StackArrayList#pull()}.
	 */
	@Test
	void testPull() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		assertEquals(5, miStack.pull());
	}

	/**
	 * Test method for {@link com.uvg.main.StackArrayList#peek()}.
	 */
	@Test
	void testPeek() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		assertEquals(5, miStack.peek());
		assertEquals(5, miStack.peek());
	}

	/**
	 * Test method for {@link com.uvg.main.StackArrayList#count()}.
	 */
	@Test
	void testCount() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		miStack.push(3);
		miStack.push(3);
		assertEquals(3, miStack.count());
	}

	/**
	 * Test method for {@link com.uvg.main.StackArrayList#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		assertEquals(true, miStack.isEmpty());
	}

}
