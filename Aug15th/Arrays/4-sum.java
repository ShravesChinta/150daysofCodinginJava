/***

Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109

***/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l =new ArrayList<>();
        if(nums==null || nums.length<4)
            return l;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-3;i++)
        {  
            if(i==0 || i>0 && nums[i]!=nums[i-1])
        {
                for(int j=i+1;j<nums.length-2;j++)
                {
                    
                    long sum2 = (long) target - (nums[i]+nums[j]);
                    int low=j+1;
                    int high=nums.length-1;
                    while(low<high)
                    {
                        long sum = (long) nums[low]+nums[high];
                        if(sum==sum2)
                        {
                        l.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        while(low<high && nums[low]==nums[low+1])low++;
                        while(low<high && nums[high]==nums[high-1])high--;
                        low++;
                        high--;
                        }
                        
                        else if(sum<sum2)
                        {
                            low++;
                        }
                        else{
                            high--;
                        }
                            
                        }
                    while(j < nums.length-2 && nums[j+1]==nums[j]) j++;
            }
                }
                }
                return l;
            }
        }
    
