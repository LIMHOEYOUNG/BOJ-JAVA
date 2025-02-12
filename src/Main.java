import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            double price= Double.parseDouble(br.readLine());
            sb.append("$"+String.format(("%.2f\n"),(price*0.8)));
        }

        System.out.println(sb);
    }
}

/*
$80.00
$47.99
$16.00

$80.00
$47.99
$16.00

 */