import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32801 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        int cnt1= 0;
        int cnt2= 0;
        int cnt3= 0;

        for(int i=1;i<=n;i++){
            if(i%a==0 && i%b==0) cnt1++;
            else if(i%a==0) cnt2++;
            else if(i%b==0) cnt3++;

        }

        System.out.println(cnt2+" "+cnt3+" "+cnt1);
    }
}
