class Solution {
    public void swap(int[] nums1 , int[] nums2 , int i)
    {
        int temp = nums1[i];
        nums1[i] = nums2[0];
        nums2[0] = temp;
    }
    public void insertionSort(int[] nums2) 
    {
        int temp = nums2[0];
        int j = 1;
        while(j < nums2.length && nums2[j] < temp){
            nums2[j - 1] = nums2[j];
            j++;
        }
        nums2[j - 1] = temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       // Insertion sort type Algorithm 
       int i = 0 , j = 0;
       while( i < m && j < n ) // M
       {
           if(nums1[i] > nums2[0])
           {
               swap(nums1 , nums2 , i);
               insertionSort(nums2); // N
           }
           i++;
       }
       while(j < n) // N
         nums1[i++] = nums2[j++];
    }
}
// TC : M * N + N = > O(M * N)
// SC : O(1)

/*
// GAP Method
If we closely look at gap algorithm then it is actually working like a merge sort. 
While going down in this algorithm on LHS of gap we will have all smaller elements and on RHS of gap we will have greater elements.
Now that left and right array we have to sorted and so off course we have to reduce the gap to mid of that left array and for right array mid of right array and do the same thing till gap not equal to 1.
And we are possible to do this because both the arrays are sorted.
Just look closely, we can observe that gap algorithm is similar to merge sort algorithm only.
*/
