import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumber1 {

    public int findRepeatNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            }
            set.add(n);
        }
        return -1;
    }

}
