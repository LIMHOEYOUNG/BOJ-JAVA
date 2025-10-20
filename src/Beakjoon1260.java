import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Queue;
import java.util.LinkedList;

public class Beakjoon1260 {
    //private static HashMap<Integer, ArrayList<Integer>> node= new HashMap<>();
    private static HashMap<Integer, TreeSet<Integer>> node = new HashMap<>();
    private static StringBuilder sb = new StringBuilder();
    private static int dfs_cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());


        boolean[] passNode = new boolean[n + 1];
        //ArrayList<int[]>node= new ArrayList<>();


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int node_val = Integer.parseInt(st.nextToken());
            int connect_node = Integer.parseInt(st.nextToken());

            //node.computeIfAbsent(node_val, connect_nodes-> new ArrayList<>()).add(connect_node);
            //node.computeIfAbsent(node_val, connect_nodes-> new ArrayList<>()).add(!node.get(connect_node).contains(connect_node)?connect_node:null);
            //node.computeIfAbsent(connect_node, connect_nodes-> new ArrayList<>()).add(!node.get(node_val).contains(node_val)?node_val:null);
            node.computeIfAbsent(node_val, connect_nodes -> new TreeSet<>()).add(connect_node);
            node.computeIfAbsent(connect_node, connect_nodes -> new TreeSet<>()).add(node_val);
        }

        /*
        for (Map.Entry<Integer, TreeSet<Integer>> val : node.entrySet()) {
            System.out.println(val.getKey() + " => " + val.getValue());
        }
         */

        //sb.append("dfs => ");
        dfs(passNode, v);

        Arrays.fill(passNode, false);
        //sb.append("\nbfs => ");
        sb.append("\n");
        bfs(passNode, v);

        System.out.println(sb);
    }


    private static void dfs(boolean[] passNode, int v) {
        if (dfs_cnt == (passNode.length - 1)) return;
        //System.out.println(sb);
        //System.out.println("v = "+v+" check = "+passNode[v]+" dfs_cnt = "+dfs_cnt+" passNode.length = "+(passNode.length-1));

        if (!passNode[v]) {

            sb.append(v).append(" ");
            passNode[v] = true;
            dfs_cnt++;

            if (node.get(v) != null) {
                //System.out.println(node.get(v)+" size => "+node.get(v).size());

                for (int child_node : node.get(v)) {
                    dfs(passNode, child_node);

                }
            }
        }

    }


    private static void bfs(boolean[] passNode, int v) {
        Queue<Integer> child_nodes= new LinkedList<>();
        child_nodes.add(v);
        sb.append(v).append(" ");
        passNode[v]= true;

        while(!child_nodes.isEmpty()){
            int child_node= child_nodes.poll();

            if(node.get(child_node)!=null){
                for(int check_node:node.get(child_node)){
                    if(!passNode[check_node]){
                        sb.append(check_node).append(" ");
                        passNode[check_node]= true;
                        child_nodes.offer(check_node);
                    }
                }
            }
        }
    }
}
