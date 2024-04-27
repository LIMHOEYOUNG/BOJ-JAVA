import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Beakjoon1977 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int m= Integer.parseInt(br.readLine());

        //ArrayList<Integer> num = new ArrayList<Integer>();
        boolean flag = true;
        int min=0;
        int sum=0;
        for(int i=1;i<=100;i++){
            int num = i*i;
            if(n<=num && num<=m){
                if(flag){
                  min = num;
                  flag=false;
                }
                sum+=num;

            }
        }
        if(flag) System.out.println(-1);
        else System.out.println(sum+"\n"+min);
    }
}
