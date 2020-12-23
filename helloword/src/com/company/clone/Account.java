package com.company.clone;

public class Account implements Cloneable{
    private String no;
    private Double salary;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Account{" +
                "no='" + no + '\'' +
                ", salary=" + salary +
                '}';
    }
}
