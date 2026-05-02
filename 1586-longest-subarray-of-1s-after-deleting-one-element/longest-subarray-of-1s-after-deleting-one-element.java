class Solution {
    public int longestSubarray(int[] nums) {
        int maxlen=0;
        int left=0;
        int right=0;
        int zeroes=0;
        while(right<nums.length){
            if(nums[right]==0)zeroes++;
            while(zeroes>1){
                if(nums[left]==0)zeroes--;
                left++;
            }
            int len = right-left;
            maxlen = Math.max(maxlen,len);
            right++;
        }
        return maxlen;
    }
}