public class Main {
    public static void main (String[] args) {
        // Делить на 0 нельзя, при расчете результа b (x - y) получается 0.
        // Необходимо учесть эту ошибку и учесть при расчете функции деления. Это возможно сделать с помощью
        // операторов try-catch
        try {
            Calculator calc = Calculator.instance.get();

            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);

        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль");
        }
    }
}
