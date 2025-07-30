import java.io.*;

public class Beakjoon14626 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        int sum= 0;
        int a= str.charAt(str.length()-1)-'0';

        calc(str,sum,a==0?0:(10-a));
    }

    private static void calc(String str, int sum, int a){
        int x= 1;
        for (int i = 0; i < str.length()- 1; i++) {
            char c = str.charAt(i);
            if (c=='*') {
                x = (i % 2 == 0 ? 1 : 3);
            } else {
                sum += (i % 2 == 0 ? 1 : 3) * (c - '0');
            }
        }

        for(int i=0;i<10;i++){
            if(a==(sum+x*i)%10){
                System.out.println(i);
                break;
            }
        }
    }
}
