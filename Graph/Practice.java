package Graph;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int v=5;
        // adj matrix
        // space required v*v
        int [][] graph=new int[v][v];

        graph[0][1]=1;
        graph[0][4]=1;

        graph[1][2]=1;
        graph[1][3]=1;
        graph[1][4]=1;

        graph[2][1]=1;
        graph[2][3]=1;

        graph[3][1]=1;
        graph[3][4]=1;
        graph[3][2]=1;

        graph[4][1]=1;
        graph[4][0]=1;

        // adj list
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1);
        adjList.get(0).add(4);

        adjList.get(1).add(2);
        adjList.get(1).add(3);
        adjList.get(1).add(4);

        adjList.get(2).add(1);
        adjList.get(2).add(3);

        adjList.get(3).add(1);
        adjList.get(3).add(4);
        adjList.get(3).add(2);

        adjList.get(4).add(1);
        adjList.get(4).add(0);

        //Dfs :- it is a traversal technique start from any node and goes to it neigbhour node

        int startNode=1;
        Stack<Integer> s=new Stack<>();
        int []vis=new int[v];
        s.push(startNode);
        while(s.size()>0){
            int curr=s.pop();

            if(vis[curr]!=1){
                System.out.print(curr+" ");
                vis[curr]=1;
                List<Integer> currN=adjList.get(curr);
                for(int i=0;i<currN.size();i++){
                    if(vis[currN.get(i)]!=1){
                        s.add(currN.get(i));
                    }
                }
            }

        }
        System.out.println();
        System.out.println("=========================================================");

        // Bfs
        boolean[] visited=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        int start=0;
        q.add(start);
        while(!q.isEmpty()){
            int curr= q.remove();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                List<Integer> c=adjList.get(curr);
                for(int i=0;i<c.size();i++){
                    q.add(c.get(i));
                }
            }
        }




    }
}
