package MethodsOverloading;
import java.util.Scanner;
public class Q4_Pattern {

    int c=1; // Global variable / Instance variable
   /* 1 2 3 4 5
      6 7 8 9
      10 11 12
      13 14
      15*/
    public void  pat(int n){

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    public void pat(char c){
        int k=(int)c;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)c);
                c++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q4_Pattern onj= new Q4_Pattern();
        System.out.println("Enter for first pattern");
        int n=sc.nextInt();
        onj.pat(n);
        System.out.println("Enter for second pattern");
        char n1=sc.next().charAt(0);
        onj.pat(n1);

    }

}
