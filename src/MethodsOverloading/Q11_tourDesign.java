package MethodsOverloading;
import java.util.Scanner;
public class Q11_tourDesign {
    int pass_num,age ;   // to store the passengers number   // passsengers age;
    double ticket_amt, disc   ;      // discount of the ticket;
    String name;
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the passengers name");
        name = sc.nextLine();
        System.out.println("Input the passengers number");
        pass_num = sc.nextInt();
        System.out.println("Input the passengers age");
        age = sc.nextInt();
        System.out.println("Input the passengers price");
        ticket_amt=sc.nextDouble();

    }

     public void Discount() {
         if (age >= 60) {
             disc = ticket_amt * (50.0 / 100.0);
         } else if (age < 13) {
             disc  = ticket_amt * (40.0 / 100.0);
         }
     }

     public void display() {
         System.out.println("Passengers name is"+name);
         System.out.println("Passengers number is"+pass_num);
         System.out.println("Passengers age is"+age);
         System.out.println("Passengers ticket price is"+ticket_amt);
         System.out.println("Passengers discount is"+disc);
     }

    public static void main(String[] args) {
        Q11_tourDesign obj=new Q11_tourDesign();
        obj.accept();
        obj.Discount();
        obj.display();
    }
}
