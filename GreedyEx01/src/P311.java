import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P311 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        Integer[] intArr = new Integer[arr.length];
        for(int i=0; i<arr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.stream(intArr).sorted();
        int person = 0;
        for(int i=0; i<intArr.length;i++){
            person++;
            if(intArr[i]<=person) {
                result++;
                person=0;
            }
        }
        System.out.println(result);
    }
}
