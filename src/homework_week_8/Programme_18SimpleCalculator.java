package homework_week_8;

/**
 * Write a class with the name SimpleCalculator.
 * The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of adding the field
 * values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result of
 * multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of dividing the
 * field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 */

public class Programme_18SimpleCalculator {
    double firstNumber;
    double secondNUmber;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNUmber(){
        return this.secondNUmber;
    }

    public void setFirstNumber(double fN){
        this.firstNumber = fN;
    }

    public void setSecondNumber(double sN){
        this.secondNUmber = sN;
    }

    public double getAdditionResult(){
        return (this.firstNumber + this.secondNUmber);
    }

    public double getSubtractionResult(){
        return (this.firstNumber - this.secondNUmber);
    }

    public double getMultiplicationResult(){
        return (this.firstNumber * this.secondNUmber);
    }

    public double getDivisionResult() {
        if (this.secondNUmber != 0) {
            return (this.firstNumber + this.secondNUmber);
        }
        return 0;
    }
    public static void main(String[] args) {
        Programme_18SimpleCalculator calculator = new Programme_18SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
