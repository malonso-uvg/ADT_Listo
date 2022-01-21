import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

/**
 * 
 */
import com.uvg.main.StackNodes;
/**
 * @author moises.alonso
 *
 */
class StackNodesTests {

	/**
	 * Test method for {@link com.uvg.main.StackNodes#push(java.lang.Object)}.
	 */
	@Test
	void testPush() {
		StackNodes<Integer> miStack = new StackNodes<Integer>();
		miStack.push(5);
		assertEquals(5, miStack.peek());
	}

	/**
	 * Test method for {@link com.uvg.main.StackNodes#pull()}.
	 */
	@Test
	void testPull() {
		StackNodes<Integer> miStack = new StackNodes<Integer>();
		miStack.push(5);
		miStack.push(3);
		miStack.pull();
		assertEquals(5, miStack.pull());
	}

	/**
	 * Test method for {@link com.uvg.main.StackNodes#peek()}.
	 */
	@Test
	void testPeek() {
		StackNodes<Integer> miStack = new StackNodes<Integer>();
		miStack.push(5);
		assertEquals(5, miStack.peek());
		assertEquals(5, miStack.peek());
	}

	/**
	 * Test method for {@link com.uvg.main.StackNodes#count()}.
	 */
	@Test
	void testCount() {
		StackNodes<Integer> miStack = new StackNodes<Integer>();
		miStack.push(5);
		miStack.push(3);
		miStack.push(3);
		assertEquals(3, miStack.count());
	}

	/**
	 * Test method for {@link com.uvg.main.StackNodes#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		StackNodes<Integer> miStack = new StackNodes<Integer>();
		assertEquals(true, miStack.isEmpty());
	}

}
