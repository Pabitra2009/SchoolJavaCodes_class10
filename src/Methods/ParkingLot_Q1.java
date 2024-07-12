package Methods;

import java.util.Scanner;

public class ParkingLot_Q1 {

    int Vno,hrs;
    double bill;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Vehicle and hours");
        Vno=sc.nextInt();
        hrs=sc.nextInt();
    }

    void calculate(){
        bill=hrs;
    }

    void display(){
        System.out.println("Vehicle num "+Vno);
        System.out.println("Hours"+hrs);
        System.out.println("Bill "+bill);
    }

    public static void main(String[] args) {
        ParkingLot_Q1 obj = new ParkingLot_Q1();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
