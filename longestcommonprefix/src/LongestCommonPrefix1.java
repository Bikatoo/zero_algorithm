public class LongestCommonPrefix1 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        String res = strs[0];

        // 遍历每个字符串
        for (int i = 1 ; i < strs.length; i++) {

            // 获取当前遍历过的所有字符串的最长前缀，即f(s1, s2... sn) = f(f(f(s1, s2), s3)...sn)
            res = longestCommonPrefix(res, strs[i]);

            // 如果当前遍历过的字符串的最长前缀已经为空串了，直接返回。
            if (res.length() <= 0) {
                return "";
            }
        }
        return res;
    }

    private String longestCommonPrefix(String str1, String str2) {

        // 只需要完整比较两个字符串中短的那一个即可。
        int minLength = Math.min(str1.length(), str2.length());
        int i = 0;
        while (i < minLength && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return str1.substring(0, i);
    }
}
