import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2991 {
    public static int a,b,c,d;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        a= Integer.parseInt(st.nextToken());
        b= Integer.parseInt(st.nextToken());
        c= Integer.parseInt(st.nextToken());
        d= Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());

        System.out.println(check(Integer.parseInt(st.nextToken()))+"\n"+check(Integer.parseInt(st.nextToken()))+"\n"+check(Integer.parseInt(st.nextToken())));
    }

    private static int check(int target){
        int ans=0;

        if((target%(a+b)!=0)&&(target%(a+b)<=a)) ans++;
        if((target%(c+d)!=0)&&(target%(c+d)<=c)) ans++;

        return ans;
    }
}
