public class outer {
    class inner{
        void show(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args){
        outer.inner t1 = new outer().new inner();
        t1.show();
    }
}
