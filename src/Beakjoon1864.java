import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1864 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        StringBuilder sb= new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str.equals("#")) break;

            int num=0;
            for(int i=0;i<str.length();i++){
                //System.out.println(str+" => i = "+(str.length()-i-1));
                char c= str.charAt(i);
                switch (c){
                    case '-':
                        //num=0;
                        num+=translateOctal(0,(str.length()-i-1));
                        break;
                    case '\\':
                        //num=1;
                        num+=translateOctal(1,(str.length()-i-1));
                        break;
                    case '(':
                        //num=2;
                        num+=translateOctal(2,(str.length()-i-1));
                        break;
                    case '@':
                        //num=3;
                        num+=translateOctal(3,(str.length()-i-1));
                        break;
                    case '?':
                        //num=4;
                        num+=translateOctal(4,(str.length()-i-1));
                        break;
                    case '>':
                        //num=5;
                        num+=translateOctal(5,(str.length()-i-1));
                        break;
                    case '&':
                        //num=6;
                        num+=translateOctal(6,(str.length()-i-1));
                        break;
                    case '%':
                        //num=7;
                        num+=translateOctal(7,(str.length()-i-1));
                        break;
                    case '/':
                        //num=-1;
                        num-=translateOctal(1,(str.length()-i-1));
                        break;
                }
            }
//            System.out.println("num = "+num);
//            System.out.println("translate = "+(Integer.valueOf(num,8)));
            sb.append(num+"\n");
        }

        System.out.println(sb);
    }

    public static long translateOctal(int n, int i){
        long result=0;

        result = n*(long)Math.pow(8,i);

        return result;
    }
}
