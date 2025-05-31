import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon2484 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int max=0;

        while(n-->0){
            int total=0;
            StringTokenizer st= new StringTokenizer(br.readLine());
            int num[]= {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
            Arrays.sort(num);

            if(num[0]==num[1] && num[1]==num[2] && num[2]==num[3]){
                total= 50000+num[0]*5000;
            }
            else if(num[0]==num[1] && num[1]==num[2]){
                total= 10000+num[0]*1000;
            }
            else if(num[1]==num[2] && num[2]==num[3]){
                total= 10000+num[3]*1000;
            }
            else if(num[0]==num[1] && num[2]==num[3]){
                total= 2000+num[0]*500+num[2]*500;
            }
            else if(num[0]==num[1]){
                total= 1000+num[0]*100;
            }
            else if(num[1]==num[2]){
                total= 1000+num[1]*100;
            }
            else if(num[2]==num[3]){
                total= 1000+num[2]*100;
            }
            else{
                total= num[3]*100;
            }

            max= Math.max(max,total);
        }

        System.out.println(max);
    }
}