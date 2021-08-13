package sda.zadanie2;

import java.math.BigDecimal;

public class Lecturer extends Person{

    private String specialization;
    private BigDecimal salary = new BigDecimal("0");


    public Lecturer(String name, String address, String specialization, BigDecimal salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}
