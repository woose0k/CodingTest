class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            char let = control.charAt(i);
            if (let == 'w') {
                answer += 1;
            } else if (let == 's') {
                answer -= 1;
            } else if (let == 'd') {
                answer += 10;
            } else if (let == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }
}