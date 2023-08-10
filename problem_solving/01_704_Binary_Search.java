package problem_solving;

/**
 Given an array of integers nums which is sorted in ascending order, and an integer target,
 write a function to search target in nums.
 If target exists, then return its index.
 Otherwise, return -1.

 You must write an algorithm with O(log n) runtime complexity.

 Example 1:

 Input: nums = [-1,0,3,5,9,12], target = 9
 Output: 4
 Explanation: 9 exists in nums and its index is 4


 Example 2:

 Input: nums = [-1,0,3,5,9,12], target = 2
 Output: -1
 Explanation: 2 does not exist in nums so return -1


 Constraints:

 1 <= nums.length <= 104
 -104 < nums[i], target < 104
 All the integers in nums are unique.
 nums is sorted in ascending order.
 */

class Solution {
    public int search(int[] nums, int target) {
        // 定义左右边界
        int left = 0;
        int right = nums.length -1;

        //避免无效值导致的循环逻辑执行
        if(nums[left] > target || nums[right] < target) return -1;

        //只要在闭区间[left, right]中，left不小于right，区间依然存在，则就需要一直搜索
        while(left <= right) { //当left == right的时候，依然存在
            //int middle = (right + left) / 2; // 优化一：这种写法当参与运算的值过大的情况下，可能发生溢出，优化成如下写法:
            int middle = left + ((right - left) >> 1);
            if(nums[middle] > target) {
                right = middle -1;
            }else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
