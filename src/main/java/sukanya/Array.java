package sukanya;

public class Array {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4};
        int b[] = {3, 6, 7, 9};
        int c[] = {2, 4, 8, 9};

        int d[][] = {a, b, c};

        for (int i = 0; i <d.length; i++) {
            for (int j = 0; j <d.length; j++) {
                System.out.print(" " + d[i][j]);
            }
            System.out.println();

        }
    }}