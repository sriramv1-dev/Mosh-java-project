package com.codewithram;

public class MortgageCalculator {
    final static int MONTHS_IN_YEAR = 12;
    final static int PERCENT = 100;
    private int principal;
    private float annualInterest;
    private byte period;

    public MortgageCalculator(
            int principal,
            float annualInterest,
            byte period
    ){
        setPrincipal(principal);
        setAnnualInterest(annualInterest);
        setPeriod(period);
    }

    public void setPrincipal(int principal) {
        if(principal < 1000 || principal > 1_000_000)
            throw new IllegalArgumentException("principal must be between ($1K - $1M)");
        this.principal = principal;
    }

    public void setAnnualInterest(float annualInterest) {
        if(annualInterest < 1 || annualInterest > 10)
            throw new IllegalArgumentException("annualInterest must be between (1 and 10)");
        this.annualInterest = annualInterest;
    }

    public void setPeriod(byte period) {
        if(period < 1 || period > 30)
            throw new IllegalArgumentException("period must be between (1 and 30)");
        this.period = period;
    }

    public double calculateMortgage()
    {
        short numberOfPayments = (short)(period * MONTHS_IN_YEAR);
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        double common = Math.pow((1+monthlyInterest),numberOfPayments);
        double numerator = principal *  monthlyInterest * common;
        double denominator = common -1;

        return numerator/denominator;
    }


    public double calculateBalance(short numberOfPaymentsMade){
        int numberOfPayments = period * MONTHS_IN_YEAR;
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest,numberOfPaymentsMade ))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1 );
    }

    public short getPeriod() {
        return period;
    }
}
