import java.util.Scanner;

public class StringSplitMethod2 {
    public static void main(String[] args){

        Scanner Input = new Scanner(System.in);

        String t1 = "I3 am4 living1 in2 Bhopal5";
        //System.out.println("Enter a string:");
        //String t1 = Input.nextLine();

        String[] arr_of_t1 = t1.split(" ");

        int count = 1;

        while(count != arr_of_t1.length){

            for(String a:arr_of_t1){
                String temp = Integer.toString(count);
                for(int i = 0; i < a.length(); i++){
                    
                    if(a.charAt(i) == temp.charAt(0)){
                        System.out.print(a +" ");
                        count++;
                    }
                    else{
                        continue;
                    }
                 
                }
            }
        }

        Input.close();
        
    }
}
