package com.company.hw17.internetMarket;

import java.io.IOException;
import java.io.PrintWriter;

class BuyingReport {
    static void buyingReport(Basket basket) {
        int x = 1;
        try (PrintWriter pw = new PrintWriter("src/com/company/hw17/internetMarket/io/buyingReport.txt")) {
            for (Product i : basket.getProductSet()) {
                pw.printf("%s. %-12s %s \n", x, i.getName(), i.getPrice());
                x++;
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
