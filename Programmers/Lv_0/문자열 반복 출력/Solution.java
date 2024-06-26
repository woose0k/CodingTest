import java.util.Scanner;

public class Solution {

    public static String solution(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); // string
        int n = sc.nextInt();

        String result = solution(str, 5);
        System.out.println(result);
    }
}