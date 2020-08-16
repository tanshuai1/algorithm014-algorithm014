import java.util.HashMap;
import java.util.Map;


public class Solution {

    public static void main(String[] args) {
        int[] test = new int[]{3,2,4};
        int[] twoSum = new Solution().twoSum(test, 6);
        for (int i : twoSum) {
            System.out.println(i);
        }

    }
    
    public   int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[0];
        }
        Map<Integer,Integer> map = new HashMap(nums.length);
        for (int i=0;i<nums.length;i++) {
            Integer targetIndex = map.get(target - nums[i]);
            if(targetIndex !=null && targetIndex != i){
                return new int[]{i,targetIndex};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
