class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes=0;
        int right=0;
        int left=0;
        int maxLen=0;
        while(right<nums.length){
            if(nums[right]==0)zeroes++;
            while(zeroes >k ){
                if(nums[left]==0)zeroes--;
                left++;
            }
            int len = right-left +1;
            maxLen = Math.max(len,maxLen);
            right++;
        }
        return maxLen;
    }
}