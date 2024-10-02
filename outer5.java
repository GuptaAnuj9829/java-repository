public class outer5 {

    static class inner{
        
        static void show(){

            System.out.println("Hello");
        
        }
    
    }

    public static void main(String[] args){

        outer5.inner.show();
        
    }
}
