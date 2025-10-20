import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon16483 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        long t= (Long.parseLong(br.readLine())*10)/2;

        System.out.println(((long)(Math.pow(t,2))/100));
    }
}
/*
int t= (Integer.parseInt(br.readLine())*10)/2;
int a= (int)Math.pow(((double)t/10),2);
int b= (int)Math.pow((t%10),2);

System.out.println((a+(b>=45?1:0)));


9295
46475
4647.5
2.159925625E7
21599256
25
21599256
==================
46475
2.159925625E9
21474836
==================
46475
21474836

 */
