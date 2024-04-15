class Solution {

    public static String solution(String my_string, int k) {

        String newString = "";

        for (int i = 0; i < k; i++) {
            newString = my_string + newString;
        }
        
        return newString;
    }

    public static void main(String [] args) {
        
        System.out.println(solution("abc", 3));
    }
}