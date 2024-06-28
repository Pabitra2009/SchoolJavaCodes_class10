package Constructor;
import java.util.Scanner;
public class Park_Q2 {
    double EntryFee ,discount,amount;
    int age;
    public Park_Q2(){     // Constructor..
        EntryFee=0.0;
        discount=0.0;
        amount=0.0;
         age=0;
    }

    public void input(){   // Member Method
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Entry fee and age ");
        EntryFee=sc.nextDouble();
         age= sc.nextInt();
    }

    public void calculate(){  // Member Method
        if(age<=12)
            discount=EntryFee*(double)45/100;
        else if(age>=15)
            discount=EntryFee*(double)50/100;
        else
            discount=EntryFee*(double)10/100;
    }

    public void display(){ // Member Method
        System.out.println("Entry fee "+EntryFee);
        System.out.println("Discount is "+discount);
        System.out.println("age is"+age);
        System.out.println("Total "+discount);
    }

    public static void main(String[] args) {
        Park_Q2 obj =new Park_Q2();
        obj.input();
        obj.calculate();
        obj.display();
    }

}
