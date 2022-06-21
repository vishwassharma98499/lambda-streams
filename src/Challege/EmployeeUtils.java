package Challege;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

    public String getFullName(Employee employee) {
        Function<Employee, String> fullName =
                (employee1) -> employee1.getFirstname() + " " + employee1.getLastname();
        return fullName.apply(employee);
    }

    public String getManagersLastName(Employee employee) {
        Function<Employee, String> managersLastName = (employee1) -> employee1.getManage().getLastname();
        return managersLastName.apply(employee);
    }

    public boolean hasEmployeeInEmploymentLongerThanFiveYears(Employee employee) {
        Predicate<Employee> employmentTime = (e) -> e.getYearsOfService() > 5;
        return employmentTime.test(employee);
    }

    public boolean hasMoreThanThreeDirectReports(Employee employee){
        Predicate<Employee> directReport = (e) -> e.getNumberOfDirectReports() > 3;
        return directReport.test(employee);
    }

    public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee){
        Predicate<Employee> findEmployee = (e) -> e.getYearsOfService() > 3 && e.getNumberOfDirectReports() < 2;
        return findEmployee.test(employee);
    }
}
