class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Boyer Moore Voting Algorithm
        // At max we can have 2 majority element 
        // Distinct elements triplet
        int n = nums.length;
        List<Integer> majorityElements = new ArrayList<>();
        int value1 = nums[0] , count1 = 1 , value2 = nums[0] , count2 = 0;
        for(int i = 1 ; i < n; i++) // N
        {
            if(nums[i] == value1)
                count1++;
            else if(nums[i] == value2)
                count2++;
            else // Distinct Element 
            {
                if(count1 == 0) // no unpaired element 
                {
                    value1 = nums[i];
                    count1 = 1;
                }
                else if(count2 == 0) // no unpaired element
                {
                    value2 = nums[i];
                    count2 = 1;
                }
                else // distinct element triplet
                {
                    count1--;
                    count2--;
                }
            }
        }
            // check the frequency of unpaired element 
            count1 = 0 ;
            count2 = 0;
            for(int i = 0 ; i < n ; i++) // N
            {
                if(nums[i] == value1)
                    count1++;
                else if(nums[i] == value2)
                    count2++;
            }
            if(count1 > n / 3)
                majorityElements.add(value1);
            if(count2 > n / 3)
                majorityElements.add(value2);
            return majorityElements;
             
    }
}
// TC : N + N = > O(2N)
// SC : O(1)
