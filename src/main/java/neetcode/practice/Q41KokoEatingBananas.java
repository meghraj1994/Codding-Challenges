package neetcode.practice;

public class Q41KokoEatingBananas {

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11}; //1+1+1+2
        int h = 8; //hours given before guards come
        System.out.println("--------Using BruteForce--------");
        System.out.println(minimumSpeedOfKokoEating(piles, h));
        System.out.println("-------Using Binary Search---------");
        System.out.println(findMinimumSpeedUsingBinarySearch(piles, h));
    }


    //t(n) = O(n2) and space = O(1)
    public static int minimumSpeedOfKokoEating(int[] piles, int h) {

        /*k speed at koko eats banana
         *  k  1   2  3  4  5  6  7  8  9  10  11
         *  h  27  15 10 8  8  6  5  5  5  5   4(min hours required to eat all banana piles)
         *
         *
         *
         * */

        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        for (int i = 1; i <= max; i++) {
            if (canFinish(i, piles, h)) {
                return i;
            }
        }
        return -1;
    }

    //t(n)=nlog(n) and s(n)=O(1)
    private static boolean canFinish(int i, int[] piles, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / i);
        }

        return hours <= h;
    }


    //Optimal Solution using binary search
    public static int findMinimumSpeedUsingBinarySearch(int[] piles, int h) {
        int left = 1;
        int right = 1;
        for (int pile : piles) {
            right = Math.max(pile, right);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(mid, piles, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
