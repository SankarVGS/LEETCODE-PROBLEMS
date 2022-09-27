class Solution {
    public static boolean check(int[] a,int i){
        boolean ch=true;
        int last;
        if(i%2==0){
            last=i/2;
        }
        else{
            last=(i/2)+1;
        }
       
        for(int j=0;j<last;j++){
            if(a[j]!=a[i-j-1]){
                ch=false;
                break;
            }
            
        }
        return ch;
        
    }
    public boolean isStrictlyPalindromic(int n) {
        int i=0;
        boolean b=true;
        int []a=new int[10001];
        for(int ctr=2;ctr<=n-2;ctr++){
            int t=n;
            while(t!=0){
                a[i]=t%ctr;
                t=t/ctr;
                i++;
            }
           
            if(check(a,i)!=true){
                b=false;
                
                break;
            }
            
        }
        return b;
        
        
        
    }
}