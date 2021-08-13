package sda.oop.zadanie2;

import java.math.BigDecimal;

public class Student extends Person{

    private String fieldOfStudy;
    private String yearOfstudy;
    private BigDecimal costOfStudy = new BigDecimal("0.0");


    public Student(String name, String address, String fieldOfStudy, String yearOfstudy, BigDecimal costOfStudy) {
        super(name, address);
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfstudy = yearOfstudy;
        this.costOfStudy = costOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getYearOfstudy() {
        return yearOfstudy;
    }

    public void setYearOfstudy(String yearOfstudy) {
        this.yearOfstudy = yearOfstudy;
    }

    public BigDecimal getCostOfStudy() {
        return costOfStudy;
    }

    public void setCostOfStudy(BigDecimal costOfStudy) {
        this.costOfStudy = costOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fieldOfStudy='" + fieldOfStudy + '\'' +
                ", yearOfstudy='" + yearOfstudy + '\'' +
                ", costOfStudy=" + costOfStudy +
                '}';
    }
}
