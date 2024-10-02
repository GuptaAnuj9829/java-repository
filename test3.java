public class test3 {
    test3(int a){
        int b = 20;
        System.out.println((a+b));
    }
    void temp(){
        System.out.print("null");
    }
    public static void main(String[] args){
        test3 t1 = new test3(20);
        t1.temp();
    }
}

//here a is a local variable of test3 method

