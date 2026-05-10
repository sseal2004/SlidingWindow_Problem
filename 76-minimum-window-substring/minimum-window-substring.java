class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0)
            return "";

        int[] freq = new int[256];

        // Store frequency of t
        for(char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int right = 0;

        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while(right < s.length()) {

            char ch = s.charAt(right);

            // If character needed
            if(freq[ch] > 0) {
                count++;
            }

            // Reduce frequency
            freq[ch]--;

            // Valid window found
            while(count == t.length()) {

                // Update minimum window
                if(right - left + 1 < minLen) {

                    minLen = right - left + 1;
                    startIndex = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                freq[leftChar]++;

                // Window invalid
                if(freq[leftChar] > 0) {
                    count--;
                }

                left++;
            }

            right++;
        }

        if(minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(startIndex,
                           startIndex + minLen);
    }
}