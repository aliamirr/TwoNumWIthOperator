import java.util.Scanner;
public class Operator{
    public static void main(String args[]){

        Scanner nu = new Scanner(System.in);
        System.out.print("Enter the First and the Second numbers: ");

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
        }else if(op == '%'){
            ans = a % b;
            //division
        } else if (op == '/') {
            if(b != 0){
                ans = a/b;
            }
        
        //Print the final result
        System.out.println("Your answer is: " + ans);
        return ans;
    }

}
