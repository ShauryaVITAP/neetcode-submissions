
class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for (int i = 0; i < tasks.length; i++) {
            freq[tasks[i] - 'A']++;
        }

        int maxFreq = 0;

        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] == maxFreq) {
                count++;
            }
        }

        int ans = (maxFreq - 1) * (n + 1) + count;

        return Math.max(tasks.length, ans);
    }
}
