package Constructor;
import java.util.Scanner;
public class Pay_Q2 {

    // Instance variable
    int basic;
    double tax,gross_sallary;

    public Pay_Q2(){
        basic=0;
        tax=0.0;
        gross_sallary=0.0;
    }

    public  void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the basic pay and tax resp.");
        basic=sc.nextInt();
        tax=sc.nextDouble();
    }

    public void compute(){
        gross_sallary=basic-tax;
        System.out.println("Gross Salary is "+gross_sallary);
    }

    public void display(){
        System.out.println("Basic Pay "+ basic +" Tax to be pay="+tax+"Gross Salary"+gross_sallary );
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Pay_Q2 obj=new Pay_Q2();
        obj.input();
        obj.compute();
        obj.display();
    }
}
