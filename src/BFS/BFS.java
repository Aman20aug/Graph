package BFS;

import DFS.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void normalBFS(Vertex root){
        Queue<Vertex> queue=new LinkedList<>();
        queue.add(root);
        root.setVisited(true);
        while (!queue.isEmpty()){
           Vertex actual= queue.remove();
           System.out.println(actual.getData());
           for(Vertex child:actual.getNeigbourVertex()){
               if(!child.isVisited()){
                   queue.add(child);
                   child.setVisited(true);
               }
           }
        }
    }
}
