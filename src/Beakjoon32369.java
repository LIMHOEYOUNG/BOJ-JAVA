import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32369 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int n= Integer.parseInt(st.nextToken());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        int onionA=1;
        int onionB=1;

        for(int i=0;i<n;i++){
            if(i==0){
                onionA+=a;
                onionB+=b;
            }

            else{
                if(onionA>onionB){
                    onionA+=a;
                    onionB+=b;
                }
                else if(onionA<onionB){
                    onionA+=b;
                    onionB+=a;
                }

                if(onionA==onionB){
                    onionB-=1;
                }
            }
        }

        System.out.println(Math.max(onionA,onionB)+" "+Math.min(onionA,onionB));
    }
}
