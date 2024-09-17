public class TwosumLC1 {
    static int[] Twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        int target = 6;
        int[] result = TwosumLC1.Twosum(nums, target);
        if (result.length == 0) {
            System.out.println("No two sum solution");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }
}
