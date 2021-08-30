public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        if (s == null) {
            return null;
        }

        if (n > s.length()) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = n ; i < s.length() + n ; i++) {
            sb.append(s.charAt(i % s.length()));
        }
        return sb.toString();
    }
}
