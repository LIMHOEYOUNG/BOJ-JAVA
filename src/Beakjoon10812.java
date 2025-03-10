import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Beakjoon10812 {
    private class node{
        node next;  //뒤
        node prev;  //앞
        int data;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        LinkedList<node> list= new LinkedList<>();
        int arr[]= new int[n+1];

        for(int i=1;i<arr.length;i++){
            //list.add(i);
            arr[i]= i;
        }


        for(int t=0;t<m;t++){
            st= new StringTokenizer(br.readLine());
            int i= Integer.parseInt(st.nextToken());
            int j= Integer.parseInt(st.nextToken());
            int k= Integer.parseInt(st.nextToken());


        }
    }
}
