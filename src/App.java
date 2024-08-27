public class App {

    public static int numSquares(int n) {
        if (n == 0 || n < 0){
            System.out.println("The entered number is not valid");
            // the provided number does not have a valid root
            return -1;
        }else if ((int)Math.sqrt(n) * (int)Math.sqrt(n) == n){
            // the provided number is a perfect number
            return 2;
        }else {
            // the number is valid and not a perfect number
            for (int i = 1; i < n; i++){
               if((int)Math.sqrt(n-i) * (int)Math.sqrt(n-i) + i == n ){
                System.out.println("Root: " + (int)Math.sqrt(n-i) + " Loop: " + i);
                System.out.println((int)Math.sqrt(n-i));
                System.out.println(i);
                return 2+i;
               }
            }
        }
        return n;
    }

    public static void main(String[] args) throws Exception {
        int number = 146;
        int output = numSquares(number);
        if (output == 1){
            System.out.println("The provided number " + number +" is a perfect squre");
        }else if (number == output){
            System.err.println("Could not find a valid square other than the '1'");
        }else if (output == -1){
            System.out.println("An error occured, please try again later ;(");
        }else {
            System.out.println("The least number of perfect squares is: " + output);
        }
    }
}
