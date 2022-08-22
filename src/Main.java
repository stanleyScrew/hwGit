import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static final int SIZE = 11;
    public static void main(String[] args) {
       int[] volume = {100, 200, 400, 500, 600, 500, 700, 600, 300, 200, 300, 400};
       SalesManager salesManager = new SalesManager(volume);
       int max = salesManager.max();;
       System.out.println(max);
       }
    }
