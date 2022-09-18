class Solution {
     int count=0;
   
  
    
    public int numSubseq(int[] nums, int target) {
        
        int n=nums.length;
        int sum=0;
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
       int[] power=new int[nums.length];  
        power[0]=1; 
        for(int idx=1;idx<nums.length;idx++)
            power[idx]=(power[idx-1]*2)%1000000007;  
        
        int count=0;
        while(i<=j)
        {
            
            
            int tar=nums[i]+nums[j];
            if(tar>target)
            {
                j--;
            }
            else
            {
                
                count=(count+power[j-i])%1000000007;
                i++;
            }
            
        }
 
        
        return count;
        
    }
    
// brute-force
//     int count=0;
//     public void checkSequence(int arr[],int idx,int target,ArrayList<Integer>list,int n)
//     {
//         if(idx==n){
//             if(list.size() == 0) return;
        

//              int min=list.get(0);
//             int max=list.get(list.size()-1);

           
            
//             if((min+max)<=target)
//             {
//                 count=(count+1)%1000000007;
//             }
//             return;
//         }
        
//         list.add(arr[idx]);
//         checkSequence(arr,idx+1,target,list,n);
//         list.remove(list.size()-1);
//         checkSequence(arr,idx+1,target,list,n);
        
//     }
    
//     public int numSubseq(int[] nums, int target) {
        
//         int n=nums.length;
//         int sum=0;
//         Arrays.sort(nums);
//         ArrayList<Integer>list=new ArrayList<>();
//         int min=Integer.MAX_VALUE;
//         int max=0;
//         checkSequence(nums,0,target,list,n,min,max);
        
//         return count;
        
//     }
}