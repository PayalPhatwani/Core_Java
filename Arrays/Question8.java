package Arrays;
public class Question8 {
    public static void main(String[] args) {
        int [] a = new int[5];
        int [] b = new int [200];
        // System.out.println("a length = "+a.length+" b length= "+b.length);
        
        // a=b;
        
        // System.out.println("After assigning a to b");
        // System.out.println("a length = "+a.length+" b length= "+b.length);


        int nums[] = {1,2,3,4,5};
        // for (int i=0;i<nums.length;i++) {
        //     System.out.println(nums[i]);
        // }

        // nums[3] = 88;

        // for (int i=0;i<nums.length;i++) {
        //     System.out.println(nums[i]);
        // }

        int copyNums[] = nums.clone();
        for (int i=0;i<copyNums.length;i++) {
            System.out.println(nums[i]);
        }

    }
}
