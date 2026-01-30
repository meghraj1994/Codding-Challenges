package practiseagain;

public class Q8KokoEatingBanana {

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println(findMinSpeed(piles, h));
    }

    public static int findMinSpeed(int[] piles, int h) {
        int start = 1;
        int end = 1;

        //finding max speed in in this case its 11
        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        //as of now we know our speed range can be b/t [1,11]
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (canFinishEating(piles, mid, h)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static boolean canFinishEating(int[] piles, int mid, int h) {
        int hours =0;
        for(int pile : piles){
            hours += Math.ceil((double) pile/mid);
        }
        return h<=mid;
    }
}
