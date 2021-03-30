
import java.util.*;
public class if_else{
    public static void main(String[]args){
        //int age = 10;
        byte physics_marks, chemistry_marks, maths_marks, biology_marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Physics marks : ");
        physics_marks = sc.nextByte();
        System.out.println("Please enter your Chemistry marks : ");
        chemistry_marks = sc.nextByte();
        System.out.println("Please enter your Maths marks : ");
        maths_marks = sc.nextByte();
        System.out.println("Please enter your Biology marks : ");
        biology_marks = sc.nextByte();
        float average = (physics_marks + chemistry_marks + maths_marks + biology_marks) / 4.0f ;
        if(average >= 33 && physics_marks>=33 && chemistry_marks>=33 && biology_marks>=33){
            System.out.println("Your overall percentage is : "+average);
            System.out.println("Congratulations, You are being promoted!!!");
        }
        else{
            System.out.println("Your overall percentage is : "+average);
            System.out.println("Better luck next time!!!");
        }
        sc.close();
    }
}