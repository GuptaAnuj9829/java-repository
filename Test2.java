public class Test2 {
    int a = 100; //this will get 2 memory allocated
    static int b = 100; //this will get 1 memory allocated

    public static void main(String[] args){
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();

        
    }
}
