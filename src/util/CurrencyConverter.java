package util;

public class CurrencyConverter {
    public static double converter(double dollarPrice, double dollarBought){
        double totalDollar = dollarPrice * dollarBought;
        return totalDollar + (totalDollar * 0.06);
    }
}
