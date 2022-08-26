public class SalesManager {
    protected int[] sales;


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

    public int caverage() {
        int max1 = -1;
        int min = -1;
        int caver = 0;
        for (int sale : sales) {
            if (sale > max1) {
                max1 = sale;
            } else {
                if (sale < min) {
                    min = sale;
                }
            }
        }

        for (int sale: sales) {
            if (sale > min && sale < max1) {
                caver = caver + sale;
            }
        }
        return caver/ sales.length ;
    }
}
