package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsGraph {
    static class edge{
        int src;
        int desti;
        int wght;
        edge(int src,int desti,int wght){
            this.src=src;
            this.desti=desti;
            this.wght=wght;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();;
        }
        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,1));

        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));

        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,4,1));
        graph[3].add(new edge(3,5,1));

        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));

        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));
        graph[5].add(new edge(5,6,1));

        graph[6].add(new edge(6,5,1));
    }
    public static void bfs(ArrayList<edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean []vis=new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    q.add(e.desti);
                }
            }
        }
    }
    public static void dfs(ArrayList<edge> []graph,int curr,boolean[] vis){
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i< graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.desti]){
                dfs(graph,e.desti, vis);
            }
        }
    }
    public static boolean hasPath(ArrayList<edge>[] graph,int src,int desti,boolean vis[]){
        if(src==desti){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            edge e=graph[src].get(i);
            if(!vis[e.desti]&&hasPath(graph,e.desti,desti,vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<edge> []graph=new ArrayList[V];
        createGraph(graph);
        bfs(graph);
        System.out.println();
        dfs(graph,0,new boolean[V]);
        System.out.println();
        System.out.println(hasPath(graph,0,5,new boolean[V]));
    }
}
