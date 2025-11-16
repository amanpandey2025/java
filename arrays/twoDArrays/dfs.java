package arrays.twoDArrays;

import java.util.*;

public class dfs {
    private LinkedList<Integer>[] adj; // adjacency list (graph connection store karne ke liye)
    private boolean[] visited;        // visited array (kis node ko visit kiya, track karta hai)
    private int vertices;             // total number of nodes

    dfs(int v) {
        vertices = v;
        adj = new LinkedList[v];
        visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // edge add karne ka function
    void addEdge(int src, int dest) {
        adj[src].add(dest);
        // agar graph undirected hai to ye line bhi uncomment karo:
        // adj[dest].add(src);
    }

    // DFS function
    void DFS(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                DFS(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        dfs graph = new dfs(5);

        // connections banao
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("DFS traversal starting from node 0:");
        graph.DFS(0);
    }
}
