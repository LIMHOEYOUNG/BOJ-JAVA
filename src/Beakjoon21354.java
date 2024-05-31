import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon21354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //사과의 가격은 7 스웨덴 크로나이며, 배의 가격은 13 스웨덴 크로나
        // "Axel"과 "Petra" 중 돈을 더 많이 번 사람의 이름. 둘이 같은 금액을 팔았다면, "lika"를 출력합니다.
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken())*7;
        int p= Integer.parseInt(st.nextToken())*13;

        System.out.println(a>p?"Axel":a==p?"lika":"Petra");
    }
}
