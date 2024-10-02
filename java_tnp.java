public class java_tnp {

    void show(){
        //Instace Method
        System.out.println("Hello");
    }
    static void display(){
        //Static Method
        System.out.println("Hi");
    }
    public static void main(String[] args){
        //Static Method
        System.out.println("Bye");
        java_tnp t = new java_tnp();
        t.show(); //named object calling
        new java_tnp().show(); //nameless object calling
        display(); //static method can be called by other static methods.
    }
    
}
