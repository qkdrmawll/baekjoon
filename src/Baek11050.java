import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek11050 { //이항 계수 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][K+1];

        for (int i=1;i<=N;i++) {
            int j=0;
            while (j<=i && j<=K){
                if (j==0 || i==j) arr[i][j] = 1;
                else arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                j++;
            }
        }
        System.out.println(arr[N][K]);
    }
}
