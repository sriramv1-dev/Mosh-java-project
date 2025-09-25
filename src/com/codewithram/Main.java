package com.codewithram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        var employee = new Employee(50_000, 20);
//        var employee2 = new Employee(60_000);
//        int wage = employee.calculateWage(10);
//        System.out.println(wage);
//        System.out.println(employee2.calculateWage());
//        System.out.println(Employee.numberOfEmployees);

        var mortgage = new Mortgage(430_000, 6.5, 30);
       var value = mortgage.calculate();
       var balance = mortgage.calculateBalance(5);
        System.out.println(value);
        System.out.println(balance);



    }
}