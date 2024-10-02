public class outer4 {
   static class inner{
        void show(){
            System.out.println("Hello");
        }
    }
    
    public static void main(String[] args){
        outer4.inner t1 = new outer4.inner();
        t1.show();
    }
}
