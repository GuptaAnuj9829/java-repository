//local inner class


public class outer3 {

    void display(){

        class inner{

            void show(){

                System.out.println("hello");

            }

        }
        inner t2 = new inner();
        t2.show();

    }

    public static void main(String[] args){

        outer3 t1 = new outer3();
        t1.display();
    }
}
