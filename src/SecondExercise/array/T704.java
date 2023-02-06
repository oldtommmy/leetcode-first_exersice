package SecondExercise.array;

public class T704 {
    public int search(int[] nums, int target) {

        int left = 0, right = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
