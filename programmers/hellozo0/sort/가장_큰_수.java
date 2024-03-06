import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            nums[i] = Integer.toString(numbers[i]);
        }
        
        //문자열 이어 붙여서, 내림차순 정렬
        Arrays.sort(nums, (o1,o2)-> (o2+o1).compareTo(o1+o2));
        
        if(nums[0].equals("0")){
            return "0";
        }
        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            sb.append(nums[i]);
        }
        
        return sb.toString();
    }
}
