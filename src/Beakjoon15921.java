import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon15921 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        // "연습 기록들의 평균값"하고 "연습 기록들 중 하나를 균일한 확률로 뽑을 때의 기댓값"은 같은 말
        System.out.println(n!=0?"1.00":"divide by zero");
    }
}
