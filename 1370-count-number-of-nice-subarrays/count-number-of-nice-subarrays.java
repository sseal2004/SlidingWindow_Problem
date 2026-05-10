class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[]arr,int goal){
        if(arr.length==0)return 0;
        if(goal<0)return 0;
        int left=0;int right=0;int sum=0;int maxSum=0;int count =0;
        while(right<arr.length){
            sum += (arr[right]%2);
            
            while(sum>goal){
            sum-=(arr[left]%2);
            left++;
            }
            int windowSize = right-left+1;
            count = count + windowSize;
            right++;
        }
        return count;
    }
}