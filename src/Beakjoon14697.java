import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14697 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(st.nextToken());

        boolean check= false;

        for(int i=0;i<=n/a;i++){
            for(int j=0;j<=n/b;j++){
                for(int k=0;k<=n/c;k++){
                    if(a*i+b*j+c*k==n){
                        //System.out.println(i+" "+j+" "+k);
                        check=true;
                        break;
                    }
                }
                if(check) break;
            }
            if(check) break;
        }

        System.out.println(check?1:0);
    }
}
