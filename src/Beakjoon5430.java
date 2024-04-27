import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Beakjoon5430 {

    public static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());

        while(t-->0){
            String p= br.readLine();
            int n= Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine(),"[],");

            Deque<Integer> deque= new LinkedList<Integer>();
            for(int i=0;i<n;i++){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            Ac(p,deque);
        }

        System.out.println(sb);
    }

    public static void Ac(String p, Deque<Integer>deque){
        boolean rev= false;
        for(char order:p.toCharArray()){
            if(order=='R') {
                //System.out.println("order == R");
                rev = !rev;
            }
            else{
                if(deque.size()==0) {
                    //System.out.println("error진행");
                    sb.append("error\n");
                    return;
                }
                if(rev) deque.removeLast();
                else deque.removeFirst();
            }
        }
        ans(deque, rev);
    }

    public static void ans(Deque<Integer>deque, boolean rev){
        sb.append("[");

        if(deque.size()!=0) {
            if (rev) {
                sb.append(deque.removeLast());
                while (!deque.isEmpty()) {
                    sb.append("," + deque.removeLast());
                }
            } else {
                sb.append(deque.removeFirst());
                while (!deque.isEmpty()) {
                    sb.append("," + deque.removeFirst());
                }
            }
        }
        sb.append("]\n");
    }
}

/*
2
D
0
[]
R
0
[]

4
RDD
4
[1,2,3,4]
DD
1
[42]
RRD
5
[1,1,2,3,5,8]
D
0
[]

 */