package com.codewithram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int principal = (int)Console.readNumber("Principal", 1000, 1_000_000);
        float annualInterest = (float)Console.readNumber("Annual Interest", 1, 10);
        byte period = (byte)Console.readNumber("Period", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, period);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }
}