import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15781 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());
        StringTokenizer st2= new StringTokenizer(br.readLine());

        long helmet= Integer.MIN_VALUE;
        long flakJacket= Integer.MIN_VALUE;

        for(int i=0;i<(Math.max(n,m));i++){
            if(st.hasMoreTokens()){
                helmet= Math.max(helmet,Integer.parseInt(st.nextToken()));
            }
            if(st2.hasMoreTokens()){
                flakJacket= Math.max(flakJacket,Integer.parseInt(st2.nextToken()));
            }
        }

        System.out.println((helmet+flakJacket));
    }
}
