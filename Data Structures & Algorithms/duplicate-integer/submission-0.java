class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        for(int i =0;i<n;i++){
            s = nums[i];
            for(int j = i+1;j<n;j++){
                if(s==nums[j]){
                    return true;
                }
            }

        }
        return false;
    }
}