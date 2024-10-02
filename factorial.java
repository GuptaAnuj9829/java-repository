import java.util.Scanner;

public class factorial {

    int ans = 1;

    int fact(int a){

        if(a > 0){
            ans = a*fact(a-1);
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);

        factorial t1 = new factorial();

        System.out.print("enter a number:");
        int n = Input.nextInt();

        System.out.println("Factorial: " +t1.fact(n));

        Input.close();
    }
}
