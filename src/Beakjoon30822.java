import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon30822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        //uospc
        int u= 0;
        int o= 0;
        int s= 0;
        int p= 0;
        int c= 0;

        for(int i=0;i<n;i++){
            char alpha= str.charAt(i);

            if(alpha=='u') u++;
            if(alpha=='o') o++;
            if(alpha=='s') s++;
            if(alpha=='p') p++;
            if(alpha=='c') c++;
        }

        System.out.println(Math.min(u,Math.min(o,Math.min(s,Math.min(p,c)))));
    }
}
