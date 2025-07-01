import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15650 {
    private static StringBuilder sb= new StringBuilder();
    private static int n[];
    private static int a, b;
    private static boolean num[];
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        a= Integer.parseInt(st.nextToken());
        b= Integer.parseInt(st.nextToken());
        num= new boolean[a+1];
        n= new int[b];

        calc(1,0);
        System.out.println(sb);
    }

    private static void calc(int k, int point){
        if(point==b){
            for(int c:n){
                sb.append(c+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=k;i<=a;i++){
            if(!num[i]){
                num[i]= true;
                n[point]=i;
                calc(i,point+1);

                num[i]=false;
            }
        }
    }
}
