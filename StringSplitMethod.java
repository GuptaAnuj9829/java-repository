public class StringSplitMethod {
    public static void main(String[] args){

        String input = "I3 am4 living1 in2 Bhopal5";
        String[] arr_of_input = input.split(" ",0);

        for(int i=1; i<6; i++){

            for(String a:arr_of_input){

                String z = a;
                String[] arr_of_z = z.split("",0);

                for(String b:arr_of_z){ 

                    if((b.charAt(0)>='a' && b.charAt(0)<='z') || (b.charAt(0)>='A' && b.charAt(0)<='Z')){

                        continue;

                    }
                    else{

                        int x=Integer.parseInt(b);

                        if(x == i){

                            System.out.println(z);
                            
                        }
                    }

                }
            
            }
        }


    }
}
