package MethodsOverloading;
 import java.util.Scanner;
public class Q7_Swap {

    public void display (int a, int b)
    {
        System.out.println("Before swaping ");
        int x=a;
        int y=b;
        System.out.println("X ="+x+" "+" Y="+y);
        System.out.println("After swap");
        int j=b;
        int k=a;
        System.out.println("X ="+j+" "+" Y="+k);
    }
    public void display (float a, float b)
    {
        System.out.println("Before swaping ");
        float x=a;
        float y=b;
        System.out.println("X ="+a+" "+" Y="+b);
        System.out.println("After swap");
        float j=a;
        float k=b;

        //  Swappin withou third variable
//        a=a+b;
//        b=a-b;
//        a=a-b;
        System.out.println("X ="+a+" "+" Y="+b);
    }

    // main
    public static void main(String[] args) {
        Q7_Swap obj =new Q7_Swap();   // object creation
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for Integer");
        int x= sc.nextInt();
        int y=sc.nextInt();
        obj.display(x,y);
        System.out.println("Enter two numbers for float");
        float j=sc.nextFloat();
        float k=sc.nextFloat();
        obj.display(j,k);

    }
}
