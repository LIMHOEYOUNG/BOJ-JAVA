import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon11724 {
    private static boolean[] visited;
    private static int[][] graph;
    private static HashMap<Integer, TreeSet<Integer>> node= new HashMap<>();

    //private static StringBuilder sb= new StringBuilder();

    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        visited= new boolean[n+1];
        graph= new int[n+1][n+1];

        for(int i=0;i<m;i++){
            st= new StringTokenizer(br.readLine());
            int node1= Integer.parseInt(st.nextToken());
            int node2= Integer.parseInt(st.nextToken());

            graph[node1][node2]= 1;
            graph[node2][node1]= 1;

            //node.computeIfAbsent(node1, connect_node-> new TreeSet<>()).add(node2);
            //node.computeIfAbsent(node2, connect_node-> new TreeSet<>()).add(node1);
        }

        int ans= 0;

        /*
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                dfs(i);
                ans+=1;
            }
        }
         */
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                dfs(i,n);
                ans+=1;
            }
        }
        System.out.println(ans);
    }

    private static void dfs(int n){
        if(!visited[n]){
            visited[n]= true;
            //sb.append(n).append(" ");

            if(node.get(n)!=null){
                for(int child_node: node.get(n)){
                    if(!visited[child_node]) dfs(child_node);
                }
            }
        }
        else return;
    }

    private static void dfs(int n,int nodes){
        if(!visited[n]){
            visited[n]= true;

            for(int i=1;i<=nodes;i++){
                if(graph[n][i]==1){
                    dfs(i,nodes);
                }
            }
        }
        else return;
    }
}
