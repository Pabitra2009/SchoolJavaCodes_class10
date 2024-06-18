package MethodsOverloading;
import java.util.Scanner;
public class Q4_Pattern {
    public void  pat(int n){
        for(int i=n;i>=0;i--)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q4_Pattern onj= new Q4_Pattern();
        System.out.println("Enter");
        int n=sc.nextInt();
        onj.pat(n);

    }

}
