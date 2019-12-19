package String;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        //datatype [] arrayname = new datatype[size];
        Scanner s=new Scanner(System.in);
        int[] marks = new int[4];
        for(int i=0;i<4;i++)
        {
            System.out.println("enter element");
            marks[i]=s.nextInt();
        }
//        for(int i=0;i<4;i++)
//        {
//            System.out.println(marks[i]);
//        }
        for(int i:marks)//foreach looping,another method for printing
        {
            System.out.println(i);
        }
//        marks[0]=150;//append values
//        marks[1]=145;
//        marks[2]=150;
//        marks[3]=165;
    }
}
