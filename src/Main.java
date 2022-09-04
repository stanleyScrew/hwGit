import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static final long SIZE = 11;

    public static void main(String[] args) {
        long[] volume = {100, 200, 400, 500, 600, 500, 700, 600, 300, 200, 300, 400};
        SalesManager salesManager = new SalesManager(volume);
        long max = salesManager.max();
        System.out.println("Максимальное значение продаж = " + max);
        long caver1 = salesManager.getAverageSales();
        System.out.println("Обрезанное среднее = " + caver1);
    }
}
