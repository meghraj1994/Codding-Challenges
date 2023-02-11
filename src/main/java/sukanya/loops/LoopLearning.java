package sukanya.loops;

public class LoopLearning {

    public static void main(String[] args) {

        //int array
        int[] nums1 = new int[5];  //array declaration with type int and size 4
        nums1[0]=1;
        nums1[1]=2;
        nums1[2]=2;
        nums1[3]=3;
        nums1[4]=4;

        //char array
        char[] chars = new char[2]; //array declaration with char int and size 2
        chars[0] = 'A';
        chars[1] = 'B';

        //array of String
        String[] names = new String[3];      //array declaration with type string and size 3
        names[0] = "Meghraj";
        names[1] = "Sukanya";
        names[2] = "Anvi";


        int[] ids = {1,2,3,4,5,6,6,7,8,98};



        System.out.println(ids.length);
        System.out.println(ids[5]);

//        sum(nums1);
    }


    public static void sum(int[] nums) {

        //to create array
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

    }

}
