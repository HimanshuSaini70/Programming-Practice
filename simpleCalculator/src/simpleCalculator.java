public class simpleCalculator {
private double firstNumber;
private double secondNumber;

public double getFirstNumber(){
    return this.firstNumber;
}
public double getSecondNumber(){
    return this.secondNumber;
}
public void setFirstNumber(double number){
    this.firstNumber=number;
}
public void setSecondNumber(double number){
    this.secondNumber = number;

}
public double getAdditionResult(){
    double sum = this.firstNumber+this.secondNumber;
    return sum;
}
    public double getSubtractionResult(){
        double Subtraction =this.secondNumber -this.firstNumber;
        return Subtraction;
    }
    public double getMultiplicationResult(){
        double Multiplication = this.firstNumber*this.secondNumber;
        return Multiplication;
    }
    public double getDivisionResult(){
    if (secondNumber==0){
        return 0;
    }
        double Division = this.firstNumber/this.secondNumber;
        return Division;
    }


}
