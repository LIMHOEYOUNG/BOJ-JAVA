import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon13458 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2= new StringTokenizer(br.readLine());
        int b= Integer.parseInt(st2.nextToken());
        int c= Integer.parseInt(st2.nextToken());

        long admin= 0;
        for(int i=0;i<n;i++){
            int p= Integer.parseInt(st.nextToken());
            admin++;
            p-=b;

            if(p>0){
                admin+= (p/c)+(p%c>0?1:0);
            }
        }

        System.out.println(admin);
    }
}
