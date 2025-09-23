package com.codewithram;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public  static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public Employee(int baseSalary){
        this(baseSalary, 1);
    }

    private int getBaseSalary(){
        return  this.baseSalary;
    }
    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary can't be less than or equal to 0");

        this.baseSalary = baseSalary;
    }

    private int getHourlyRate(){
        return this.hourlyRate;
    }
    private void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("hourly Rate can't be less than or equal to 0");
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage(){
        return calculateWage(0);
    }
}
