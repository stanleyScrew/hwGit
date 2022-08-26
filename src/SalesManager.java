public class SalesManager {
    protected long[] sales;


    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long caverage() {
        long max1 = -1;
        long min = -1;
        long caver = 0;
        for (long sale : sales) {
            if (sale > max1) {
                max1 = sale;
            } else {
                if (sale < min) {
                    min = sale;
                }
            }
        }

        for (long sale: sales) {
            if (sale > min && sale < max1) {
                caver = caver + sale;
            }
        }
        return caver/ sales.length ;
    }
}
