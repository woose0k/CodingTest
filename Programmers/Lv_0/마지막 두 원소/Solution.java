class Solution {
    public int[] solution(int[] num_list) {
         int[] answer = new int[num_list.length + 1];
        int i = 0;
        for (int num : num_list) {
            answer[i] = num;
            i++;
        }
        answer[num_list.length] = num_list[num_list.length - 1] > num_list[num_list.length - 2] ? num_list[num_list.length - 1] - num_list[num_list.length - 2] : num_list[num_list.length - 1] * 2;
        return answer;
    }
}