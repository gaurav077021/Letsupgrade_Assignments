/*Question 2: Define a class Student with following members:

        int roll, String name, float marks.

        input() to take input of the details

        display() to all details of a student.

        Write a program to which will store details of a student and print the details using the above class. */


import java.util.Scanner;
public class Student
{

    static String  name;
    static int rollNo;
    static float marks;
    
    public static void main(String[] args) 
    {
    input();
    dispaly();
    }
        public static void input()
        {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name of Student: ");
        name = in.nextLine(); 
        System.out.println("Enter the Roll no. of Student: ");
        rollNo = in.nextInt();
        System.out.println("Enter the Marks of Student: ");
        marks = in.nextFloat();
        }
        public static void dispaly(){
            System.out.println("The details of the student you have entered are: ");
            System.out.println("Name : "+name);
            System.out.println("Roll No. : "+name);
            System.out.println("Marks : "+marks);
        }
}