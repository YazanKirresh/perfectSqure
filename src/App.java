public class App {

    public static int numSquares(int n) {
        if (n == 0 || n < 0){
            System.out.println("The entered number is not valid");
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int number = 0;
        int output = numSquares(number);
        System.out.println("The least number of perfect squares is: " + output);
    }
}
