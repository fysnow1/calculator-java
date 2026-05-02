public class CalculatorTest {

    public static void main(String[] args) {
        testSimpleAddition();
    }

    public static void testSimpleAddition() {
        String input = "4+5";
        String expected = "9.0";

        String result = Calculator.Run(input);

        if (result.equals(expected)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + result);
        }
    }
}