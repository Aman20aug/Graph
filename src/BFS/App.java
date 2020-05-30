package BFS;

import DFS.DFS;
import DFS.Vertex;

public class App {
    public static void main(String[] args) {
        Vertex v1=new Vertex(1);
        Vertex v2=new Vertex(2);
        Vertex v3=new Vertex(3);
        Vertex v4=new Vertex(4);

        v1.addNeighbours(v3);
        v1.addNeighbours(v2);
        v2.addNeighbours(v4);

        BFS bfs=new BFS();
        bfs.normalBFS(v1);

    }

}
