package app;
import java.util.Scanner;

public class calc {

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
         case 'l':
        ans = log( inp);
            break; 
        case '*':
        ans = mult( inp);
            break;
        case '/':
        ans = div( inp);
            break;
        case '^':
        ans = pow(inp);
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
    public static double log(input inp)
    {
        double result =  Math.log(inp.getNum1());
        return result;
    }
    public static double pow(input inp)
    {
        double result = (double) Math.pow(inp.getNum1(), inp.getNum2());
        return result;
    }
   
    }

