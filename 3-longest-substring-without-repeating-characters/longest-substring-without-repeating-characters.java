class Solution {
    public int lengthOfLongestSubstring(String s) {
        
 int[] hash = new int[256]; // ASCII
       
        // initialize all values with -1
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // if character already seen and inside current window
            if (hash[ch] != -1 && hash[ch] >= left) {
                left = hash[ch] + 1;
            }

            // update last seen index
            hash[ch] = right;

            // calculate length
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }

}