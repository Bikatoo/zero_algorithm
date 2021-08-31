public class SearchInSortedList2 {

    public int search(int[] nums, int target) {

        //左边最后一个不为target的下标
        int rightIndex = bisection(nums, target);
        //右边最后一个不为target的下标
        int leftIndex = bisection(nums, target - 1);
        return rightIndex - leftIndex - 1;
    }

    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int bisection(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right + left) >> 1;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else  {
                right = mid - 1;
            }
        }
        return left;
    }
}
