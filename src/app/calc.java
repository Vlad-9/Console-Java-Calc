package app;
import java.util.Scanner;

public class calc {
   /* public static void calculate()
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
       //input inp = new input();
       //inp = inp.setInput();
       
       
        char choose ;
        operator op1 = new operator();
        choose = op1.getOperator();
 
        switch (choose){
        case '+':
            System.out.println(add( num1,num2));
            break;
        case '-':
            System.out.println(sub( num1,num2));
            break;      
        case '*':
            System.out.println(mult( num1,num2));
            break;
        case '/':
            System.out.println(div( num1,num2));
            break;
        case '%':
            System.out.println(mod( num1,num2));
            break;
            default:
                System.out.println("Wrong Operation");

        }
     
    }*/

    public static double calculate(input inp)
    {
        
        double ans=0;
        char choose ;
        
        choose = inp.getOperator();
 
        switch (choose){
        case '+':
            ans = add( inp);
            break;
        case '-':
        ans = sub( inp);
            break;      
        case '*':
        ans = mult( inp);
            break;
        case '/':
        ans = div( inp);
            break;
        case '%':
        ans = mod( inp);
            break;
            default:
                System.out.println("Wrong Operation");

        }
     return ans;
    }

    public static double add(input inp)
    {
        double result = inp.getNum1() + inp.getNum2();
        return result;
    }
    public static double sub(input inp)
    {
        double result = inp.getNum1()-inp.getNum2();
        return result;
    }
    public static double mult(input inp)
    {
        double result = inp.getNum1()*inp.getNum2();
        return result;
    }
    public static double div(input inp)
    {
        double result = inp.getNum1()/inp.getNum2();
        return result;
    }
    public static double mod(input inp)
    {
        double result = inp.getNum1()%inp.getNum2();
        return result;
    }
   
    }

