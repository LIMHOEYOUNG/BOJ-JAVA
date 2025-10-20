import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon16283 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(st.nextToken());
        int w= Integer.parseInt(st.nextToken());

        boolean check= false;
        int ans_a= 0;
        int ans_b= 0;

        for(int i=1;i<n;i++){
            if(a*i+b*(n-i)==w){
                if(!check){
                    check= true;
                    ans_a= i;
                    ans_b= n-i;
                }
                else{
                    check= false;
                    break;
                }
            }
        }

        System.out.println(check?(ans_a+" "+ans_b):-1);
    }
}