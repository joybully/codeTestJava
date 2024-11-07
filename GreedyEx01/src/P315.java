import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P315 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N,M;
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] balls = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int[] Arrays = new int[11];
        int result = 0;
        N = NM[0];
        M = NM[1];
        for(int i=0; i<N; i++){
            Arrays[balls[i]]+=1;
        }
        for(int i=0; i<11;i++){
            N-=Arrays[i];
            result+=N*Arrays[i];
        }
        System.out.println(result);
    }
}
