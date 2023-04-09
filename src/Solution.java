import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countDistinctIntegers(int[] nums) {
        int[] ans = new int[nums.length*2];

        for(int i = 0; i < nums.length; i++)
            ans[i] = nums[i];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 10)
                ans[nums.length+i] = nums[i];
            else {
                String numStr = Integer.toString(nums[i]);
                StringBuilder sb = new StringBuilder(numStr);
                sb.reverse();
                ans[nums.length+i] = Integer.parseInt(sb.toString());
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < ans.length; i++)
            set.add(ans[i]);
        return set.size();
    }
}
