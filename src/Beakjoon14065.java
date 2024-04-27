import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon14065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        double x= Double.parseDouble(br.readLine());
        // l갤런 3.785411784리터
        // 1마일 1609.344미터
        // x = 갤런당 마일 수
        // output =  100km당 소비하는 리터 수

        System.out.println(String.format("%.6f",100/((1.609344/3.785411784)*x)));
    }
}
