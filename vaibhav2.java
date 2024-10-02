public class vaibhav2 {
    public static void main(String[] args){
        int count = 0;

        while(count != 10){
            int array[] = {100,25,19,45,88,27,11};
            int temp = 0;
            for(int i =0; i < array.length; i++){
                while(array[i] != 0){
                    //System.out.println(array[i]);
                    if(array[i]%10 == count){
                        temp++;
                        //System.out.println(count +" = " +temp);
                    }
                    array[i] = array[i]/10;
                    //System.out.print(array[i] +" ");
                }
            }
            System.out.println(count +" = " +temp);
            count++;
        }
    } 
}
