package app;
import java.util.Scanner;

public class input {
    public  char char1;
    public double  num1;
    public double  num2;
    
    public input(char c) {
        char1 = c;
    }
    public input() {
       
    }
    public input setInput(){
        input inp = new input();
        inp.setNum1();
        inp.setNum2();
        inp.setOperator();
        return inp;
    }
    public input(double numm1, double numm2, char c) {
        num1=numm1;
        num2=numm2;
        char1 = c;
	}

	public  char getOperator()
    {
        return char1;
    }
    public  void setOperator()
    {
        System.out.println("Enter operation");
        Scanner inp= new Scanner(System.in);
        char1 = inp.next().charAt(0);
      
    }
    public  double getNum1()
    {
        return num1;
    }
    public  double getNum2()
    {
        return num2;
    }
    public  void setNum1()
    {
        System.out.println("Enter first  number:");
        Scanner inp= new Scanner(System.in);
        num1 = inp.nextDouble();

      
    }
    public  void setNum2()
    {
        System.out.println("Enter second  number:");
        Scanner inp= new Scanner(System.in);
        num2 = inp.nextDouble();
      
    }
}
    