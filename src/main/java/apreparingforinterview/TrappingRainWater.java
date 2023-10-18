package apreparingforinterview;

public class TrappingRainWater {

    public static int trap(int[] height) {
    int left = 0; // Pointer for the left wall
    int right = height.length - 1; // Pointer for the right wall
    int leftMax = 0; // Maximum height of bars to the left
    int rightMax = 0; // Maximum height of bars to the right
    int trappedWater = 0;

        while (left < right) {
        if (height[left] < height[right]) {
            if (height[left] >= leftMax) {
                leftMax = height[left];
            } else {
                trappedWater += leftMax - height[left];
            }
            left++;
        } else {
            if (height[right] >= rightMax) {
                rightMax = height[right];
            } else {
                trappedWater += rightMax - height[right];
            }
            right--;
        }
    }

        return trappedWater;
}

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = trap(height);
        System.out.println("Trapped Water: " + trappedWater);
    }
}
