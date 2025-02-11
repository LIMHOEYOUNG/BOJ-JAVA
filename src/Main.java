import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());
        int d= Integer.parseInt(br.readLine());
        int p= Integer.parseInt(br.readLine());

        int xCompany= p*a;
        int yCompany= p<=c?b:b+(p-c)*d;


        /*
        기본요금은 B엔이고, 사용량이 C리터 이하라면 요금은 기본요금만 청구된다.
        사용량이 C리터가 넘었을 경우 기본요금 B엔에 더해서 추가요금이 붙는다.
        추가요금은 사용량이 C리터를 넘었을 경우 1리터를 넘었을 때마다 D엔이다.
         */

        //int tmp= p<=c?c*b:b+(p-c)*d;

        //System.out.println("x = "+xCompany+" y = "+tmp);

        //System.out.println(Math.min(xCompany,tmp));
        System.out.println(Math.min(xCompany,yCompany));
    }
}