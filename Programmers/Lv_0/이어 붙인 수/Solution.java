class Solution {
    public int solution(int[] num_list) {
         int answer = 0;
        String odd = "";
        String even = "";
        for (int i: num_list) {
            if (i % 2 == 0) {
             even += Integer.toString(i);
            } else {
                odd += Integer.toString(i);
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}