import java.util.HashMap;
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[]arr,int goal){
        if(goal<0)return 0;
        int left=0;
        int right=0;int count = 0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        while(right<arr.length){
            mp.put(arr[right],mp.getOrDefault(arr[right],0)+1);
            while(mp.size()>goal){
                mp.put(arr[left],mp.get(arr[left])-1);
                if(mp.get(arr[left])==0) mp.remove(arr[left]);
            left++;    
            }
            count += right-left+1;
            right++;
        }
        return count;
    }
}