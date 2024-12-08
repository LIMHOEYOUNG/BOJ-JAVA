import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4690 {
    public static void main(String[] args)throws IOException{
        //trash
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        int b=0, c=0, d=0;
        for(int a=1;a<=100;a++){
            long a3= (long)Math.pow(a,3);
            for(b=2;b<=100;b++){
                for(c=b;c<=100;c++){
                    for(d=c;d<=100;d++){
                        if(a3==(long)(Math.pow(b,3)+Math.pow(c,3)+Math.pow(d,3))) {
                            sb.append("Cube = "+a+", Triple = ("+b+","+c+","+d+")\n");
                        }
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
