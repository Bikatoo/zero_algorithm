public class FindNumberIn2DArray1 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        for (int[] arr : matrix) {
            for (int n : arr) {
                if (n == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
