import java.util.Scanner;   

public class MultipleInputEvenOddSumFinder {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        int EvenSum = 0;
        int OddSum = 0;

        String val = Input.nextLine();
        String[] val1 = val.split(" ");

        for(String i:val1){

            int temp = Integer.parseInt(i);

            if(temp%2 == 0){
                EvenSum = EvenSum + temp;
            }
            else{
                OddSum = OddSum + temp;
            }
        }

        System.out.println("Even sum: " +EvenSum);
        System.out.println("Odd sum: " +OddSum);

    }
}
