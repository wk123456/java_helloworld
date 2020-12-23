package com.company.clone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee = new Employee();
        employee.setName("wang");
        Employee employeeClone = employee.clone();
        employee.setName("li");
        employeeClone.getAccount().setNo("1000000");
        employeeClone.getAccount().setSalary(100000d);
        System.out.println(employee);
        System.out.println(employeeClone);
    }
}
