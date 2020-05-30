package DFS;

public class App {

    public static void main(String[] args) {
        Vertex v1=new Vertex(1);
        Vertex v2=new Vertex(2);
        Vertex v3=new Vertex(3);
        Vertex v4=new Vertex(4);

        v1.addNeighbours(v3);
        v1.addNeighbours(v2);
        v2.addNeighbours(v4);

        DFS dfs=new DFS();
        System.out.println("Using Stack");
        dfs.normalDFS(v1);
        System.out.println("Using recurrsioin");
       // dfs.recurssiveDFS(v1);
    }





}
