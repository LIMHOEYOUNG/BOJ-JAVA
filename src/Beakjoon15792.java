import java.io.*;
import java.math.*;
import java.util.*;

public class Beakjoon15792 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        System.out.println(new BigDecimal(st.nextToken()).divide(new BigDecimal(st.nextToken()),1001, RoundingMode.DOWN));
    }

}
