public class outer1 {

    String name = "james";
    
    class inner{

        String name = "peter";

        void show(String name){
            System.out.println(name);//payal
            System.out.println(this.name);//peter
            System.out.println(outer1.this.name);//james
        }

    }
    public static void main(String[] args){
        outer1.inner t1 = new outer1().new inner();
        t1.show("payal");
    }
}
