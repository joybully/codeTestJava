import java.util.Arrays;
import java.util.Scanner;

public class P313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zeroOne = sc.nextLine().trim();
        int[] intArr = new int[zeroOne.length()];
        for (int i = 0; i < zeroOne.length(); i++) {
            intArr[i] = zeroOne.charAt(i) - 48;
        }
        // 0으로 바꾸기
        int count0 = 0;
        // 1로 바꾸기
        int count1 = 0;
        if(intArr[0]==1) count0++;
        else count1++;
        for (int i = 1; i < intArr.length; i++) {
            if(intArr[i]!=intArr[i-1]){
                if (intArr[i]==1){
                    count0++;
                }
                else count1++;
            }
        }
        System.out.println(Math.min(count1,count0));
    }
}
