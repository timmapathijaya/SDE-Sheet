class Solution {
    public int majorityElement(int[] nums) {
        // Boyer Moore Voting Algorithm 
        // Pairing Distinct Element 
        int value = nums[0], count = 1;
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] == value)
                count++;
            else // distinct element 
            {
                if(count == 0) // no unpaired element 
                {
                    value = nums[i];
                    count = 1;
                }
                else // pairing 
                    count -= 1;
            }
        }
        // Unpaired Element = > Majority Element 
        return value;
    }
}
// TC : O(N)
// SC : O(1)
