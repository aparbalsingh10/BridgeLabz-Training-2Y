import java.util.*;
class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) );
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    System.out.println(nums[i] + " is Positive and Even");
                } else {
                    System.out.println(nums[i] + " is Positive and Odd");
                }
            } else if (nums[i] < 0) {
                System.out.println(nums[i] + " Negative");
            } else {
                System.out.println(nums[i] + " Zero");
            }
        }
        if (nums[0] == nums[nums.length - 1]) {
            System.out.println("First and Last  are Equal");
        } else if (nums[0] > nums[nums.length - 1]) {
            System.out.println("First element is Greater ");
        } else {
            System.out.println("First element is Less than Last element");
        }
    }
}
