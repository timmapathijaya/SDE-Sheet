class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer>row , prev = null;
        for(int i = 0 ; i < numRows ; i++)
        {
            row = new ArrayList<>();
            for(int j = 0 ; j < (i + 1) ; j++)
            {
                if(j == 0 || j == i)// first column or last column 
                    row.add(1);
                else
                    row.add(prev.get(j-1) + prev.get(j));
            }
            pascal.add(row);
            prev = row;
        }
        return pascal;
    }
}
// TC : O(N^2)
// SC : O(N^2)
