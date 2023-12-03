package leetcode;

public class BinarySearch704 {
    public int search(int[] nums, int target) {
        var l = 0;
        var r = nums.length -1;
        var m = 0;

        while(l <= r) {
            m = (l+r)/2;
            if(nums[m] == target)
                return m;
            else if (nums[m] < target)
                l = m +1;
            else
                r = m - 1;
        }
        return -1;
    }
}
