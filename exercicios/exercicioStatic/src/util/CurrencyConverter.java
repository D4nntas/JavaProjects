package util;

public class CurrencyConverter {

    public static double converter(Double dollarPrice, Double bought){
        return dollarPrice * bought ;
};  

    public static double IOF(double dollar){
        return (dollar * 0.06) + dollar;
};
};
