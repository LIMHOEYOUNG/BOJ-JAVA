import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Beakjoon30457 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int person[]= new int[1001];    //1001명
        StringTokenizer st= new StringTokenizer(br.readLine());

        //같은 키 배제
        for(int i=0;i<n;i++){
            person[Integer.parseInt(st.nextToken())]++; //동일한 키가 몇 명 있는지 확인
        }

        int answer=0;

        for(int i=0;i< person.length;i++){
            answer+= Math.min(person[i],2); //같은 키 3명이상 존재 불가
        }

        System.out.println(answer);
    }
}
