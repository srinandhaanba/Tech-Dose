class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1,temp;    
        
        while(mid<=high)
        {
         if(nums[mid]==2)
         {
             //System.out.print(nums[mid]+""+nums[high]);
             temp=nums[mid];
             nums[mid]=nums[high];
             nums[high]=temp;
             high--;
         }   
         else if(nums[mid]==0)
         {
             temp=nums[mid];
             nums[mid]=nums[low];
             nums[low]=temp;
             mid++;
             low++;
         }
         else if(nums[mid]==1)
         {
             mid++;
         }
        }
    }

}
