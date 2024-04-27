import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon14038 {
    public class test {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int count = 0;
            for (int i = 0; i < 6; i++) {
                String str = br.readLine();
                if (str.equals("W")) count++;
            }
            System.out.println(count >= 5 ? "1" : count >= 3 ? "2" : count >= 1 ? "3" : "-1");
        }
    }
}
