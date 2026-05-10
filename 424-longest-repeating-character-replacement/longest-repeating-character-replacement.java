class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==0)return 0;
        int maxlen=0;int maxFreq=0;int []freq=new int[26];int l=0;int r=0;
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(r)-'A']);
            int windowSize = r-l+1;
            while(windowSize - maxFreq > k){
                freq[s.charAt(l)-'A']--;
                l++;
                windowSize = r-l+1;//update
            }
            maxlen = Math.max(windowSize,maxlen);
            r++;
        }
        return maxlen;
    }
}