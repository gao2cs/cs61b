package synthesizer;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void testArrayRingBufferIterator() {
        ArrayRingBuffer<Integer> arb = new ArrayRingBuffer<>(10);
        arb.enqueue(2);
        arb.enqueue(1);
        arb.dequeue();
        arb.enqueue(3);
        arb.enqueue(5);
        arb.enqueue(7);
        for (Integer i: arb) {
            System.out.println(i);
        }
    }

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
} 
