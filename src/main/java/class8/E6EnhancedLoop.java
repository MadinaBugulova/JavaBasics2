package class8;

public class E6EnhancedLoop {
    public static void main(String[] args) {

        int[] nums={10,23,25,56,45,20};

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]>20){
                nums[i]=0;
            }

        }
        for (int i=0;i< nums.length; i++) {

            System.out.println(nums[i]);
        }
    }


}
