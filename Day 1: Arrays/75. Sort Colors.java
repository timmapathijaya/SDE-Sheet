class Solution {
    public void swap(int[] nums , int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        // Dutch National Flag Algorithm 
        /*
        0 to (low - 1) => 0
        low to (high - 1) => 1
        high to (nums.length - 1 ) => 2
        */
        int low = 0 , high = nums.length - 1 , i = 0;
        while(i <= high)
        {
            if(nums[i] == 0)
            {
                swap(nums , low , i);
                low++;
                i++;
            }
            else if(nums[i] == 1)
                i++;
            else if(nums[i] == 2)
            {
                swap(nums , high , i);
                high--;
            }
        }
    }
}
// TC : O(N)
// SC : O(1)
