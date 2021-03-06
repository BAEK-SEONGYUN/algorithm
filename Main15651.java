//https://www.acmicpc.net/problem/15651
import java.io.*;
import java.util.*;

/**
 * Main15651
 */
public class Main15651 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    


    static Scanner sc = new Scanner(System.in);
    static int[] list = new int[9];
    //static int[] check = new int[9];
    static int n,m;


    static void dfs(int cnt) throws IOException{
        if(cnt == m){
            for (int i = 0; i < m; i++) {
                bw.write(list[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            // if(check[i] == 1){
            //     continue;
            // }
            //check[i] = 1;
            list[cnt] = i;
            dfs(cnt+1);
            //check[i] = 0;
        }
        
    }

    public static void main(String[] args) throws IOException {
        // n = sc.nextInt();
        // m = sc.nextInt();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dfs(0);

        br.close();
        bw.flush();
        bw.close();
    }
}