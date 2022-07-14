// Brute Force 
class Solve {
    int[] findTwoElement(int arr[], int n) {
       // Create a frequency array of size n + 1
       int freq [] = new int[n + 1];
       for(int i = 0 ; i < n ; i++) // n
       freq[arr[i]] += 1;
       // Again traverse to get missing & repeating numbers 
       int ans[] = new int[2];
       for(int i = 1 ; i < n + 1 ; i++) // n
       {
           if(freq[i] == 0 ) // missing number
           ans[1] = i;
           else if(freq[i] > 1) // repeating number
           ans[0] = i;
       }
       return ans;
    }
}
// TC : O(2N) 
// SC : O(N)

// Optimised Approach 
class Solve {
    int[] findTwoElement(int arr[], int n) {
       int ans[] = new int[2];
       for(int i = 0 ; i < n ; i++) // N
       {
           int index = Math.abs(arr[i]) - 1;
           if(arr[index] < 0) // Repeating Number 
           ans[0] = index + 1;
           else
           arr[index] = -arr[index]; // visited
       }
       // Missing Number
       // To find missing number , traverse the array again & look for +ve value
       for(int i = 0 ; i < n ; i++) // N
       {
           if(arr[i] > 0){
           ans[1] = i + 1;
           break;
           }
       }
       return ans;
    }
}
// TC : O(2N)
// SC : O(1)
