package datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void shouldInsertNewNode() {
        LinkedList list = new LinkedList();
        list.insert(5);
        assertEquals(5, list.head.data);
    }

    @Test
    public void shouldSearchForElement() {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(10);
        list.insert(3);

        assertEquals(6, list.search(6).data);
        assertEquals(null, list.search(16));
    }

    @Test
    public void shouldDeleteElementFromList() {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(10);
        list.insert(3);

        list.delete(10);
        list.delete(3);

        assertEquals(6, list.head.data);
        assertEquals(null, list.search(10));
        assertEquals(null, list.search(3));

    }
}