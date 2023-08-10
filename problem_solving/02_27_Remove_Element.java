package problem_solving;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * <p>
 * Custom Judge:
 * <p>
 * The judge will test your solution with the following code:
 * <p>
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 * // It is sorted with no values equaling val.
 * <p>
 * int k = removeElement(nums, val); // Calls your implementation
 * <p>
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */

class Solution2 {
    public int removeElement(int[] nums, int val) {
        /*
        //方法一：暴力解法，双层for循环，时间复杂度（O(n^2)）
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (val == nums[i]) {
                for (int j = i + 1; j < size; j++) {
                    nums[j - 1] = nums[j];
                }
                size--;
                i--;
            }
        }
        return size;
        */

        /*
        // 方法二：快慢指针 - 整体思路：没有找到目标值，则将快指针指向的值复制给慢指针指向的值（其实是同一个元素），一旦发现目标值，则中止上述操作，直到下一次不是目标值再执行赋值操作
        int slowPointer = 0; //初始化慢指针
        for(int fastPointer = 0; fastPointer < nums.length; fastPointer ++) { //驱动快指针前进
            if(val != nums[fastPointer]) { // 当快指针值不是目标值，则执行赋值操作
                nums[slowPointer] = nums[fastPointer];
                slowPointer ++; //赋值完成后，将慢指针也向前移动一位
            }
        }
        return slowPointer; //最终，慢指的值就是数组长度（因为最后slowPointer做了一个++操作）
        */

        //方法三：相向双指针

    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] arr = new int[] {1,2,2,2,5,6,7,8,9};
        int ans = s.removeElement(arr, 3);
        System.out.println(ans);
    }
}