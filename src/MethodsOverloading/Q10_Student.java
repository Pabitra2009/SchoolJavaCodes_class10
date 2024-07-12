package MethodsOverloading;
import java.util.Scanner;
public class Q10_Student {
    String name;
    int roll;
    double m_hist,m_civ,m_geo,tol,avg;

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the name");
        name=sc.nextLine();
        System.out.println("ENter the roll");
        roll= sc.nextInt();
        System.out.println("ENter the Subjects marks history , civics,geography respectively");
        m_hist=sc.nextDouble();
        m_civ=sc.nextDouble();
        m_geo=sc.nextDouble();
    }

    public void calculate(){
        tol=m_civ+m_hist+m_geo;
        avg=tol/3;
    }

    public void display(){
        if(avg>=40.0)
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
        System.out.println("Total marks"+tol);
        System.out.println("Average ="+avg);
    }
    public static void main(String[] args) {
        Q10_Student obj = new Q10_Student();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

