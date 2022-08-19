public class SalesManager {
    protected int[] sales = {100, 200, 400, 500, 600, 500, 700, 600, 300, 200, 300, 400};


    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}