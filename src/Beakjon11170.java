import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjon11170 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int ans= 0;

            for(int i=a;i<=b;i++){
                if(i==0) ans++;
                else{
                    int num= i;
                    while(num!=0){
                        if(num%10==0) ans++;
                        num/=10;
                    }
                }
            }
            sb.append(ans+"\n");
        }


        System.out.println(sb);
    }
}