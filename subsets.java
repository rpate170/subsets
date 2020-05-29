class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        findSubsets(result, list, nums, 0);
        return result;
    }
    
    public void findSubsets(List<List<Integer>> result, List<Integer> list, int[] nums, int s){
        
            
            result.add(new ArrayList<>(list));
        
            for (int i = s; i < nums.length; i++){
                list.add(nums[i]);
                findSubsets(result, list, nums, i+1);               
                list.remove(list.size()-1);
        }
    }
}