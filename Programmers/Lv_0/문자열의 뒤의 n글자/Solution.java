class Solution {
    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        

        int idx = my_string.length() - n;
        int cnt = 0;

        while(cnt != n) {
            answer.append(my_string.charAt(idx));
            ++idx;
            ++cnt;
        }
        
        System.out.println(answer.toString());

        return answer.toString();
    }
}