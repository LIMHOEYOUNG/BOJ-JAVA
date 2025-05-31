import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Beakjoon4796 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        //StringTokenizer check= new StringTokenizer("0 0 0");
        //StringTokenizer st= new StringTokenizer(br.readLine());
        int t= 1;
        String str= "";

        while(true){
            //System.out.println(!st.equals(check));
            StringTokenizer st= new StringTokenizer(br.readLine());
            long cnt= 0;
            long day= 0;
            int l= Integer.parseInt(st.nextToken());
            int p= Integer.parseInt(st.nextToken());
            int v= Integer.parseInt(st.nextToken());
            if(l==0 && p==0 && v==0) break;

            while(true){
                if((day+p)>=v){
                    //System.out.println("last add value = "+(Math.min(l,((day+p)-v)))+" first value = "+l+" second value = "+(v-day));
                    cnt+= Math.min(l,(v-day));
                    break;
                }
                cnt+=l;
                day+=p;

                //System.out.println(t+" => "+cnt+" day = "+day);
            }


            sb.append("Case "+t+": "+cnt+'\n');
            t++;
            //st= new StringTokenizer(br.readLine());
        }

        System.out.print(sb);
    }
}
/*
1292473295
1292473295
93636321208
 */