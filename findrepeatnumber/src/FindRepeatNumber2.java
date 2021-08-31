public class FindRepeatNumber2 {

    public int findRepeatNumber(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            //原本下表就等于本身，不需要交换
            if (index == nums[index]) {
                index++;
                continue;
            }
            //cur和target相等说明是重复数字
            if (nums[index] == nums[nums[index]]) {
                return nums[index];
            }

            //原地交换
            int temp = nums[index];
            nums[index] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
