public class outer2 {

    static String name = "james";
    
    class inner{

        String name = "peter";

        void show(){
            System.out.println(outer2.name);//james
        }

    }
    public static void main(String[] args){
        outer2.inner t1 = new outer2().new inner();
        t1.show();
    }
}
