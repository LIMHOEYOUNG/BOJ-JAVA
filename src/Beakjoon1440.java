import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1440 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str_time[]= br.readLine().split(":");
        int time[]=new int[3];
        for(int i=0;i<3;i++){
            time[i]=Integer.parseInt(str_time[i]);
        }

        int answer=0;
        for(int h=0;h<3;h++){
            for(int m=0;m<3;m++){
                for(int s=0;s<3;s++){
                    if(h != m && m != s && s != h){
                        if((0<time[h]&&time[h]<13) && (0<=time[m]&&time[m]<60)&& (0<=time[s]&&time[s]<60)) answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
