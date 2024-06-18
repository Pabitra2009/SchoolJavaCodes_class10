package MethodsOverloading;
import java.util.Scanner;
public class Q5_PerfectAmicable {

    // Perfect number
    int sum=0;
    public int number(int n)
    {
        int a=n;
        for(int i=1;i<n;i++)
        {
            if(n%i==0) {
                sum = sum + i;
            }
        }
        if(n==sum)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
    // Amicable number

    public int number(int a,int b)
    {
        int sum1=0,sum2=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum1=sum+i;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                sum2=sum+i;
            }
        }
        if((sum1==b)&&(sum2==a))
        {
            return 1;
        }
        else {
            return 0;
        }
    }

    // main
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        Q5_PerfectAmicable obj=new Q5_PerfectAmicable();
        int k=obj.number(n);
        if(k==1) {
            System.out.println("Perfect number is" );
        }
        else {
            System.out.println("Not perfect");
        }
        System.out.println("Enter two numbers for Amicable number");
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        int j=obj.number(n1,n2);
        if(j==1)
        {
            System.out.println("Yes Amicable pair");
        }
        else{
            System.out.println("Not amicable");
        }
    }
}
