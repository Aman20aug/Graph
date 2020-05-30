package DFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int data;
    private boolean isVisited;
    private List<Vertex> neigbourVertex;

   public Vertex(int data){
       this.data=data;
       this.neigbourVertex=new ArrayList<Vertex>();
   }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertex> getNeigbourVertex() {
        return neigbourVertex;
    }

    public void setNeigbourVertex(List<Vertex> neigbourVertex) {
        this.neigbourVertex = neigbourVertex;
    }

    public void addNeighbours(Vertex vertex){
        this.neigbourVertex.add(vertex);
    }





}
