import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon26495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        StringBuilder sb= new StringBuilder();

        /*\
        // 출력 형식 오류 발생
        String num[]= {
                "0000\n0  0\n0  0\n0  0\n0000",
                "   1\n   1\n   1\n   1\n   1",
                "2222\n   2\n2222\n2   \n2222",
                "3333\n   3\n3333\n   3\n3333",
                "4  4\n4  4\n4444\n   4\n   4",
                "5555\n5   \n5555\n   5\n5555",
                "6666\n6   \n6666\n6  6\n6666",
                "7777\n   7\n   7\n   7\n   7",
                "8888\n8  8\n8888\n8  8\n8888",
                "9999\n9  9\n9999\n   9\n   9"
        };
         */

        // 줄 넘김할때 공백 있으면 안됨 출력형식 오류가 밠갱
        String num[]= {
                "0000\n0  0\n0  0\n0  0\n0000",
                "   1\n   1\n   1\n   1\n   1",
                "2222\n   2\n2222\n2\n2222",
                "3333\n   3\n3333\n   3\n3333",
                "4  4\n4  4\n4444\n   4\n   4",
                "5555\n5\n5555\n   5\n5555",
                "6666\n6\n6666\n6  6\n6666",
                "7777\n   7\n   7\n   7\n   7",
                "8888\n8  8\n8888\n8  8\n8888",
                "9999\n9  9\n9999\n   9\n   9"
        };

        for(int i=0;i<str.length();i++){
            sb.append(num[str.charAt(i)-'0']+"\n\n");
        }

        System.out.println(sb);
    }
}
