import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    private static boolean visit_dfs[];
    private static boolean visit_bfs[];
    private static int g[][];
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int v= Integer.parseInt(st.nextToken());

        visit_dfs= new boolean[n+1];
        visit_bfs= new boolean[n+1];
        g= new int[n+1][];

        //경로 저장
        for(int i=1;i<g.length;i++){
            String str= br.readLine().trim();

            if(!str.isEmpty()){
                String[] nodes= str.split(" ");

                g[i]= new int[nodes.length];
                for(int j=0;j<nodes.length;j++){
                    int node= Integer.parseInt(nodes[j]);
                    g[i][j]= node;
                }
            }
        }

        dfs(v);
        System.out.println();
        bfs(v);

    }

    public static void dfs(int v){
        visit_dfs[v]= true;
        int min_v= Integer.MAX_VALUE;

        //System.out.print(v+" ");

        for(int n:g[v]){
            System.out.println(n+" = "+visit_dfs[n]+" "+(Arrays.toString(g[v])));

            if(!visit_dfs[n]){
                min_v= Math.min(min_v,n);
            }
            //System.out.println(min_v);
        }

        if(min_v!=Integer.MAX_VALUE) dfs(min_v);

    }

    public static void bfs(int start_v){

    }
}

//1463, 토마토 다른 풀이로 가능 다시
/*
5 5 1
2 3 4
1 2
1 5
2
5 2
 */
