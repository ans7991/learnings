package datastructures;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class GraphTest {

    @Test
    public void breadthFirstSearch() {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(2, 0);

        Assert.assertEquals("[0, 1, 2, 3]", graph.breadthFirstSearch(0));
        Assert.assertEquals("[1, 2, 3, 0]", graph.breadthFirstSearch(1));

        Assert.assertEquals("[0, 1, 2, 3]", graph.depthFirstSearch(0, new boolean[4], new ArrayList<>()));
    }
}