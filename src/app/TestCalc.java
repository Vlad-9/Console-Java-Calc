package app;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class TestCalc {
    double num1;
    double num2;

public TestCalc(){
     num1 = 8;
     num2 = 3;
}

@Test
public void CheckSum(){
   
    input inp = new input(num1,num2,'+');
    double resExpected = num1+num2;
calc calc = new calc();
double resActual =  calc.calculate(inp) ;
assertEquals(resExpected, resActual);
}

@Test
public void CheckSub(){
   
input inp = new input(num1,num2,'-');
double resExpected = num1-num2;
calc calc = new calc();
double resActual =  calc.calculate(inp) ;
assertEquals(resExpected, resActual);

}

@Test
public void CheckMult(){
   
input inp = new input(num1,num2,'*');
double resExpected = num1*num2;
calc calc = new calc();
double resActual =  calc.calculate(inp) ;
assertEquals(resExpected, resActual);

}
}