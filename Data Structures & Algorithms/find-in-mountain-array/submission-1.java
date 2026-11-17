
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {

        int n = arr.length();

        // Find peak
        int left = 0;
        int right = n-1;

        while(left < right) {
            int mid = left + (right-left)/2;

            if(arr.get(mid) < arr.get(mid+1)) {
                left = mid+1;
            }
            else {
                right = mid;
            }
        }

        int peak = left;

        // Search in left side (ascending)
        left = 0;
        right = peak;

        while(left <= right) {
            int mid = left + (right-left)/2;

            int val = arr.get(mid);

            if(val == target) {
                return mid;
            }
            else if(val < target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }

        // Search in right side (descending)
        left = peak+1;
        right = n-1;

        while(left <= right) {
            int mid = left + (right-left)/2;

            int val = arr.get(mid);

            if(val == target) {
                return mid;
            }
            else if(val > target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }

        return -1;
    }
}
