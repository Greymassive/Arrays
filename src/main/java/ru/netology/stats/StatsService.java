package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > 0) {
                sum = sum + sales[i];
            }

        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > 0) {
                sum = sum + sales[i];
                average = sum / 12;

            }

        }
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;

            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;

            }
        }
        return minMonth + 1;
    }

    public int lowerSales(int[] sales) {
        int lowerMonths = 0;
        StatsService service = new StatsService();
        int average = service.averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                lowerMonths = lowerMonths + 1;
            }
        }
        return lowerMonths;
    }

    public int higherSales(int[] sales) {
        int higherMonths = 0;
        StatsService service = new StatsService();
        int average = service.averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                higherMonths = higherMonths + 1;
            }
        }
        return higherMonths;
    }


}
