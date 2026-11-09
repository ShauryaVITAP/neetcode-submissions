

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (start[i] < end[j]) {
                rooms++;
            } else {
                j++;
            }
        }

        return rooms;
    }
}
