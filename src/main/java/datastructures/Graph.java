package datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    private Integer V;
    private LinkedList<Integer>[] adj;

    Graph(Integer v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        adj[i].add(j);
    }

    String breadthFirstSearch(int s) {
        List<Integer> traversed = new ArrayList<>();
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(s);
        visited[s] = true;
        Integer current;
        while (!queue.isEmpty()) {
            current = queue.poll();
            traversed.add(current);
            adj[current].forEach(i -> {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            });
        }
        return traversed.toString();
    }

    String depthFirstSearch(int s, boolean[] visited, List<Integer> result) {
        result.add(s);
        visited[s] = true;

        for (Integer n : adj[s]) {
            if (!visited[n])
                depthFirstSearch(n, visited, result);
        }
        return result.toString();
    }
}
