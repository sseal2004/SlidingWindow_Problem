class Solution {
    public int[] decrypt(int[] code, int k) {
        int []arr= new int[code.length];
        int n = code.length;
        if(k>0){
        for(int i=0;i<code.length;i++){// k>0
                int sum =0;
            for(int j=1;j<=k;j++){
            sum += code[(i+j)%n];
             }
             arr[i]=sum;
        }
        return arr;
        }
        else if(k==0){
            for(int i=0;i<code.length;i++){
                arr[i]=0;
            }    
        }else{
            int K = Math.abs(k);
               for(int i=0;i<code.length;i++){// k>0
                       int sum =0;
            for(int j=1;j<=K;j++){
            sum += code[(i-j+n)%n];//window size % n total size
             }
             arr[i]=sum;
        }
        return arr;
        }
        return arr;

    }
}