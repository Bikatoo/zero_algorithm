import java.util.WeakHashMap;

public class LongestCommonPrefix3 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 2) {
            return longestCommonPrefix(strs[0], strs[1]);
        }






        return "";
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
