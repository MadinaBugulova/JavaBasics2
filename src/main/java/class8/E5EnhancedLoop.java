package class8;

public class E5EnhancedLoop {


    public static void main(String[] args) {

        int[] nums={10,23,25,56,45,20};

        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                count++;
            }
        }

        System.out.println(count);
    }
}
