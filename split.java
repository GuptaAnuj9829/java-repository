import java.util.Scanner;

public class split {
    
    public static void main(String[] args) {
        
        Scanner Input =new Scanner(System.in);

        String temp = Input.nextLine();
        String[] temp1 = temp.split("c");

        for(String i:temp1){
            System.out.print(i +" ,");
        }
    }
}
