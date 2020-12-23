package com.company.clone;

public class Employee implements Cloneable{
    private String name;
    private Account account = new Account();

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee employee = (Employee)super.clone();
        employee.account = (Account) account.clone();
        return employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
