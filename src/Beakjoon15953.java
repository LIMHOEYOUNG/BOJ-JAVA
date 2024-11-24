import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15953 {
    public static void main (String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        int n= Integer.parseInt(br.readLine());

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int total= 0;

            if(0<a&&a<=1) total+=5000000;
            else if(1<a&&a<=3) total+=3000000;
            else if(3<a&&a<=6) total+=2000000;
            else if(6<a&&a<=10) total+=500000;
            else if(10<a&&a<=15) total+=300000;
            else if(15<a&&a<=21) total+=100000;

            if(0<b&&b<=1) total+=5120000;
            else if(1<b&&b<=3) total+=2560000;
            else if(3<b&&b<=7) total+=1280000;
            else if(7<b&&b<=15) total+=640000;
            else if(15<b&&b<=31) total+=320000;

            sb.append(total+"\n");
        }

        System.out.println(sb);
    }
}
