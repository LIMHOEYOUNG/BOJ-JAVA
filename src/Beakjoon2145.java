import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2145 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        calc();
        StringBuilder sb= new StringBuilder();
        int num= 0;

        while((num=Integer.parseInt(br.readLine()))!=0){
            while(true){
                int ans= 0;
                if(num/10==0) break;

                for(int i=1;;i++){
                    if(num/(Math.pow(10,i))==0) break;
                    ans+= num%Math.pow(10,i);
                    num/=Math.pow(10,i);
                }

                num=ans;
            }

            sb.append(num).append("\n");
        }

        System.out.print(sb);

    }

    private static void calc(){
        for(int a=1;a<100000;a++){
            int num= a;
            int compare= a%9!=0?a%9:9;

            //System.out.println(compare);

            while(true){
                int ans= 0;
                if(num/10==0) break;

                for(int i=1;;i++){
                    //int check= Math.pow(10,i);
                    if(num/(Math.pow(10,i))==0) break;
                    ans+= num%Math.pow(10,i);
                    num/=Math.pow(10,i);
                }

                num=ans;

            }

            if(compare!=num){
                System.out.println(a+" diff => compare: "+compare+" num: "+num);
            }
        }
    }
}
