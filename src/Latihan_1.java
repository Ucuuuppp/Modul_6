
import java.util.LinkedList;
import java.util.Queue;

public class Latihan_1 {
    private int node;
    private LinkedList<Integer>[] adj;
    private Queue<Integer> queue;

    public Latihan_1(int v) {
        node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<>();
    }

    public void insertEdge(int v, int w) {
        adj[v].add(w);
    }

    public void BFS(int startNode) {
        boolean[] visited = new boolean[node];
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int n = queue.poll();
            System.out.print(n + " ");

            for (int neighbor : adj[n]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Latihan_1 graph = new Latihan_1(6);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(0, 4);
        graph.insertEdge(4, 5);
        graph.insertEdge(3, 5);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 0);
        graph.insertEdge(2, 1);
        graph.insertEdge(4, 1);
        graph.insertEdge(3, 1);
        graph.insertEdge(5, 4);
        graph.insertEdge(5, 3);

        System.out.println("Breadth First Traversal for the graph is:");
        graph.BFS(0);
    }
}