import java.util.Scanner;

public class moser_circle {
    public static void main(String[] args){

        Scanner Input = new Scanner(System.in);

        System.out.println("How many vertexes?");
        int vertexes = Input.nextInt() + 1;

        int regions = 1 + ((vertexes*(vertexes-1))/2) + ((vertexes*(vertexes-1)*(vertexes-2)*(vertexes-3))/(4*3*2));

        System.out.println("Total number of regions are: " +regions);

        Input.close();
    }
}
