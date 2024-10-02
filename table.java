import java.util.Scanner;

class table{

    public static void main(String[] args){

        Scanner Input = new Scanner(System.in);

        int num = Input.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num +" x " +i +" = " +(num*i));
        }

        Input.close();
    }
}