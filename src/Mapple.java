import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mapple {
    public static void main(String[] args) throws Exception {
        int n = nextInt(), r = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = nextInt();
        for (int i = 0; i < n; i++) {
            int a = nextInt(), b = nextInt();
            if (arr[i] == 1 && b > a) r += b - a;
        }
        System.out.println(r);
    }

    static int nextInt() throws Exception {
        int c, r = 0;
        while ((c = System.in.read()) > 47){
            r = r * 10 + c - 48;
            System.out.print("c =>"+c+" r =>"+r+" |");
        }
        System.out.println(r);
        return r;
    }
}
