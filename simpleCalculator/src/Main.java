public class Main {
    public static void main(String[] args) {
    simpleCalculator calculator = new simpleCalculator();
calculator.setFirstNumber(5);
calculator.setSecondNumber(10);
        System.out.println("get addition result = "+calculator.getAdditionResult());
        System.out.println("get subtraction result = "+calculator.getSubtractionResult());
        System.out.println("get multiplication result = "+calculator.getMultiplicationResult());
        System.out.println("get Division result = "+calculator.getDivisionResult());
    }
}
