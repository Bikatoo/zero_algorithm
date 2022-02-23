public class LongestCommonPrefix2 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        // 字符串个数
        int count = strs.length;
        // 第一个字符串长度
        int length = strs[0].length();

        // i 表示第几个字符 j 表示第几个字符串
        for (int i = 0 ; i < length ; i++) {
            // 遍历第一个字符串的每一个字符
            char c = strs[0].charAt(i);

            for (int j = 1; j < count ; j++) {
                // 遍历后续字符串，比较该位置的字符是否和第一字符串相同（先判断长度）
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
