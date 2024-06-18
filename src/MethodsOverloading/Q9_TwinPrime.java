package MethodsOverloading;

import java.util.Scanner;

public class Q9_TwinPrime {

    public void input(int x, int y ){
        int n1=x;
        int n2=y;
    }

    public int isTwinPrime(int a,int b)
    {
        Boolean isPrime=true;
        for(int i=0;i<=a;i++){
            if((a%1==0)||(a%a==0))
                isPrime=true;
            break;
        }
        for(int i=0;i<=b;i++){
            if((b%1==0)||(b%b==0))
                isPrime=true;
            break;
        }

        if((b-a)==2)
            return 1;
        else
            return 0;
    }
    // main

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        Q9_TwinPrime obj=new Q9_TwinPrime();
        obj.input(n1,n2);
        int k=obj.isTwinPrime(n1,n2);
        if(k==1) {
            System.out.println("Twin primes are");
        }
        else{
            System.out.println("Not twin prime");
        }
    }
}
