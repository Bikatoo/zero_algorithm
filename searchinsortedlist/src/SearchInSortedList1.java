public class SearchInSortedList1 {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        //从左往右找到第一个等于target的
        while (left < nums.length && nums[left] != target) {
            left++;
        }
        //从右往左找到第一个等于target的
        while (right > 0 && nums[right] != target) {
            right--;
        }
        return Math.max(0, right - left + 1);
    }
}
