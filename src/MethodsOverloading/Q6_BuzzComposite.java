package MethodsOverloading;

import java.util.Scanner;

public class Q6_BuzzComposite {

    // Buzz number
    public int fnNum(int a) {
        if ((a % 7 == 0) || (a%10 == 7)) {
            return 1;
        } else {
            return 0;
        }
    }

    // composite number
    public int composite (int a)
    {
        int sum=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0){
                sum=sum+i;
            }
        }
        if(sum>=2)
        {
            return 0;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a buzz number");
        Q6_BuzzComposite obj=new Q6_BuzzComposite();
        int n= sc.nextInt();
        int k=obj.fnNum(n);
        if(k==1) {
            System.out.println("It is a buzz number");
        }
        else {
            System.out.println("t is not a buzz number");
        }

        System.out.println("Enter for composite number");
        int n1=sc.nextInt();
        int j=obj.composite(n1);
        if(j==1)
            System.out.println("Composite no");
        else
            System.out.println("Not composite");

    }
}
