import java.util.Arrays;

class majorityElement {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}