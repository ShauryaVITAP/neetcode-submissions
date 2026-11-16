
class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] arr = new int[128];

        for (char c : t.toCharArray()) {
            arr[c]++;
        }

        int left = 0;
        int count = t.length();
        int min = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (arr[c] > 0) {
                count--;
            }

            arr[c]--;

            while (count == 0) {

                if (right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;
                }

                char ch = s.charAt(left);
                arr[ch]++;

                if (arr[ch] > 0) {
                    count++;
                }

                left++;
            }
        }

        if (min == Integer.MAX_VALUE) return "";

        return s.substring(start, start + min);
    }
}
