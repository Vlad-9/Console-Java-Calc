package app;


import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
       calc Calculator = new calc();
       start(Calculator);
        
    }
    public static void start(calc calc) {
        System.out.println(calc.calculate(new input().setInput()));
        decision(calc);

    }
    public static void decision (calc calc){
        System.out.println("What next? \n 0 - Resume \n 1 - Exit");
        Scanner inp2= new Scanner(System.in);
        int num3;
        num3 = inp2.nextInt();

        if (num3 == 0) {
            start(calc);
        } else {
             System.out.println("Exit");
         }
        
}
}