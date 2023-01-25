public class App {
    public static double getAverage(int[] nums) {
        //WRITE YOUR CODE HERE
        double sum = 0;

        for (int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        return sum/nums.length;
    }

    //DO NOT TOUCH ANYTHING DOWN HERE
    //Main method is used to test your method above to check if it is working as intended
    public static void main(String[] args) throws Exception {
        System.out.println("Testing getAverage method...");
        int[] nums = {1 , 2, 3, 4, 5, 6};

        double result = getAverage(nums);
        if (result == 3.5) {
            System.out.println("\u001B[32m"+"Correct"+"\u001B[0m");
            System.out.println("nums average is 3.5");
        }else {
            System.out.println("\u001B[31m"+"Failed"+"\u001B[0m");
            System.out.println("Your method gave: " + result);
        }
    }
}
