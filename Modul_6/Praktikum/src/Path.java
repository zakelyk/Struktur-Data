import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Path {
    private LinkedList<Integer>[] adj;
    private int node;
    private boolean visited[];
    private Queue<Integer> que;
    public Path(int vertex){
        node = vertex;
        adj = new LinkedList[node];
        visited = new boolean[vertex];
        for(int i=0;i < vertex; i++){
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<>();
    }

    void addEdge(int src, int dest){
        adj[src].add(dest);
    }

    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> it = adj[v].listIterator();
        while(it.hasNext()){
            int n = it.next();
            if(!visited[n])
                DFSUtil(n, visited);
        }
    }

    void connectedComponents() {
        boolean[] visited = new boolean[node];

        for (int v = 0; v < node; ++v) {
            if (!visited[v]) {
                DFSUtil(v, visited);
                System.out.println();
            }
        }
    }

    void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while(it.hasNext()){
            int n = it.next();
            if(!visited[n])
                DFS(n);
        }
    }

    void BFS(int n){
        boolean nodes[] = new boolean[node];
        int a=0;
        nodes[n]=true;
        que.add(n);
        while ((que.size() != 0)){
            n =que.poll();
            System.out.print(n+" ");
            for(int i = 0; i < adj[n].size();i++){
                a=adj[n].get(i);
                if (!nodes[a]){
                    nodes[a]=true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        Path graph = new Path(12);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,1);
        graph.addEdge(2,5);
        graph.addEdge(4,6);
        graph.addEdge(5,2);
        graph.addEdge(5,3);
        graph.addEdge(5,7);
        graph.addEdge(5,9);
        graph.addEdge(6,7);
        graph.addEdge(7,6);
        graph.addEdge(7,11);
        graph.addEdge(9,5);
        graph.addEdge(9,8);
        graph.addEdge(8,9);
        graph.addEdge(8,11);
        graph.addEdge(11,10);
        graph.addEdge(11,7);

        graph.connectedComponents();
    }

}
