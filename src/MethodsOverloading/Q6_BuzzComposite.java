package MethodsOverloading;

import java.util.Scanner;

public class Q6_BuzzComposite {

    // Buzz number
    public void fnNum (double  n) {
        if ((n % 7 == 0) || (n%10 == 7)) {
            System.out.println( "Buzz  number");
        } else {
            System.out.println("Not buzz");
        }
    }

    // composite number
    // THe number that is exept prime number

    public void fnNum (int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                sum++;
            }
        }
        if(sum>2)
            System.out.println(" composite" );
        else
            System.out.println("not");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Q6_BuzzComposite obj=new Q6_BuzzComposite();
        System.out.println("Enter a buzz number");
        Double a=sc.nextDouble();
        obj.fnNum(a);
        System.out.println("Enter for composite ");
        int b= sc.nextInt();
        obj.fnNum(b);
    }
}
