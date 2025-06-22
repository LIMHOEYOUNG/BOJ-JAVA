import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon2606 {
    private static int ans= -1;
    private static Queue<Integer> q= new LinkedList<>();
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int computer= Integer.parseInt(br.readLine());
        int pairs= Integer.parseInt(br.readLine());

        boolean visited[]= new boolean[computer+1];
        ArrayList<Integer> computers[]= new ArrayList[computer+1];


        for(int i=1;i<=computer;i++){
            computers[i]= new ArrayList<>();
        }

        for(int i=0;i<pairs;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int com1= Integer.parseInt(st.nextToken());
            int com2= Integer.parseInt(st.nextToken());

            computers[com1].add(com2);
            computers[com2].add(com1);
        }

        //check(1,visited,computers);


        q.offer(1);

        while(!q.isEmpty()){
            int point= q.poll();

            if(!visited[point]){
                ans++;
                for(int i=0;i<computers[point].size();i++){
                    int check= computers[point].get(i);
                    q.offer(check);
                }
                visited[point]=true;
            }
        }

        System.out.println(ans);
    }


    /*
    private static void check(int p, boolean visited[], ArrayList<Integer> computers[]){
        if(!visited[p]){
            visited[p]=true;
            ans++;
            for(int i=0;i<computers[p].size();i++){
                if(!visited[computers[p].get(i)]) check(computers[p].get(i),visited,computers);
            }
        }
    }
    */

}
