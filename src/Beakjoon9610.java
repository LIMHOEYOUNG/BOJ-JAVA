import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9610 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int q1= 0;
        int q2= 0;
        int q3= 0;
        int q4= 0;
        int axis= 0;

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());

            if(x==0 || y==0) axis++;
            else if(x>0&&y>0) q1++;
            else if(x<0&&y>0) q2++;
            else if(x<0&&y<0) q3++;
            else q4++;
        }

        System.out.println("Q1: "+q1+"\nQ2: "+q2+"\nQ3: "+q3+"\nQ4: "+q4+"\nAXIS: "+axis);
    }
}
