import javax.swing.plaf.InsetsUIResource;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total= 0;

        for(int i=0;i<3;i++){
            total+=Integer.parseInt(br.readLine());
        }

        System.out.println(total<=21?1:0);
    }
}