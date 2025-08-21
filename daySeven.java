
public class daySeven {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int answer = trap(height);
        System.out.println(answer);
    }
    public static int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int totalWater = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            int rightMax = 0;

            // Find the maximum height on the left of the current bar
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find the maximum height on the right of the current bar
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            // Calculate the water trapped at the current bar and add to total
            totalWater += Math.min(leftMax, rightMax) - height[i];
        }

        return totalWater;
    }
}
