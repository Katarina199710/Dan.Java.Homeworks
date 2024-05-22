package hw10.task2;

public class ArrayProcessorMain {
    public static void main(String[] args) {
        try {
            double result = ArrayProcessor.processArray();
            System.out.println("Result: " + result);
        } catch (InvalidIndexException | DivideByZeroException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
