
class TimeMap {

    HashMap<String, ArrayList<Integer>> time;
    HashMap<String, ArrayList<String>> value;

    public TimeMap() {
        time = new HashMap<>();
        value = new HashMap<>();
    }

    public void set(String key, String val, int timestamp) {

        if (!time.containsKey(key)) {
            time.put(key, new ArrayList<>());
            value.put(key, new ArrayList<>());
        }

        time.get(key).add(timestamp);
        value.get(key).add(val);
    }

    public String get(String key, int timestamp) {

        if (!time.containsKey(key)) {
            return "";
        }

        ArrayList<Integer> t = time.get(key);
        ArrayList<String> v = value.get(key);

        int left = 0;
        int right = t.size() - 1;
        String ans = "";

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (t.get(mid) <= timestamp) {
                ans = v.get(mid);
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
