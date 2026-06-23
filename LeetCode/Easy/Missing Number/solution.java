class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int TotalSum=n*(n+1)/2;
        int ActualSum=0;
        
        for (int i=0;i<n;i++)
        {
            ActualSum+=nums[i];
        }
        return TotalSum-ActualSum;
    }
}