/**
 * @see <a href="https://leetcode.com/problems/remove-element/">Remove Element</a>
 */

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        while ( j < nums.length) {
            if (nums[j] == val) {
                ++j;
            } else {
                nums[i] = nums[j];
                ++i;
                ++j;
            }
        }
        return i;
    }
}
