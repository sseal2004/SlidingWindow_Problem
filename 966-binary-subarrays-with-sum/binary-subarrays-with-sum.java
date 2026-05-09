class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
    public int helper(int[] arr, int goal){
        if(goal<0) return 0;
        int right=0;int left=0;int sum=0;int count=0;
        while(right<arr.length){
            sum += arr[right];
            while(sum>goal){
                sum -= arr[left];
                left++;
            }
            count = (count + right-left+1);
            right++;
        }
        return count;
    }

}