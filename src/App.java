public class App {

    public static int numSquares(int n) {
        if (n == 0 || n < 0){
            System.out.println("The entered number is not valid");
            return -1;
        }else if ((int)Math.sqrt(n) * (int)Math.sqrt(n) == n){
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int number = 12;
        int output = numSquares(number);
        if (output == 1 ){
            System.out.println("The provided number" + number +"is a perfect squre");
        }else if (output != -1){
            System.out.println("The least number of perfect squares is: " + output);
        }else {
            System.out.println("An error occured, please try again later ;(");
        }
    }
}
