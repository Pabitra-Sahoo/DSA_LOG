class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
       
        HashSet<Integer> data=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            data.add(nums[i]);
        }

        List<Integer> res=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!data.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}