import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon17224 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int l= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        int[] solved_p= new int[2];

        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());
            int sub1= Integer.parseInt(st.nextToken());
            int sub2= Integer.parseInt(st.nextToken());

            if(sub2<=l) solved_p[1]+=1;
            else if(sub1<=l) solved_p[0]+=1;
        }

        //System.out.println(solved_p[0]+" "+solved_p[1]);
        System.out.println((140*Math.min(solved_p[1],k)+ 100*(solved_p[1]>=k?0:Math.min(solved_p[0],k-solved_p[1]))));
    }
}