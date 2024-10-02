public class vaibhav {
    public static void main(String[] args) {
        int array[]={100,25,19,45,88,27,11};
        int[] digit = new int[10];
        /*int count = 0;
        while (count!=10) {


            
        }*/ for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            while (temp !=0) {
                int rem = temp%10;
                digit[rem]++;
                temp=temp/10;
                
            }
            for (int j = 0; j < digit.length; j++) {
                System.out.println(i+" : "+digit[i]);
                
            }
            
        }
    }
    
}
