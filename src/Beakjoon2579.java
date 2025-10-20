import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2579 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int[] val= new int[n+1];

        for(int i=1;i<=n;i++){
            val[i]= Integer.parseInt(br.readLine());
        }

        int[] ans= new int[n+1];

        for(int i=1;i<=n;i++){
            if(i==1){
                ans[i]= val[i];
            }
            else if(i==2){
                ans[i]= ans[i-1]+val[i];
            }
            else{
                ans[i]= Math.max(ans[i-3]+val[i-1], ans[i-2])+ val[i];
            }
        }

        System.out.println(ans[n]);

        /*
        int n= Integer.parseInt(br.readLine());
        long ans= Long.parseLong(br.readLine());
        int loc= 1;
        int seq= 1;
        long tmp_val= 0;
        boolean check= false;

        StringBuilder sb= new StringBuilder();
        sb.append(ans).append(" => ");

        while(true){
            //System.out.println("loc = "+loc+" n = "+n);
            if(loc==n) {
                sb.append("finish");
                break;
            }

            //System.out.println("loc<=(n-2)"+(loc<=(n-2)));

            if(loc<=(n-2) && !check){
                long loc1= Long.parseLong(br.readLine());
                long loc2= Long.parseLong(br.readLine());
                //System.out.println("loc1>loc2 = "+"("+loc1+")"+" ("+loc2+") "+(loc1>loc2));

                if(loc1>loc2){
                    sb.append(loc1).append(" => ");
                    ans+= loc1;
                    check= true;
                    tmp_val= loc2;
                    loc+=1;


                    //System.out.print("1칸 이동 "+loc+" ");
                    //loc+=1;
                    //System.out.println(loc);


                }
                else {
                    sb.append(loc2).append(" => ");
                    ans+= loc2;
                    loc+=2;

                    //System.out.print("2칸 이동 "+loc+" ");
                    //loc+=2;
                    //System.out.println(loc);

                }
            }
            else if(loc<=(n-2) && check){
                long loc2= Long.parseLong(br.readLine());

                if(tmp_val>loc2){
                    sb.append(tmp_val).append(" => ");
                    ans+= tmp_val;
                    //check= true;
                    tmp_val= loc2;
                    loc+=1;


                    //System.out.print("1칸 이동 "+loc+" ");
                    //loc+=1;
                    //System.out.println(loc);


                }
                else {
                    sb.append(loc2).append(" => ");
                    ans+= loc2;
                    check= false;
                    loc+=2;

                    //System.out.print("2칸 이동 "+loc+" ");
                    //loc+=2;
                    //System.out.println(loc);

                }
            }
            else{
                long t= Long.parseLong(br.readLine());
                sb.append(t);

                ans+= t; //Long.parseLong(br.readLine());
                loc+=1;
            }

            //System.out.println(sb);
            //System.out.println("loc = "+loc+"\n");
        }

        //System.out.println(sb);
        System.out.println(ans);
        */

    }
}


/*
 * 각 계단에 일정한 점수가 있으며 계단을 밟으면 계단에 쓰여있는 점수의 최고점
 *
 *
 * [문제 풀이]
 * dp : 각계단에서 가질 수 있는 최고점을 저장하는 배열
 * 1. 1칸, 2칸만 오를수 있으며 연속된 3계단을 오를 수는 없다.
 * 2. ㅇ마지막 도착 계단은 무조건 밟아야한다.
 *
 * 계단의 개수는 1~ 300
 *  쓰여있는 점수는 100000 -> int 범위를 벗어나지는 않는다.
 * 시작은 0부터
 *
 * 계단을 오르는 방식부터하자
 * N = 1 : 1칸
 * N = 2 : 1 + 1 | 2
 * N = 3 : 2 + 1 | 1 + 2 -> 2가 1개씩 2의 순서가 힌트인거 같은데
 * N = 4 : 1 + 2 + 1 | 1 + 1 + 2 | 2 + 1 + 1 | 2 + 2 -> 2가 1개
 * N = 5 : 1 + 1 + 2 + 1 -> dp[1] + dp[2]  | 1 + 2 + 2 | 2 + 1 + 2 |  1 + 2 + 2
 *
 *
 * -> 위 테이블은 잘못된 정의다 다른식으로 해야한다.
 * dp[i][j] = 현재까지 j의 계단을 연속해서 밟고 i번째 계단에 올라섰을때 점수 합의 최댓값 i번째 계딴은 밟아야함
 * dp[k][1] = dp[k-2][1] + dp[k-2][2] + S[k]
 * dp[k][2] = dp[k-1][1]
 *
 * -> 1차원으로도 할 수 있다.
 * i번째 계단까지 올라 섰을때 밟지 않은 계단의 합의 최솟값, 단 i번째 계단은 반드시 밟지 않을 계단으로 선택
 * dp[k] = star[k] + Math.min(dp[k-2], dp[k-3]) +
 * 값은 전체 계단 에서 2번째 전 계단 1번째 전계단 둘중 큰 값을 제공하면된다.
 *
 * */