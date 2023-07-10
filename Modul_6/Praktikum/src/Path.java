import java.util.*;

public class Path{
    private HashMap<Integer, LinkedList<Integer>> adj;

    Path(){
        adj = new HashMap<>();
    }

    void addVertex(int vertex){
        adj.put(vertex, new LinkedList<>());
    }

    void addDirect(int src, int dest){
        if(!adj.containsKey(src)){
            addVertex(src);
        }
        if(!adj.containsKey(dest)){
            addVertex(dest);
        }
        adj.get(src).add(dest);
    }

    void addUnDirect(int src, int dest){
        if(!adj.containsKey(src)){
            addVertex(src);
        }
        if(!adj.containsKey(dest)){
            addVertex(dest);
        }
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    void printAdj(){
        for(int vertex : adj.keySet()){
            System.out.print("Vertex"+vertex+" is connected to: ");
            List<Integer> connected = adj.get(vertex);
            for(int connect : connected ){
                System.out.print(connect+" ");
            }
            System.out.println();
        }
    }

    List<Integer> DFS(int startVertex){
        List<Integer> visited = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(startVertex);

        while (!stack.isEmpty()){
            int currentVertex = stack.pop();
            if(!visited.contains(currentVertex)){
                visited.add(currentVertex);

                List<Integer> adjacent = adj.get(currentVertex);
                for (int neighbor : adjacent){
                    if (!visited.contains(neighbor)){
                        stack.push(neighbor);
                    }
                }
            }
        } return visited;
    }

    List<Integer> BFS (int startVertex){
        List<Integer> visited = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startVertex);

        while (!queue.isEmpty()){
            int currentVertex = queue.poll();

            if(!visited.contains(currentVertex)){
                visited.add(currentVertex);

                List<Integer> adjacent = adj.get(currentVertex);
                for (int neighbor : adjacent){
                    if(!visited.contains(neighbor)){
                        queue.offer(neighbor);
                    }
                }
            }
        } return visited;
    }

    public static void main(String[] args) {
        Path graph = new Path();

        //add vertex
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);
        graph.addVertex(8);
        graph.addVertex(9);
        graph.addVertex(10);
        graph.addVertex(11);

        //add Directed edges
        graph.addDirect(1, 4);
        graph.addDirect(4, 6);
        graph.addDirect(5, 3);
        graph.addDirect(5, 7);
        graph.addDirect(8, 11);
        graph.addDirect(11,10);

        //add Unidrected edges
//        graph.addEdgeDirect(1, 2);
//        graph.addEdgeDirect(2, 5);
//        graph.addEdgeDirect(5, 9);
//        graph.addEdgeDirect(6, 7);
//        graph.addEdgeDirect(9, 8);
//        graph.addEdgeDirect(7, 11);

        graph.addUnDirect(1, 2);
        graph.addUnDirect(2, 5);
        graph.addUnDirect(5, 9);
        graph.addUnDirect(6, 7);
        graph.addUnDirect(9, 8);
        graph.addUnDirect(7, 11);

        graph.printAdj();
        List<Integer> bfs = graph.BFS(1);
        System.out.println("BFS Traversal: " + bfs);

        List<Integer> dfs = graph.DFS(1);
        System.out.print("DFS Traversal: " + dfs);

    }
}
