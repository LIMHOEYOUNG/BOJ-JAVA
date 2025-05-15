import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon7572 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int y= (Integer.parseInt(br.readLine())-1)%60;
        int f[]={7,8,9,0,1,2,3,4,5,6};
        //ABCDEFGHIJKL
        String b[]={"J","K","L","A","B","C","D","E","F","G","H","I"};
        //System.out.println(y+" "+f.length+" "+b.length);
        System.out.println(b[y%(b.length)]+""+f[y%(f.length)]);
    }
}
