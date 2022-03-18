import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int n : nums) {
            // 注意这里要记录下res此时的长度，如果直接在循环条件中写 res.size()的话循环无法结束，因为循环体中会增加元素。
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
