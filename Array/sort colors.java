75. Sort Colors
Medium

8838

386

Add to List

Share
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 


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
