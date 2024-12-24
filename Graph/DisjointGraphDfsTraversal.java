package Graph;

import java.util.ArrayList;

public class DisjointGraphDfsTraversal {
    static class edge{
        int src;
        int dest;
        int wt;
        public edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void dfs(ArrayList<edge>[] graph){
        boolean[] vis=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            dfsUtil(graph,i,vis);
        }
    }
    public static void dfsUtil(ArrayList<edge>[] graph,int curr,boolean[] vis){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
        }
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<edge>[] graph=new ArrayList[v];
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //0-vertex
        graph[0].add(new edge(0,1,5));
        //1-vertex
        graph[1].add(new edge(1,0,5));
        graph[1].add(new edge(1,2,1));
        graph[1].add(new edge(1,3,3));
        //2-vertex
        graph[2].add(new edge(2,1,1));
        graph[2].add(new edge(2,3,1));
        graph[2].add(new edge(2,4,2));
        //3-vertex
        graph[3].add(new edge(3,2,1));
        graph[3].add(new edge(3,1,3));
        //4-vertex
        graph[4].add(new edge(4,2,2));
        dfs(graph);
    }
}
