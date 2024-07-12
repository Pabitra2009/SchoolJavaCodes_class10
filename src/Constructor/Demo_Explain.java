package Constructor;

import java.util.Scanner;

public class Demo_Explain {

    // Instance Variable
    String name;
    int code;

    // There are two types of Constructor    (i) Default and (ii) Parameterised

    // Default Constructor
    public Demo_Explain(){      // In constructor class name and funtion name will be same

        // In default Constructor always initialise null for string , int = o, double=0.0
        name="";
        code=0;
    }

    // Paremeterised Constructor
    public  Demo_Explain(String n, int c){
        name=n;
        code=c;
    }

    // Member Method
    public void disp(){
        System.out.println(name);
        System.out.println(code);
    }

    public static void main(String[] args) {
        Demo_Explain obj=new Demo_Explain();   // Calling Default Constructor
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name and code");
        String n=sc.nextLine();
        int c= sc.nextInt();
        obj=new Demo_Explain(n,c);   // Calling Parameterised function
        obj.disp()
        ;































































































































































































































    }
}