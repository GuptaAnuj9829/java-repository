import java.util.Scanner;

public class fibonaci_series_using_dynamic_programming {

    int Fibonacci(int n){

        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else if(n > 1){
            return (Fibonacci(n-1) + Fibonacci(n-2));
        }

        return 0;

    }
    public static void main(String[] args){

        Scanner Input = new Scanner(System.in);

        fibonaci_series_using_dynamic_programming t1 = new fibonaci_series_using_dynamic_programming();

        System.out.print("Enter the fibonacci range:");
        int n = Input.nextInt();

        System.out.println("Fibonacci number at given index is: " +t1.Fibonacci(n));

        Input.close();

    }
    
}