import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2476 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int answer=0;

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            int award=0;
            if((num1==num2)&&(num2==num3)) award= 10000+num1*1000;
            else if(((num1==num2)&&(num2!=num3)) || ((num1==num3)&&(num2!=num3)) || ((num2==num3)&&(num1!=num3))) award= 1000+(num1==num2?num1:num3)*100;
            else award= Math.max(Math.max(num1,num2),num3)*100;

            System.out.println(award);
            answer = Math.max(answer,award);
        }

        System.out.println(answer);
    }
}
