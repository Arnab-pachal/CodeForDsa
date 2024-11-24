public class streak207kadanes {
    long maxSubarraySum(int arr[]){
        int n = arr.length;
        
       long sum =0;
       long maxsum = Integer.MIN_VALUE;
      
       for(int i=0;i<n;i++){
           
           sum+=arr[i];
           
           maxsum=Math.max(sum,maxsum);
           
           if(sum<0){sum=0;}
       }
       return maxsum;
        
    }
}
