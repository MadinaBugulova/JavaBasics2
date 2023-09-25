package class8;

public class T6EnhancedLoop {

    public static void main(String[] args) {


        int[] nums={10, 77, 25, 56, 60, 20,-10,-5};
        int smallest=nums[0];
        for(int d:nums) {
            if (d < smallest) {
                smallest = d;
            }
        }
            System.out.println(smallest);
        }
    }

