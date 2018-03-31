package datastructures;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void pushAndPop() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        Assert.assertEquals(30, stack.pop());
        Assert.assertEquals(20, stack.pop());

        stack.push(55);

        Assert.assertEquals(55, stack.pop());
    }
}