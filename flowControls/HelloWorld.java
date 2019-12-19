package flowControls;
import java.lang.String;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter a value");
        int no=s.nextInt();
        if(no<0){
            System.out.println("-ve");
        }
        else {
            System.out.println("+ve");
        }

    }
}