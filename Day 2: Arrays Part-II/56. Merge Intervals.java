
class Solution {
    public int[][] merge(int[][] intervals) {
        // Ask the interviewer whether the intervals are in sorted order or not
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]); // N log N
        // Intuition 
        // As we have sorted the intervals , the overlapping intervals are bound to be consecutive
        List<int[]> nonOverlappingIntervals = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1 ; i < intervals.length ; i++) // N (Merging Overlapping intervals)
        {
            if(intervals[i][0] <= end)
                end = Math.max(end , intervals[i][1]);
            else
            {
                int interval [] = new int[2];
                interval[0] = start;
                interval[1] = end;
                start = intervals[i][0];
                end = intervals[i][1];
                nonOverlappingIntervals.add(interval);
            }
        }
         int interval [] = new int[2];
         interval[0] = start;
         interval[1] = end;
         nonOverlappingIntervals.add(interval);  
         return nonOverlappingIntervals.toArray(new int[0][]);
    }
}
