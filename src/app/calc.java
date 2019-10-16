package app;
import java.util.Scanner;

public class calc {
   
    public static double calculate(input inp)
    {
        
        double ans=0;
        char choose ;
        
        choose = inp.getOperator();
 
        switch (choose){
            case 't':
            ans = tan( inp);
            break;
        case 'c':
            ans = cos( inp);
            break;
        case 's':
            ans = scalb( inp);
            break;
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
        case '^':
        ans = pow( inp);
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
    public static double scalb(input inp)
    {
        double result =  Math.scalb(inp.getNum1(), (int) inp.getNum2());
        return result;
    } 
    public static double cos(input inp)
    {
        double result = (double) Math.cos(inp.getNum1());
        return result;
    }
    public static double tan(input inp)
    {
        double result = (double) Math.tan(inp.getNum1());
        return result;
    }
    }

