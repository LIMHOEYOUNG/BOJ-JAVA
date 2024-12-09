import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32684 {
    public static int[] score={13,7,5,3,3,2};
    public static double calcScore(String str){
        double total= 0;
        //차 13, 포7, 마5, 상3, 사3, 졸2
        StringTokenizer st= new StringTokenizer(str);

        for(int i=0;i<score.length;i++){
            total+=score[i]*Double.parseDouble(st.nextToken());
        }

        return total;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        double chuck= calcScore(br.readLine());
        double eun= calcScore(br.readLine())+1.5;

        System.out.println(chuck>eun?"cocjr0208":"ekwoo");
    }
}
