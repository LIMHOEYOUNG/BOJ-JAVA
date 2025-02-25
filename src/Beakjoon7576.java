import java.io.*;
import java.util.*;

public class Beakjoon7576 {
    public static int showQ[][];
    public static int dx[]={1,0,-1,0};
    public static int dy[]={0,1,0,-1};
    private static class Tomato{
        int x;
        int y;
        int ripening;
        int state;

        public Tomato(int x, int y, int ripening, int state){
            this.x= x;
            this.y= y;
            this.ripening= ripening;
            this.state= state;
        }
    }

    private static int bfs(Queue<Tomato> q,int n, int m, int box[][]){
        int ans= 0;

        while(!q.isEmpty()){
            Tomato t= q.poll();
            ans= t.ripening;

            //System.out.println(t.x+" "+t.y+"기준");

            //System.out.println(t.x+" "+t.y+" "+t.state+" "+t.ripening+" ");

            for(int i=0;i<4;i++){
                int mv_dx= dx[i]+t.x;
                int mv_dy= dy[i]+t.y;

                System.out.println(t.x+" "+t.y);
                //System.out.print(i+" 이동 "+mv_dx+" "+mv_dy+"확인 |");

                if((0<=mv_dx&&mv_dx<n) && (0<=mv_dy&&mv_dy<m)){
                    if(box[mv_dx][mv_dy]==0){
                        //System.out.println(mv_dx+" "+mv_dy+" change => "+ans);
                        //t.ripening= ans+1;
                        //t.state= 1;
                        //t.x= mv_dx;
                        //t.y= mv_dy;
                        box[mv_dx][mv_dy]= 1;
                        //showQ[mv_dx][mv_dy]= ans+1;

                        //System.out.println("==============");
                        //System.out.println(t.x+" "+t.y+" "+t.ripening+" "+t.state);
                        //System.out.println(mv_dx+" "+mv_dy+" "+(ans+1)+" "+1);

                        q.offer(new Tomato(mv_dx,mv_dy,ans+1,1));
                        //q.offer(new Tomato(t.x,t.y,t.ripening,t.state));
                        //q.offer(t);

                        //showBox(box,n,m);
                    }
                }
            }
            //System.out.println(ans);
            //System.out.println(ans+" ===>  SIZE = "+q.size());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(box[i][j]==0){
                    //System.out.println(i+" "+j+" == 0");
                    return -1;
                }
            }
        }
        return ans;
    }

    public static void showBox(int box[][],int n, int m){
        System.out.println("===============================");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(box[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void showBox(int n, int m){
        System.out.println("=============기간============");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(showQ[i][j]+ "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int m= Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(st.nextToken());

        int box[][]= new int[n][m];

        //showQ= new int[n][m];

        Queue<Tomato> check= new LinkedList<>();

        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());

            for(int j=0;j<m;j++){
                box[i][j]= Integer.parseInt(st.nextToken());
                //int state= Integer.parseInt(st.nextToken());

                if(box[i][j]==1){
                    check.offer(new Tomato(i,j,0, box[i][j]));
                    //check.offer(new Tomato(i,j,0,state));
                }
            }
        }



        //bfs(check,n,m,box);
        System.out.println(bfs(check,n,m,box));
        //showBox(n,m);
    }
}
/*
6 4
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1

8
======
6 4
0 -1 0 0 0 0
-1 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1

-1
=====
6 4
1 -1 0 0 0 0
0 -1 0 0 0 0
0 0 0 0 -1 0
0 0 0 0 -1 1

6
=====
5 5
-1 1 0 0 0
0 -1 -1 -1 0
0 -1 -1 -1 0
0 -1 -1 -1 0
0 0 0 0 0

14
====
2 2
1 -1
-1 1

0



6 4
0 0 0 0 0 0
0 0 0 -1 0 0
0 0 -1 0 0 0
0 0 -1 0 0 1

 */