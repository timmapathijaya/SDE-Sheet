class Solution {
    public void swap(int[] nums , int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums , int start , int end)
    {
        while(start < end)
        {
            swap(nums, start , end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // start traversing from back & find a break point 
        int index_1 = -1;
        for(int i = n - 2 ; i >= 0 ; i--) // n
        {
            if(nums[i] < nums[i+1]) 
            {
                index_1 = i;
                break;
            }
        }
        if(index_1 != -1)
        {
            // increasing the value of original nums 
            for(int j = n - 1 ; j > index_1 ; j--) // n
            {
                if(nums[j] > nums[index_1])
                {
                    swap(nums , index_1 , j);
                    break;
                }
            }
        }
        reverse(nums , index_1 + 1 , n - 1); // n
    }
}
// TC : O(3N)
// SC : O(1)
