package DataTypesAndVariables;

public class C07_ExchangeVariableValues {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("Before:%na = 5%nb = 10%nAfter:%na = %d%nb = %d", a, b);
    }
}
