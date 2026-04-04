class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i=0,lsum=0,rsum=0,maxSum=0;
        // first 4 kth element
        for(i=0;i<k;i++){
            lsum = lsum + cardPoints[i];
        }
        maxSum = lsum;

        int rightIndex = cardPoints.length-1;//last element index
        for(i=k-1;i>=0;i--){//reverse loop
            lsum = lsum -cardPoints[i];
            rsum = rsum + cardPoints[rightIndex];
            rightIndex--;//shift it towards left
            maxSum = Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }
}