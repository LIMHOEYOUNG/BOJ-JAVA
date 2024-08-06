import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st= new StringTokenizer(br.readLine());
        int t1= Integer.parseInt(st.nextToken());
        int m1= Integer.parseInt(st.nextToken());
        int t2= Integer.parseInt(st.nextToken());
        int m2= Integer.parseInt(st.nextToken());

        int ans=0;
        int ans2=0;

        ans=asd(t1,m1,t2,m2);
        ans=ans==1440?0:ans;

        System.out.println(ans+" "+(ans/30));

        /*
        int cnt=0;
        for(int i=0;i<24;i++){
            for(int j=0;j<60;j++){
                for(int k=0;k<24;k++){
                    for(int l=0;l<60;l++){
                        ans= asd(i,j,k,l);
                        ans2= si(i,j,k,l);
                        cnt++;

                        System.out.println(ans + " "+ans2+" cnt="+cnt);
                        if(ans!=ans2){
                            System.out.println("ans = "+ans+" ans2 = "+ans2+" | "+i+" "+j+" "+k+" "+l);
                            return;
                        }
                    }
                }
            }
        }
        */
        /*
        if(t1>t2){
            //ans+=((24-(t1+1))*60+(60-m1))+((t2*60)+m2);
            ans+=((24-(t1+1))*60)+(t2*60);
            if(m1!=m2){
                ans+=m2;
                ans+=(60-m1);
            }
        }

        else if(t1==t2){
            if(m1>m2){
                ans+=((23*60)+(60-m1)+m2);
            }
            else if(m1==m2){
                ans=1440;
            }
            else {
                ans += m2 - m1;
            }
        }

        else{
            ans+=(t2*60+m2)-(t1*60+m1);

        }

        System.out.println(ans+" "+(ans/30));
        */
    }

    private static int asd(int i, int j, int k, int l){
        int ans=0;

        if(i>k){
            ans+=((24-(i+1))*60+(60-j))+(k*60)+l;
        }

        else if(i==k){
            if(j>l){
                ans+=((23*60)+(60-j)+l);
            }
            else if(j==l){
                ans=1440;
            }
            else {
                ans += l - j;
            }
        }

        else{
            ans+=(k*60+l)-(i*60+j);

        }

        return ans;
    }

    private static int si(int i,int j, int k, int l){
        int ans=0;

        ans+=(1440-(i*60+j)+(k*60+l))%1440;

        //ans=ans<0?1440+ans:ans;

        return ans;
    }
}

/*
1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0 0
1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
aeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiou


4
Baha enter
Artem enter
Askar enter
Baha leave
Artem enter
aaa enter
ddd enter
ccc enter

 */