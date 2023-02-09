import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int [N][2];

        for (int i = 0; i < N; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken()); // X
            arr[i][1] = Integer.parseInt(st.nextToken()); // Y
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[1] == e2[1]){
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < N; ++j){
            sb.append(arr[j][0]).append(" ").append(arr[j][1]).append("\n");
        }

        System.out.println(sb);
        
    }
}
