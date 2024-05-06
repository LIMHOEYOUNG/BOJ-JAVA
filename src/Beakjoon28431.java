import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Beakjoon28431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> arr = new HashSet<>();

        for(int i=0;i<5;i++){
            int n= Integer.parseInt(br.readLine());

            if(arr.contains(n)) arr.remove(n);
            else arr.add(n);
        }

        Iterator it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
