public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator() {
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.secondNumber * this.firstNumber;
    }

    public double getDivisionResult() {
        if(this.secondNumber == 0) {
            return 0;
        } else
            return this.firstNumber / this.secondNumber;

    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(300);
        calculator.setSecondNumber(200);
        double result = calculator.getSubtractionResult();
        System.out.println(result);

    }

}