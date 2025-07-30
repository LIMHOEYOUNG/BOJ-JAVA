import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6679 {
    private static StringBuilder sb= new StringBuilder();
    private static int convert_digit[]= {10,12,16};
    public static void main(String[] args)throws IOException {
        for(int i=1000;i<=9999;i++){
            calc(i);
        }

        System.out.print(sb);

        //test_print();
    }

    private static void calc(int n){
        int check= 0;
        boolean a= true;

        for(int i=0;i<convert_digit.length;i++){
            String num= Integer.toString(n,convert_digit[i]);
            int ans= 0;

            for(int j=0;j<num.length();j++){
                ans+= Character.digit(num.charAt(j),convert_digit[i]);
            }

            if(ans!=check && i!=0){
                a= false;
                break;
            }

            check= ans;
        }

        if(a) sb.append(n).append("\n");
    }

    private static void test_print(){
        int a= 9929;

        for(int i : convert_digit){
            String n= Integer.toString(a,i);
            System.out.println(i+"진수를 10진수로 변환");
            int t= 0;

            for(int j=0;j<n.length();j++){
                System.out.println(n.charAt(j)+" => "+Character.digit(n.charAt(j),i));
                t+= Character.digit(n.charAt(j),i);
            }

            System.out.println("변환 => "+t);
        }

    }
}
