import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ChatGPT-generated unit tests for Stack.java
 * Covers normal behavior, edge cases, and exception handling.
 */
public class ChatGPTTest {

    @Test
    public void testPushAndPeek() {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        assertEquals(20, s.peek(), "Peek should return last pushed value");
        assertEquals(2, s.size(), "Size should reflect pushed elements");
    }

    @Test
    public void testPopReturnsTopElement() {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        int popped = s.pop();
        assertEquals(20, popped, "Pop should return top element");
        assertEquals(1, s.size(), "Size should decrease after pop");
    }

    @Test
    public void testIsEmptyInitially() {
        Stack s = new Stack(3);
        assertTrue(s.isEmpty(), "New stack should be empty");
    }

    @Test
    public void testIsFullAfterPushes() {
        Stack s = new Stack(2);
        s.push(1);
        s.push(2);
        assertTrue(s.isFull(), "Stack should be full after capacity reached");
    }

    @Test
    public void testPushBeyondCapacityThrowsException() {
        Stack s = new Stack(1);
        s.push(10);
        assertThrows(IllegalStateException.class, () -> s.push(20),
                "Pushing beyond capacity should throw exception");
    }

    @Test
    public void testPopFromEmptyThrowsException() {
        Stack s = new Stack(3);
        assertThrows(IllegalStateException.class, s::pop,
                "Popping empty stack should throw exception");
    }

    @Test
    public void testPeekFromEmptyThrowsException() {
        Stack s = new Stack(3);
        assertThrows(IllegalStateException.class, s::peek,
                "Peeking empty stack should throw exception");
    }

    @Test
    public void testSizeAfterMultipleOperations() {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.pop();
        s.push(30);
        assertEquals(2, s.size(), "Size should match number of remaining elements");
    }

    @Test
    public void testSequenceOfPushAndPopMaintainsOrder() {
        Stack s = new Stack(3);
        s.push(5);
        s.push(10);
        s.push(15);
        assertEquals(15, s.pop(), "LIFO order violated");
        assertEquals(10, s.pop(), "LIFO order violated");
        assertEquals(5, s.pop(), "LIFO order violated");
        assertTrue(s.isEmpty(), "Stack should be empty after popping all");
    }

    @Test
    public void testIsEmptyAfterPushAndPop() {
        Stack s = new Stack(2);
        s.push(10);
        s.pop();
        assertTrue(s.isEmpty(), "Stack should be empty after pushing and popping once");
    }
}
