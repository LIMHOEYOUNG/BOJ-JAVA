import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Beakjoon25175 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        /*
        String str =br.readLine();
        int a= p1(new StringTokenizer(str));
        int b= p2(new StringTokenizer(str));
        if(a!=b){
            System.out.println(str);
            System.out.println(a+" "+b);
        }


        */
        for(int n=100000;n>=1;n--){
            System.out.println("start = "+n);
            for(int m=1;m<=n;m++){
                for(int k=-1000;k<=1000;k++){
                    StringBuilder sb= new StringBuilder(n+" "+m+" "+k);
                    //System.out.println(sb);
                    //StringTokenizer st= new StringTokenizer(sb.toString());
                    int ans1= p1(new StringTokenizer(sb.toString()));
                    int ans2= p2(new StringTokenizer(sb.toString()));
                    if(ans1!=ans2){
                        System.out.println("sb = "+sb);
                        System.out.println(ans1+" "+ans2);
                        return;
                    }
                }
            }
        }


    }


    private static int p1(StringTokenizer st){
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        Deque<Integer> d= new ArrayDeque<>();

        if(n==1){
            return n;
        }

        for(int i=1;i<=2;i++){
            d.addFirst((m-i<=0?(n+(m-i)):m-i));
        }
        int cnt= m-1;
        for(int i=0;i<n-2;i++){
            cnt++;
            d.add(cnt);
            cnt%=n;
        }

        int ans =0;
        if(k<=0){
            for(int i=k;i<=0;i++){
                ans= d.pollLast();
                d.addFirst(ans);
            }

            /*
            for(int tmp:d){
                System.out.print(tmp+" ");
            }
            System.out.println();

             */
        }
        else{
            for(int i=0;i<k;i++){
                ans= d.pop();
                d.add(ans);
            }
        }

        return ans;
    }

    private static int p2(StringTokenizer st){
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        int idx= 3;

        for(;;){
            if(k==idx) break;
            else if(idx<k){
                m++;
                idx++;

                if(m>n){
                    m=1;
                }
            }
            else{
                m--;
                idx--;
                if(m<1){
                    m= n;
                }
            }
        }

        return m;
    }
}
