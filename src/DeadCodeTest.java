public class DeadCodeTest {

    public static void main(String[] args) {
        DeadCodeTest test = new DeadCodeTest();

        int sum = test.add(10, 20);
        System.out.println("Add Result = " + sum);

        int mul = test.multiply(5, 3);
        System.out.println("Multiply Result = " + mul);

        System.out.println("Program finished.");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("divide by zero");
        }
        return a / b;
    }

    private void hiddenLogic() {
        System.out.println("This is never executed.");
    }
}
