package Practical_11;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class StudentSupportOffice{
    public static void main(String[] args) {

        Student st1 = new Student("U0000001");
        Student st2 = new Student("U0000002");
        Student st3 = new Student("U0000003");
        Student st4 = new Student("U0000004");
        Student st5 = new Student("U0000005");

        Module c1 = new Module("CIS2344");
        Module c2 = new Module("CIS2360");
        Module c3 = new Module("CIM2130");







        Scanner input = new Scanner(System.in);





        int n;
        System.out.println("Press 1 for Student Details");
        System.out.println("Press 2 for Module Details");
        System.out.println("Press 0 for Exit");
        n = input.nextInt();
        while(n != 0){
            if(n==1){

            }




            System.out.println("Press 1 for Student Details");
            System.out.println("Press 2 for Module Details");
            System.out.println("Press 0 for Exit");
            n = input.nextInt();
        }
    }
}
