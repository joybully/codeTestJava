import java.util.Scanner;

public class P312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        int result = nums.charAt(0)-48;
        for(int i=1; i<nums.length(); i++){
            int num1 = nums.charAt(i)-48;
            if(result*num1>result+num1) result = result*num1;
            else result = result+num1;
        }
        System.out.println(result);
    }
}
