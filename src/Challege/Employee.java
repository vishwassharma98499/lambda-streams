package Challege;

import java.util.Objects;

public class Employee {

    private String firstname;
    private String lastname;
    private int yearsOfService;
    private Employee manage;
    private int numberOfDirectReports;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public Employee getManage() {
        return manage;
    }

    public void setManage(Employee manage) {
        this.manage = manage;
    }

    public int getNumberOfDirectReports() {
        return numberOfDirectReports;
    }

    public void setNumberOfDirectReports(int numberOfDirectReports) {
        this.numberOfDirectReports = numberOfDirectReports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return yearsOfService == employee.yearsOfService && numberOfDirectReports == employee.numberOfDirectReports && Objects.equals(firstname, employee.firstname) && Objects.equals(lastname, employee.lastname) && Objects.equals(manage, employee.manage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, yearsOfService, manage, numberOfDirectReports);
    }
}
