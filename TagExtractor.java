import java.util.*;

public class TagExtractor {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        //String t1 = Input.nextLine();
        String t1 = "<h1>Hello, Readers</h1><par>test</par>";
        System.out.println(t1);

        for(int i = 0; i < t1.length(); i++){

            if(t1.charAt(i) == '<'){
                //(i+2) because if "h" in next location then line break which is incorrect, in <h1> the line will break if (i+1)
                if(t1.charAt(i+2) == 'h'){
                    System.out.println("");
                }
                while(true){
                    if(t1.charAt(i) == '>'){
                        break;
                    }
                    else{
                        i++;
                        continue;
                    }
                }
            }
            if((t1.charAt(i) >= 'a' && t1.charAt(i) <= 'z') || (t1.charAt(i) >= 'A' && t1.charAt(i) <= 'Z')){
                System.out.print(t1.charAt(i) +"");
            }
            else if(t1.charAt(i) == 32){
                System.out.print(" ");
            }
        }
        Input.close();
    }
}
