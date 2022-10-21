import java.util.Scanner;
public class Operator{
    public static void main(String args[]){

        Scanner nu = new Scanner(System.in);
        System.out.print("Enter the First and the Second number: ");

        int a = nu.nextInt();
        int b = nu.nextInt();

        System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /, %) -");
        char op = nu.next().charAt(0);
        solve(a, b, op);

    }
    public static int solve(int a, int b, char op){

        int ans = 0;
        //addition
        if(op == '+'){
            ans = a + b;
            //subtraction
        }
        else if(op == '-'){
            ans = a - b;
            //multiplication
        }
        else if(op == '*'){
            ans = a * b;
            //modulo
        } else if (op == '/'){
            if(b != 0){
                ans = a/b;
            }
        }
        else if(op == '%'){
            ans = a % b;
            //division
        }
        
        //Print the final result
        System.out.println("Your answer is: " + ans);
        return ans;
    }

}

//Anoter method

//import java.util.Scanner;
//
//public class Calculator {
//    public static void main(String[] args) {
//        Scanner in =  new Scanner(System.in);

//        // input two numbers
//        System.out.print("Enter two numbers: ");
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();

//        // Take input from user till user does not press X or x.
//        
//        int ans = 0;
//        while ( true ) {
//            // take the operator as input
//            System.out.print("Enter the operator: ");
//            char op = in.next().trim().charAt(0);
//
//            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//
//                if (op == '+') {
//                    ans = num1 + num2;
//                }
//                if (op == '-') {
//                    ans = num1 - num2;
//                }
//                if (op == '*') {
//                    ans = num1 * num2;
//                }
//                if (op == '/') {
//                    if (num2 != 0) {
//                        ans = num1 / num2;
//                    }
//                }
//                if (op == '%') {
//                    ans = num1 % num2;
//                }
//            }   else if (op == 'x' || op == 'X') {
//                break;
//                } else {
//                    System.out.println("Invalid operation!!");
//
//                }
//                System.out.println(ans);
//        }
//    }
//}
