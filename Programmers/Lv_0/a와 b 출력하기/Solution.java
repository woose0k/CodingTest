import java.util.Scanner;

class Solution {

    public static String solution(int a, int b) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        return "a= " + a + " b= " + b;
    }
    public static void main(String[] args) {

        System.out.println(solution(4, 5));
    }

}