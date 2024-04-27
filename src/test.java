import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int num[]= new int[n+1];
        for(int i=1;i<=n;i++){
            num[i]= Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        int cutN= (int)Math.round(n*0.15);

        double sumN=0;

        for(int i=cutN+1;i<=n-cutN;i++) sumN+=num[i];

        System.out.println((int)Math.round(sumN/(n-cutN*2)));
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