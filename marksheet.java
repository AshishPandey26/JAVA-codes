import java.util.*;
public class marksheet{
    public static void main(String[] args){
        System.out.print("enter roll no: ");
        Scanner sc = new Scanner(System.in);
        int rollno = sc.nextInt();
        
        System.out.print("enter name: ");
        Scanner sc2 = new Scanner(System.in);
        String name = sc2.next();
        

        System.out.print("enter name of subject: ");
        Scanner sc4 = new Scanner(System.in);
        String subject = sc4.next();
       

        System.out.print("enter marks: ");
        Scanner sc3 = new Scanner(System.in);
        int marks = sc3.nextInt();

        System.out.print("Roll No: ");
        System.out.println(rollno);
        System.out.print("Name: ");
        System.out.println(name);
        System.out.print("Subject: ");
        System.out.println(subject);
        System.out.print("marks: ");
        System.out.println(marks);

        
    }
}