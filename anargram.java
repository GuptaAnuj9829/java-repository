import java.util.*;

public class anargram {
    public static void main(String[] args){

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the two strings:");
        String s1 = Input.next();
        String s2 = Input.next();

        String t1 = s1.toLowerCase();
        String t2 = s2.toLowerCase();

        if(t1.length() != t2.length()){
            System.out.println("Not Anagrams");
        }
        else{
            
            String[] arr_of_t1 = t1.split("",0);
            String[] arr_of_t2 = t2.split("",0);

            Arrays.sort(arr_of_t1);
            Arrays.sort(arr_of_t2);

            int n = arr_of_t1.length;
            int check = 1;

            for (int i = 0; i < n; i++)
            {
                if (!arr_of_t1[i].equals(arr_of_t2[i])) {
                    check = 0;
                }
            }

            if(check == 0){
                System.out.println("Not Anagrams");
            }
            else{
                System.out.println("Anagrams");
            }
        }

        Input.close();
    }
}
