class Solution {
    public int captureForts(int[] forts) {
        int maxlen = 0;
        int vacant=-1;
        for(int i=0;i<forts.length;i++){
            if(forts[i]!=0){// not going towards enemy
                if(vacant!=-1&& forts[vacant]!=forts[i]){//not going towards vacant
                    maxlen = Math.max(maxlen,i-vacant-1);
                }
                vacant=i;//update vacant
            } 
        }
        return maxlen;
    }
}