import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int n : nums) {
            int resSize = res.size();
            for (int i = 0 ; i < resSize ; i++) {
                List<Integer> list = res.get(i);
                List<Integer> temp = new ArrayList<>(list);
                temp.add(n);
                res.add(temp);
            }
        }
        return res;
    }
}
