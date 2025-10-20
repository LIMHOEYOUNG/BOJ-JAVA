import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon18312 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int ans= 0;
        /*
        int ans2= 0;

        boolean check1= false;
        boolean check2= false;
        */
        for(int h=0;h<=n;h++){
            for(int m=0;m<=59;m++){
                for(int s=0;s<=59;s++){
                    if(h%10==k || m%10==k || s%10==k || h/10==k || m/10==k || s/10==k) {
                        //check1= true;
                        ans++;
                    }
                    /*
                    if(Integer.toString(h).contains(Integer.toString(k)) || Integer.toString(m).contains(Integer.toString(k)) || Integer.toString(s).contains(Integer.toString(k))) {
                        check2= true;
                        ans2++;
                    }

                    if(check1!=check2){
                        System.out.println(h+" : "+m+" : "+s+"\n"+check1+" "+check2);
                        return;
                    }
                    check1= false;
                    check2= false;

                     */
                }
            }
        }

        System.out.println(ans);
    }
}
