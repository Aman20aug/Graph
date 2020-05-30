package DFS;

import java.util.Stack;

public class DFS {

   public void DFS(Vertex root){
       Stack<Vertex> stack=new Stack<Vertex>();
       stack.add(root);
       while(!stack.isEmpty()){
        Vertex actualVertex=stack.pop();
        System.out.println(actualVertex.getData());
        for(Vertex child:actualVertex.getNeigbourVertex()){
            if(!child.isVisited()){
                stack.push(child);
                child.setVisited(true);
            }
        }
       }
    }

    public void recurssiveDFS(Vertex root){
       root.setVisited(true);
       System.out.println(root.getData());
       for(Vertex vertex:root.getNeigbourVertex()){
           if(!vertex.isVisited()){
               recurssiveDFS(vertex);
           }
       }

    }

}
