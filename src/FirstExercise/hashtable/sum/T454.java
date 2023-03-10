package FirstExercise.hashtable.sum;

import java.util.HashMap;

/**
 *  454 四数相加 II
 *  https://leetcode.cn/problems/4sum-ii/
 */
@SuppressWarnings({"all"})
public class T454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                map.put(nums1[i] + nums2[j], map.getOrDefault(nums1[i] + nums2[j], 0) + 1);
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                if (map.containsKey(-(nums3[i] + nums4[j]))) {
                    ans += map.get(-(nums3[i] + nums4[j]));
                }
            }
        }
        return ans;
    }
}
