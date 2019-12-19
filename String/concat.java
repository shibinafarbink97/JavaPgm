package String;
import java.lang.String;
import java.util.Scanner;

public class concat {
    public static void main(String[] args){
        //String s1 =new String("luminar");
        //          s1.concat("technolab");here s1 will not work,we want to declare a referance here
//        s1 = s1.concat("technolab");
//        System.out.println(s1);
        //String s2 =new String("luminar");

        String s1="luminar";//String litterals
        String s2="luminar";
        if(s1.equals(s2)) //here string value compare
        //if(s1==s2) //here == meant for references comparison
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
}
