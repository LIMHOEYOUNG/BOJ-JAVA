import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.chrono.MinguoDate;
import java.util.StringTokenizer;

public class Beakjoon2729 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        StringBuilder ans= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());

            //2^80만 해도 값이 9,223,372,036,854,775,807이 되므로 long으로도 불가능
            //BigInteger를 사용해야됨

            BigInteger n1= new BigInteger(st.nextToken(),2);
            BigInteger n2= new BigInteger(st.nextToken(),2);
            n1= n1.add(n2);

            ans.append(n1.toString(2)).append("\n");

            /*
            String[] strs= {st.nextToken(),st.nextToken()};
            int[] str_len= {strs[0].length(), strs[1].length()};
            int max_len= Math.max(str_len[0], str_len[1]);

            if(str_len[0]>str_len[1]) stringUpdate(strs,str_len[0]-str_len[1],1);
            else if(str_len[0]<str_len[1]) stringUpdate(strs,str_len[1]-str_len[0],0);

            boolean check= false;
            for(int i= max_len-1;i>=0;i--){
                //xor
                if(strs[1].charAt(i)==strs[0].charAt(i)) {
                    sb.insert(0,check?1:0);
                    check= (strs[1].charAt(i)!='0');  //0 0 false, 1 1 true
                }
                else{   //0 1
                    if(check){  //+1
                        sb.insert(0,0);
                    }
                    else{   //+0
                        sb.insert(0,1);
                    }
                }

                if(i==0 && check) sb.insert(0,1);
            }

            boolean check_sb= false;
            String check_sb_String= sb.toString();
            for(int i=0;i<check_sb_String.length();i++){
                if(check_sb_String.charAt(i)=='1') check_sb=true;

                if(check_sb) {
                    ans.append(sb.substring(i));
                    break;
                }
            }
            sb.setLength(0);
            if(!check_sb) ans.append(0);
            ans.append("\n");

             */
        }

        System.out.print(ans);
    }

    private static void stringUpdate(String[] strs, int len, int idx){
        String str_zero= "0";
        strs[idx]= str_zero.repeat(len)+strs[idx];
    }
}
/*2
00000000000000000000000000000000000000000000000000000000000000000000000000000001 10000000000000000000000000000000000000000000000000000000000000000000000000000000
11111111111111111111111111111111111111111111111111111111111111111111111111111111 11111111111111111111111111111111111111111111111111111111111111111111111111111111

 */