import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] money = Arrays
                .stream(br.readLine().split(" ")).sorted()
                .mapToInt(Integer::parseInt).toArray();
        int target = 1;
        for(int value:money){
            if(target<value) break;
            target+=value;
        }
        System.out.println(target);
    }
}
