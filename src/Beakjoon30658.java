import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Beakjoon30658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        Stack<Integer> sk= new Stack<>();

        int n= Integer.parseInt(br.readLine());
        while(n!=0){
            sk.push(0);

            for(int i=0;i<n;i++){
                sk.push(Integer.parseInt(br.readLine()));
            }

            while(!sk.isEmpty()){
                sb.append(sk.pop()+"\n");
            }

            n= Integer.parseInt(br.readLine());
        }

        System.out.println(sb);
    }
}