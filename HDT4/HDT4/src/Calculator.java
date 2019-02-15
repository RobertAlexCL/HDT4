
public class Calculator implements icalculator {

    private static Calculator calculator;

    private Calculator(){

    }

    public static Calculator getCalculatorInstance(){
        if (calculator==null){
            calculator =new Calculator();
        }
        return calculator;
    }

    @Override
    protected Calculator clone() {
        try {
            throw new CloneNotSupportedException();
        }  catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double restar(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double multiplicacion(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double division(double num1, double num2) {
        return Math.round((num1*num2)*1000)/1000;
    }
}
