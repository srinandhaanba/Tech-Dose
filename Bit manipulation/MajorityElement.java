class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length,number=0,count;
        for(int i=0;i<32;i++)
        {
            count=0;
            for(int j=0;j<len;j++)
            {
                if((nums[j] >> i & 1)==1)
                {
                    count++;
                }
            }
            if(count>(len/2))
            {
                number+=(1<<i);
            }
        }
        return number;
    }
}
