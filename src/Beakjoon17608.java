import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Beakjoon17608 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        Stack<Integer> stick= new Stack<Integer>();

        stick.push(Integer.parseInt(br.readLine()));

        for(int i=0;i<n-1;i++){
            int t= Integer.parseInt(br.readLine());

            while(true){
                int check= stick.pop();
                if(t==check){
                    stick.push(t);
                    break;
                }
                else if(t<check){
                    stick.push(check);
                    stick.push(t);
                    break;
                }
                else if(stick.isEmpty()){
                    stick.push(t);
                    break;
                }
            }

            //System.out.println(stick);
        }

        System.out.println(stick.size());
    }
}
