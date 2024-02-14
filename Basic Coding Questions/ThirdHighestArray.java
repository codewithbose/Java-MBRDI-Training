import java.util.Arrays;

public class ThirdHighestArray {

    public static int PrintThirdHighestArray(int[] nums){
        Arrays.sort(nums);
        int thirdHighestNumber = nums[nums.length -3];
        return thirdHighestNumber;
    }
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 2, 6, 4, 7};
        System.out.println(PrintThirdHighestArray(array));
    }
}
